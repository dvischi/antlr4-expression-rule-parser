/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.dvischi.expr_rule_parser.ExprRuleParser.FuncDefStmtContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.RuleStmtContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.StmtContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.StmtsContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.VarDefStmtContext;
import io.github.dvischi.expr_rule_parser.expressions.Expression;

/**
 * A concrete implementation of the {@link ExtendedExprRuleParserBaseVisitor} which implements
 * all statements related visitor methods.
 * 
 * Note: The visitor returns a list of rules which are collected while traversing the
 *       rule statements. The variable and function definition statements are only used
 *       internally for resolving the rule expressions.
 */
public class StatementsVisitor extends ExtendedExprRuleParserBaseVisitor<List<Rule<?>>> {
	public StatementsVisitor() {
		super();
	}
	
	public StatementsVisitor(SymbolTable symbolTable) {
		super(symbolTable);
	}
	
	@Override
	public List<Rule<?>> visitStmts(StmtsContext ctx) {
		logContext(ctx, false);
		
		List<Rule<?>> rules = new ArrayList<Rule<?>>();
		for (StmtContext stmtCtx : ctx.stmt()) {
			rules.addAll(visitStmt(stmtCtx));
		}
		return rules;
	}
	
	@Override
	public List<Rule<?>> visitStmt(StmtContext ctx) {
		logContext(ctx, false);
		return visit(ctx.getChild(0));
	}
	
	@Override
	public List<Rule<?>> visitVarDefStmt(VarDefStmtContext ctx) {
		logContext(ctx, true);
		
		Expression<?> definition = new ExpressionVisitor(symbolTable).visitBaseExpr(ctx.baseExpr());
		
		VariableSymbol varSymbol = new VariableSymbol(ctx.varName.getText(), definition);
		symbolTable.addGlobalSymbol(varSymbol);
		return new ArrayList<Rule<?>>();
	}
	
	@Override
	public List<Rule<?>> visitFuncDefStmt(FuncDefStmtContext ctx) {
		logContext(ctx, true);
		
		// Note: we only store ctx within the symbol table at this time.
		//       the traversal of ctx happens during the function call when we have all required parameters.
		
		FunctionSymbol funcSymbol = new FunctionSymbol(ctx.funcName.getText(), ctx);
		symbolTable.addGlobalSymbol(funcSymbol);
		return new ArrayList<Rule<?>>();
	}
	
	@Override
	public List<Rule<?>> visitRuleStmt(RuleStmtContext ctx) {
		logContext(ctx, true);
		
		Expression<?> condition = new ExpressionVisitor(symbolTable).visitBaseExpr(ctx.baseExpr());
		
		Rule<?> rule = null;
		switch (condition.getType().getSimpleName()) {
		case "String":
			rule = new Rule<String>(ctx.ruleName.getText(), castToStringExpression(condition));
			break;
		case "Integer":
			rule = new Rule<Integer>(ctx.ruleName.getText(), castToIntegerExpression(condition));
			break;
		case "Boolean":
			rule = new Rule<Boolean>(ctx.ruleName.getText(), castToBooleanExpression(condition));
			break;
		case "List":
			rule = new Rule<List<?>>(ctx.ruleName.getText(), castToListExpression(condition));
			break;
		default:
			throw new RuntimeException(String.format("Found rule expression with unknown return type '%s'!", condition.getType().getSimpleName()));
		}
		return Arrays.asList(rule);
	}
}

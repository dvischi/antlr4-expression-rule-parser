/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.antlr.v4.runtime.tree.TerminalNode;

import io.github.dvischi.expr_rule_parser.ExprRuleParser.AddExprContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.AndExprContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.BaseExprContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.ListContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.ListItemContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.LiteralContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.MulExprContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.NotExprContext;
import io.github.dvischi.expr_rule_parser.ExprRuleParser.RelExprContext;
import io.github.dvischi.expr_rule_parser.expressions.Add;
import io.github.dvischi.expr_rule_parser.expressions.And;
import io.github.dvischi.expr_rule_parser.expressions.Contains;
import io.github.dvischi.expr_rule_parser.expressions.ContainsAll;
import io.github.dvischi.expr_rule_parser.expressions.Div;
import io.github.dvischi.expr_rule_parser.expressions.Equals;
import io.github.dvischi.expr_rule_parser.expressions.Expression;
import io.github.dvischi.expr_rule_parser.expressions.GreaterThan;
import io.github.dvischi.expr_rule_parser.expressions.LessThan;
import io.github.dvischi.expr_rule_parser.expressions.Literal;
import io.github.dvischi.expr_rule_parser.expressions.Mul;
import io.github.dvischi.expr_rule_parser.expressions.Not;
import io.github.dvischi.expr_rule_parser.expressions.Or;
import io.github.dvischi.expr_rule_parser.expressions.Sub;

/**
 * A concrete implementation of the {@link ExtendedExprRuleParserBaseVisitor} which implements
 * all expression related visitor methods.
 */
public class ExpressionVisitor extends ExtendedExprRuleParserBaseVisitor<Expression<?>> {
	public ExpressionVisitor() {
		super();
	}
	
	public ExpressionVisitor(SymbolTable symbolTable) {
		super(symbolTable);
	}
	
	@Override
	public Expression<?> visitBaseExpr(BaseExprContext ctx) {
		logContext(ctx, true);
		
		if (ctx.OR().size() == 0) {
			return visitAndExpr(ctx.andExpr(0));
		}
		
		Expression<Boolean> orExpr = castToBooleanExpression(visitAndExpr(ctx.andExpr(0)));
		for (int i = 1; i < ctx.andExpr().size(); i++) {
			Expression<Boolean> rhs = castToBooleanExpression(visitAndExpr(ctx.andExpr(i)));
			orExpr = new Or(orExpr, rhs);
		}
		return orExpr;
	}
	
	@Override
	public Expression<?> visitAndExpr(AndExprContext ctx) {
		logContext(ctx, true);
		
		if (ctx.AND().size() == 0) {
			return visitNotExpr(ctx.notExpr(0));
		}
		
		Expression<Boolean> andExpr = castToBooleanExpression(visitNotExpr(ctx.notExpr(0)));
		for (int i = 1; i < ctx.notExpr().size(); i++) {
			Expression<Boolean> rhs = castToBooleanExpression(visitNotExpr(ctx.notExpr(i)));
			andExpr = new And(andExpr, rhs);
		}
		return andExpr;
	}
	
	@Override
	public Expression<?> visitNotExpr(NotExprContext ctx) {
		logContext(ctx, true);
		
		if (ctx.NOT() == null) {
			return visitRelExpr(ctx.relExpr());
		}
		
		if (ctx.notExpr() != null) {
			return new Not(castToBooleanExpression(visitNotExpr(ctx.notExpr())));
		} else {
			return new Not(castToBooleanExpression(visitRelExpr(ctx.relExpr())));
		}
	}
	
	@Override
	public Expression<?> visitRelExpr(RelExprContext ctx) {
		logContext(ctx, true);
		
		if (ctx.relOpr() == null) {
			return visitAddExpr(ctx.addExpr(0));
		}

		Expression<?> lhs = visitAddExpr(ctx.addExpr(0));
		Expression<?> rhs = visitAddExpr(ctx.addExpr(1));
		switch (getTokenType(ctx.relOpr(), 0)) {
		case ExprRuleParser.GT:
			return new GreaterThan(castToIntegerExpression(lhs), castToIntegerExpression(rhs));
		case ExprRuleParser.LT:
			return new LessThan(castToIntegerExpression(lhs), castToIntegerExpression(rhs));
		case ExprRuleParser.EQUAL:
			return new Equals(lhs, rhs);
		case ExprRuleParser.NOTEQUAL:
			return new Not(new Equals(lhs, rhs));
		case ExprRuleParser.CONTAINS:
			return new Contains(castToListExpression(lhs), rhs);
		case ExprRuleParser.CONTAINSALL:
			return new ContainsAll(castToListExpression(lhs), castToListExpression(rhs));
		case -1:
			throw new RuntimeException("Expected relOpr is missing!");
		default:
			throw new RuntimeException(String.format("Unknown relOpr type '%s' found!", getTokenType(ctx.relOpr(), 0)));
		}
	}
	
	@Override
	public Expression<?> visitAddExpr(AddExprContext ctx) {
		logContext(ctx, true);
		
		if (ctx.addOpr().size() == 0) {
			return visitMulExpr(ctx.mulExpr(0));
		}
		
		Expression<Integer> addExpr = castToIntegerExpression(visitMulExpr(ctx.mulExpr(0)));
		for (int i = 1; i < ctx.mulExpr().size(); i++) {
			Expression<Integer> rhs = castToIntegerExpression(visitMulExpr(ctx.mulExpr(i)));
			switch (getTokenType(ctx.addOpr(i-1), 0)) {
			case ExprRuleParser.ADD:
				addExpr = new Add(addExpr, rhs);
				break;
			case ExprRuleParser.SUB:
				addExpr = new Sub(addExpr, rhs);
				break;
			case -1:
				throw new RuntimeException("Expected addOpr is missing!");
			default:
				throw new RuntimeException(String.format("Unknown addOpr type '%s' found!", getTokenType(ctx.addOpr(i-1), 0)));
			}
		}
		return addExpr;
	}
	
	@Override
	public Expression<?> visitMulExpr(MulExprContext ctx) {
		logContext(ctx, true);
		
		if (ctx.mulOpr().size() == 0) {
			return visitLiteral(ctx.literal(0));
		}
		
		Expression<Integer> mulExpr = castToIntegerExpression(visitLiteral(ctx.literal(0)));
		for (int i = 1; i < ctx.literal().size(); i++) {
			Expression<Integer> rhs = castToIntegerExpression(visitLiteral(ctx.literal(i)));
			switch (getTokenType(ctx.mulOpr(i-1), 0)) {
			case ExprRuleParser.MUL:
				mulExpr = new Mul(mulExpr, rhs);
				break;
			case ExprRuleParser.DIV:
				mulExpr = new Div(mulExpr, rhs);
				break;
			case -1:
				throw new RuntimeException("Expected mulOpr is missing!");
			default:
				throw new RuntimeException(String.format("Unknown mulOpr type '%s' found!", getTokenType(ctx.mulOpr(i-1), 0)));
			}
		}
		return mulExpr;
	}
	
	/**
	 * Helper method involved when traversing a variable literal.
	 * The method resolves a variable name and returns its expression.
	 * 
	 * @param ctx The context of the variable literal.
	 * @return The definition of the variable.
	 */
	private Expression<?> visitVariableLiteral(LiteralContext ctx) {
		Symbol<?> varSymbol = symbolTable.getScopeSymbol(ctx.varName.getText());
		if (varSymbol == null) {
			throw new RuntimeException(String.format("Symbol '%s' is undefined!", ctx.varName.getText()));
		}
		
		switch (varSymbol.getType()) {
		case VARIABLE:
			return ((VariableSymbol) varSymbol).getDefinition();
		case PARAMETER:
			return ((ParameterSymbol) varSymbol).getDefinition();
		default:
			throw new RuntimeException(String.format("Symbol '%s' is not a variable!", ctx.varName.getText()));
		}
	}
	
	/**
	 * Helper method involved when traversing a function literal.
	 * The method resolves a function call and returns its expression.
	 * 
	 * @param ctx The context of the function literal.
	 * @return The result of the function call.
	 */
	private Expression<?> visitFunctionLiteral(LiteralContext ctx) {
		FunctionSymbol funcSymbol = (FunctionSymbol) symbolTable.getScopeSymbol(ctx.funcName.getText());
		if (funcSymbol == null) {
			throw new RuntimeException(String.format("Symbol '%s' is undefined!", ctx.funcName.getText()));
		}
		if (funcSymbol.getType() != Symbol.Type.FUNCTION) {
			throw new RuntimeException(String.format("Symbol '%s' is not a function!", ctx.funcName.getText()));
		}
		
		// push a new scope with the function parameters
		symbolTable.pushScope();
		
		// resolve function parameters
		logFunctionParameterResolution(ctx);
		
		List<String> paramNames = new ArrayList<String>();
		if (funcSymbol.getDefinition().funcDefParams() != null) {
			for (TerminalNode paramName : funcSymbol.getDefinition().funcDefParams().WORD()) {
				paramNames.add(paramName.getText());
			}
		}
		
		List<BaseExprContext> paramDefs = ctx.funcParams() != null ? ctx.funcParams().baseExpr() : new ArrayList<BaseExprContext>();
		if (paramDefs.size() < paramNames.size()) {
			throw new RuntimeException(
				String.format("Function '%s' was called with missing parameter '%s'!", ctx.funcName.getText(), paramNames.get(paramDefs.size()))
			);
		}
		
		for (int i=0; i < paramDefs.size(); i ++) {
			BaseExprContext paramDef = paramDefs.get(i);
			if (i >= paramNames.size()) {
				throw new RuntimeException(String.format("Function '%s' has too many parameters specified!", ctx.funcName.getText()));
			}
			
			ParameterSymbol paramSymbol = new ParameterSymbol(paramNames.get(i), visitBaseExpr(paramDef));
			symbolTable.addScopeSymbol(paramSymbol);
		}
		
		// call function
		logFunctionCall(ctx);
		
		scopeDepth += ctx.depth()-2;
		Expression<?> funcExpr = visitBaseExpr(funcSymbol.getDefinition().baseExpr());
		scopeDepth -= ctx.depth()-2;
		
		// pop function scope
		try {
			symbolTable.popScope();
		} catch (OperationNotSupportedException e) {
			throw new RuntimeException(String.format("An unexpected error occurred while removing the function scope! %s", e.getMessage()));
			
		}
		
		return funcExpr;
	}
	
	@Override
	public Expression<?> visitLiteral(LiteralContext ctx) {
		logContext(ctx, true);
		
		if (ctx.list() != null) {
			return visitList(ctx.list()); 
		}
		
		switch (getTokenType(ctx, 0)) {
		case ExprRuleParser.LPAREN:
			return visitBaseExpr(ctx.baseExpr());
		case ExprRuleParser.BOOLEAN:
			return new Literal<Boolean>(Boolean.valueOf(ctx.BOOLEAN().getText()));
		case ExprRuleParser.NUMBER:
			return new Literal<Integer>(Integer.parseInt(ctx.NUMBER().getText()));
		case ExprRuleParser.STRING:
			return new Literal<String>(ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1));
		case ExprRuleParser.WORD:
			if (ctx.varName != null) {
				return visitVariableLiteral(ctx);
			}
			if (ctx.funcName != null) {
				return visitFunctionLiteral(ctx);
			}
			throw new RuntimeException(String.format("Found literal with unexpected WORD token '%s'!", ctx.getChild(0).getText()));
		default:
			throw new RuntimeException(String.format("Found literal with unknown start token type '%s'!", getTokenType(ctx, 0)));
		}
	}
	
	@Override
	public Expression<?> visitList(ListContext ctx) {
		logContext(ctx, true);
		
		List<Object> list = new ArrayList<Object>();
		for (ListItemContext listItemCtx : ctx.listItem()) {
			switch (getTokenType(listItemCtx, 0)) {
			case ExprRuleParser.STRING:
				list.add(listItemCtx.STRING().getText().substring(1, listItemCtx.STRING().getText().length()-1));
				break;
			case ExprRuleParser.NUMBER:
				list.add(Integer.parseInt(listItemCtx.NUMBER().getText()));
				break;
			case -1:
				throw new RuntimeException("Expected list item is missing!");
			default:
				throw new RuntimeException(String.format("Unknown list item type '%s' found!", getTokenType(listItemCtx, 0)));
			}
		}
		
		return new Literal<List<?>>(list);
	}
}

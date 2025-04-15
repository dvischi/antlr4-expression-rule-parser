// Generated from src/main/antlr4/io/github/dvischi/expr_rule_parser/ExprRuleParser.g4 by ANTLR 4.13.2
package io.github.dvischi.expr_rule_parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprRuleParser}.
 */
public interface ExprRuleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(ExprRuleParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(ExprRuleParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ExprRuleParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ExprRuleParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#varDefStmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDefStmt(ExprRuleParser.VarDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#varDefStmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDefStmt(ExprRuleParser.VarDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#funcDefStmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefStmt(ExprRuleParser.FuncDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#funcDefStmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefStmt(ExprRuleParser.FuncDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#funcDefParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefParams(ExprRuleParser.FuncDefParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#funcDefParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefParams(ExprRuleParser.FuncDefParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleStmt(ExprRuleParser.RuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#ruleStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleStmt(ExprRuleParser.RuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(ExprRuleParser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(ExprRuleParser.BaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ExprRuleParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ExprRuleParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(ExprRuleParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(ExprRuleParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(ExprRuleParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(ExprRuleParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ExprRuleParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ExprRuleParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ExprRuleParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ExprRuleParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#relOpr}.
	 * @param ctx the parse tree
	 */
	void enterRelOpr(ExprRuleParser.RelOprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#relOpr}.
	 * @param ctx the parse tree
	 */
	void exitRelOpr(ExprRuleParser.RelOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#addOpr}.
	 * @param ctx the parse tree
	 */
	void enterAddOpr(ExprRuleParser.AddOprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#addOpr}.
	 * @param ctx the parse tree
	 */
	void exitAddOpr(ExprRuleParser.AddOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#mulOpr}.
	 * @param ctx the parse tree
	 */
	void enterMulOpr(ExprRuleParser.MulOprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#mulOpr}.
	 * @param ctx the parse tree
	 */
	void exitMulOpr(ExprRuleParser.MulOprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ExprRuleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ExprRuleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(ExprRuleParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(ExprRuleParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ExprRuleParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ExprRuleParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRuleParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncParams(ExprRuleParser.FuncParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRuleParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncParams(ExprRuleParser.FuncParamsContext ctx);
}
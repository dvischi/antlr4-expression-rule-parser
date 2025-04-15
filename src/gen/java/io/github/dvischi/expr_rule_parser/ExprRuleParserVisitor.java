// Generated from src/main/antlr4/io/github/dvischi/expr_rule_parser/ExprRuleParser.g4 by ANTLR 4.13.2
package io.github.dvischi.expr_rule_parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprRuleParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(ExprRuleParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ExprRuleParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#varDefStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefStmt(ExprRuleParser.VarDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#funcDefStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefStmt(ExprRuleParser.FuncDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#funcDefParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefParams(ExprRuleParser.FuncDefParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#ruleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleStmt(ExprRuleParser.RuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExpr(ExprRuleParser.BaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(ExprRuleParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(ExprRuleParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(ExprRuleParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ExprRuleParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(ExprRuleParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#relOpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOpr(ExprRuleParser.RelOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#addOpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOpr(ExprRuleParser.AddOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#mulOpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOpr(ExprRuleParser.MulOprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ExprRuleParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#listItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItem(ExprRuleParser.ListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ExprRuleParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRuleParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(ExprRuleParser.FuncParamsContext ctx);
}
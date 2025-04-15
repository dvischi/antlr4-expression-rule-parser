/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.RuleNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.dvischi.expr_rule_parser.ExprRuleParser.LiteralContext;
import io.github.dvischi.expr_rule_parser.expressions.Expression;

/**
 * An abstract {@link ExprRuleParserBaseVisitor} with helper methods.
 *
 * @param <T> The return value of a concrete visitor.
 */
public abstract class ExtendedExprRuleParserBaseVisitor<T> extends ExprRuleParserBaseVisitor<T> {
	/**
	 * The class logger.
	 */
	protected static final Logger LOGGER = LogManager.getLogger();
	
	/**
	 * The symbol table holds information of traversed variable/function definition statements.
	 */
	protected SymbolTable symbolTable = null;
	/**
	 * The depth of the current scope within the concrete syntax tree.
	 */
	protected int scopeDepth = 0;
	
	public ExtendedExprRuleParserBaseVisitor() {
		this(new SymbolTable());
	}
	
	public ExtendedExprRuleParserBaseVisitor(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
	@Override
	public T visitChildren(RuleNode node) {
		// disallows calling visit* functions other than the ones overwritten in a subclass
		throw new UnsupportedOperationException(String.format("The %s does not support '%s' nodes!", getClass().getSimpleName(), node.getClass().getSimpleName()));
	}
	
	/**
	 * Helper method to get the token type from a context's child.
	 * 
	 * @param context The node of the concrete syntax tree.
	 * @param i The index of the context's child.
	 * @return The type of the child if it is a token or -1 otherwise.
	 */
	protected int getTokenType(ParserRuleContext context, int i) {
		if (context.getChild(i).getPayload() instanceof Token) {
			return ((Token) context.getChild(i).getPayload()).getType();
		}
		return -1;
	}
	
	/**
	 * Helper method to convert a generic expression into a string expression.
	 * 
	 * @param expression The generic expression.
	 * @return A string expression.
	 * @throws ClassCastException An exception in case a casting is not possible.
	 */
	@SuppressWarnings("unchecked")
	protected Expression<String> castToStringExpression(Expression<?> expression) throws ClassCastException {
		if (!expression.getType().equals(String.class)) {
			throw new ClassCastException(String.format("Expression<%s> cannot be converted to Expression<String>!", expression.getType().getSimpleName()));
		}
		return (Expression<String>) expression;
	}
	
	/**
	 * Helper method to convert a generic expression into an integer expression.
	 * 
	 * @param expression The generic expression.
	 * @return An integer expression.
	 * @throws ClassCastException An exception in case a casting is not possible.
	 */
	@SuppressWarnings("unchecked")
	protected Expression<Integer> castToIntegerExpression(Expression<?> expression) throws ClassCastException {
		if (!expression.getType().equals(Integer.class)) {
			throw new ClassCastException(String.format("Expression<%s> cannot be converted to Expression<Integer>!", expression.getType().getSimpleName()));
		}
		return (Expression<Integer>) expression;
	}
	
	/**
	 * Helper method to convert a generic expression into a boolean expression.
	 * 
	 * @param expression The generic expression.
	 * @return A boolean expression.
	 * @throws ClassCastException An exception in case a casting is not possible.
	 */
	@SuppressWarnings("unchecked")
	protected Expression<Boolean> castToBooleanExpression(Expression<?> expression) throws ClassCastException {
		if (!expression.getType().equals(Boolean.class)) {
			throw new ClassCastException(String.format("Expression<%s> cannot be converted to Expression<Boolean>!", expression.getType().getSimpleName()));
		}
		return (Expression<Boolean>) expression;
	}
	
	/**
	 * Helper method to convert a generic expression into a list expression.
	 * 
	 * @param expression The generic expression.
	 * @return A list expression.
	 * @throws ClassCastException An exception in case a casting is not possible.
	 */
	@SuppressWarnings("unchecked")
	protected Expression<List<?>> castToListExpression(Expression<?> expression) throws ClassCastException {
		if (!List.class.isAssignableFrom(expression.getType())) {
			throw new ClassCastException(String.format("Expression<%s> cannot be converted to Expression<List<?>>!", expression.getType().getSimpleName()));
		}
		return (Expression<List<?>>) expression;
	}
	
	/**
	 * Helper method to log a context.
	 * 
	 * @param ctx The node of the concrete syntax tree.
	 * @param showChildren Indicates wherever the child nodes should be shown in the log message.
	 */
	protected void logContext(RuleContext ctx, boolean showChildren) {
		if(!LOGGER.isDebugEnabled()) {
			return;
		}
		
		String message = Util.repeatChar(' ', scopeDepth + ctx.depth()) + ctx.getClass().getSimpleName();
		
		if (showChildren) {
			if (ctx.getChildCount() == 0) {
				message += ": null";
			} else {
				message += ": " + ctx.getText();
			}
		}
		LOGGER.debug(message);
	}
	
	/**
	 * Helper method to log a message when resolving function parameters.
	 * 
	 * @param ctx The context of the function literal.
	 */
	protected void logFunctionParameterResolution(LiteralContext  ctx) {
		LOGGER.debug("{} RESOLVE FUNCTION PARAMETERS ({})", Util.repeatChar(' ', scopeDepth + ctx.depth()), ctx.funcName.getText());
	}
	
	/**
	 * Helper method to log a message when calling a function.
	 * 
	 * @param ctx The context of the function literal.
	 */
	protected void logFunctionCall(LiteralContext  ctx) {
		LOGGER.debug("{} CALL FUNCTION ({})", Util.repeatChar(' ', scopeDepth + ctx.depth()), ctx.funcName.getText());
	}
}

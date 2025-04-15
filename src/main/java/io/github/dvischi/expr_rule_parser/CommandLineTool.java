/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Stack;

import org.antlr.v4.runtime.misc.Pair;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import io.github.dvischi.expr_rule_parser.expressions.BinaryOperator;
import io.github.dvischi.expr_rule_parser.expressions.Expression;
import io.github.dvischi.expr_rule_parser.expressions.Literal;
import io.github.dvischi.expr_rule_parser.expressions.UnaryOperator;

/**
 * A simple command line tool which prints out rules with their evaluated expressions from a source file.
 * Running the tool with the argument "--help" explains its usage.
 */
public class CommandLineTool {
	/**
	 * The class logger.
	 */
	protected static final Logger LOGGER = LogManager.getLogger();
	
	/**
	 * Helper method to log an abstract syntax tree expression.
	 * 
	 * @param expression The expression of an abstract syntax tree.
	 */
	protected static void logAstExpression(Expression<?> expression) {
		if(!LOGGER.isDebugEnabled()) {
			return;
		}
		
		Stack<Pair<Expression<?>, Integer>> stack = new Stack<Pair<Expression<?>, Integer>>();
        stack.push(new Pair<Expression<?>, Integer>(expression, 0));
        while (!stack.empty()) {
        	Pair<Expression<?>, Integer> stackObject = stack.pop();
        	Expression<?> currentExpr = stackObject.a;
        	int depth = stackObject.b;
        	if (currentExpr instanceof Literal<?>) {
        		LOGGER.debug(String.format("%s%s", Util.repeatChar(' ', depth*2), currentExpr.toString()));
            } else {
        		LOGGER.debug(String.format("%s%s", Util.repeatChar(' ', depth*2), currentExpr.getClass().getSimpleName()));
            }
        	
        	if (currentExpr instanceof UnaryOperator<?, ?>) {
        		stack.push(new Pair<Expression<?>, Integer>(((UnaryOperator<?, ?>) currentExpr).param, depth+1));
            }
            else if (currentExpr instanceof BinaryOperator<?, ?, ?>) {
            	stack.push(new Pair<Expression<?>, Integer>(((BinaryOperator<?, ?, ?>) currentExpr).param2, depth+1));
            	stack.push(new Pair<Expression<?>, Integer>(((BinaryOperator<?, ?, ?>) currentExpr).param1, depth+1));
            }
        }
	}
	
	/**
	 * The entry point of the command line tool.
	 * 
	 * @param args A list of command line arguments.
	 * @throws IOException An exception thrown while reading the source file.
	 */
    public static void main(String... args) throws IOException {
    	Boolean printCstTraversal = Arrays.asList(args).contains("--printCstTraversal");
    	Boolean printAstTraversal = Arrays.asList(args).contains("--printAstTraversal");
    	if (
    		!(
    			args.length == 1 ||
    			(args.length == 2 && (printCstTraversal || printAstTraversal)) ||
    			(args.length == 3 && printCstTraversal && printAstTraversal)
    		) ||
    		args[0].equals("--help")
    	) {
        	System.out.println(
        		"Usage:\r\n" +
        		"  expr_rule_evaluator.jar <source_path> [--printCstTraversal] [--printAstTraversal]\r\n" +
        		"  expr_rule_evaluator.jar --help"
        	);
        	System.exit(0);
    	}
    	
    	if (printCstTraversal) {
    		Configurator.setLevel(ExtendedExprRuleParserBaseVisitor.class, Level.DEBUG);
    	}
    	if (printAstTraversal) {
    		Configurator.setLevel(CommandLineTool.class, Level.DEBUG);
    	}
    	
    	ExprRuleEvaluator evaluator = new ExprRuleEvaluator(Paths.get(args[0]));
    	LOGGER.info("Evaluate concrete syntax tree...");
    	for (Rule<?> rule : evaluator.evalRuleStatements()) {
    		LOGGER.info("---");
    		LOGGER.info(String.format("Evaluate abstract syntax tree for rule '%s'...", rule.getName()));
        	
    		// Note: to keep the evaluation logic of the expression (an abstract syntax tree) to a minimum the Expression.eval() function does not include any logging.
    		//       the logging is done outside of the tree via the CommandLineTool.logAstExpression() function.
    		//       integrating the logging is easily possible e.g. by passing a depth parameter when calling Expression.eval().
    		
    		logAstExpression(rule.expression);
    		System.out.printf("%s => %s\r\n", rule.getName(), rule.getExpression().eval());
    	}
    }
}

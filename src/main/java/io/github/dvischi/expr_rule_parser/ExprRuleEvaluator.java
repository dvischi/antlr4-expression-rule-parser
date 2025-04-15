/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.github.dvischi.expr_rule_parser.ExprRuleParser.StmtsContext;

/**
 * A simple evaluator for the expression rule grammar.
 * The evaluator accepts the following inputs:
 * - a string with the source code
 * - a path pointing to a source file
 * - an input stream of the source code
 * - a character stream of the source code
 */
public class ExprRuleEvaluator {
	/**
	 * The root node/context of the concrete syntax tree.
	 */
	private StmtsContext stmtsContext = null;
	/**
	 * The visitor for traversing statements.
	 */
	private StatementsVisitor stmtsVisitor = new StatementsVisitor();
	
	public ExprRuleEvaluator(String sourceString) throws IOException {
		this(CharStreams.fromString(sourceString));
	}
	
	public ExprRuleEvaluator(Path sourcePath) throws IOException {
		this(CharStreams.fromPath(sourcePath));
	}
	
	public ExprRuleEvaluator(InputStream sourceStream) throws IOException {
		this(CharStreams.fromStream(sourceStream));
	}
	
	public ExprRuleEvaluator(CharStream charStream) throws IOException {
		ExprRuleLexer lexer = new ExprRuleLexer(charStream);
    	ExprRuleParser parser = new ExprRuleParser(new CommonTokenStream(lexer));
    	this.stmtsContext = parser.stmts();
	}
	
	/**
	 * Method for evaluating rule statements from the source code.
	 * 
	 * @return A list of rules.
	 */
	public List<Rule<?>> evalRuleStatements() {
		return stmtsVisitor.visit(stmtsContext);
	}
}

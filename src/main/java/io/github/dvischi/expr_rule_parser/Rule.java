/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import io.github.dvischi.expr_rule_parser.expressions.Expression;

/**
 * An expression rule.
 */
public class Rule<T> {
	/**
	 * The name of the rule.
	 */
	String name;
	/**
	 * The expression of the rule.
	 */
	Expression<T> expression;
	
	public Rule(String name, Expression<T> expression) {
		this.name = name;
		this.expression = expression;
	}

	/**
	 * Method to get the name of the rule.
	 * 
	 * @return The rule's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to get the expression of the rule.
	 * 
	 * @return The rule's expression.
	 */
	public Expression<T> getExpression() {
		return expression;
	}
}

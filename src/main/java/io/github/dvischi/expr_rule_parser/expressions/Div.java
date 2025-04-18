/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * A division operator.
 */
public class Div extends BinaryOperator<Expression<Integer>, Expression<Integer>, Integer> {
	public Div(Expression<Integer> param1, Expression<Integer> param2) {
		super(param1, param2);
	}
	
	/**
	 * Method to get the type of the expression during runtime.
	 * 
	 * @return The type of the expression.
	 */
	@Override
	public Class<?> getType() {
		return Integer.class;
	}
	
	@Override
	public Integer eval() {
		return param1.eval() / param2.eval();
	}
}

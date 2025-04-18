/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * A logical AND operator.
 */
public class And extends BinaryOperator<Expression<Boolean>, Expression<Boolean>, Boolean> {
	public And(Expression<Boolean> param1, Expression<Boolean> param2) {
		super(param1, param2);
	}
	
	/**
	 * Method to get the type of the expression during runtime.
	 * 
	 * @return The type of the expression.
	 */
	@Override
	public Class<?> getType() {
		return Boolean.class;
	}
	
	@Override
	public Boolean eval() {
		return param1.eval() && param2.eval();
	}
}

/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * An equals operator.
 */
public class Equals extends BinaryOperator<Expression<?>, Expression<?>, Boolean> {
	public Equals(Expression<?> param1, Expression<?> param2) {
		super(param1, param2);
	}
	
	@Override
	public Class<?> getType() {
		return Boolean.class;
	}
	
	@Override
	public Boolean eval() {
		return param1.eval().equals(param2.eval());
	}
}

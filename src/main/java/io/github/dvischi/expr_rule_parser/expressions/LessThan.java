/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * A less-than operator.
 */
public class LessThan extends BinaryOperator<Expression<Integer>, Expression<Integer>, Boolean> {
	public LessThan(Expression<Integer> param1, Expression<Integer> param2) {
		super(param1, param2);
	}
	
	@Override
	public Boolean eval() {
		return param1.eval() < param2.eval();
	}
}

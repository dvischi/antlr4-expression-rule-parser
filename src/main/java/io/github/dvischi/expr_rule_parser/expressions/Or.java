/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * A logical OR operator.
 */
public class Or extends BinaryOperator<Expression<Boolean>, Expression<Boolean>, Boolean> {
	public Or(Expression<Boolean> param1, Expression<Boolean> param2) {
		super(param1, param2);
	}
	
	@Override
	public Boolean eval() {
		return param1.eval() || param2.eval();
	}
}

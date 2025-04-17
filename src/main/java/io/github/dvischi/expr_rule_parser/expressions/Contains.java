/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

import java.util.List;

/**
 * A contains operator.
 */
public class Contains extends BinaryOperator<Expression<List<?>>, Expression<?>, Boolean> {
	public Contains(Expression<List<?>> param1, Expression<?> param2) {
		super(param1, param2);
	}
	
	@Override
	public Boolean eval() {
		return param1.eval().contains(param2.eval());
	}
}

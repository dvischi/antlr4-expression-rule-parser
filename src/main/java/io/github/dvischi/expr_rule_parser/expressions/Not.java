/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * A logical NOT operator.
 */
public class Not extends UnaryOperator<Expression<Boolean>, Boolean> {
	public Not(Expression<Boolean> param) {
		super(param);
	}
	
	@Override
	public Boolean eval() {
		return !param.eval();
	}
}

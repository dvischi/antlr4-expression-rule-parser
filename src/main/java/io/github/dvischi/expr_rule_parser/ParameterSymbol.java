/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import io.github.dvischi.expr_rule_parser.expressions.Expression;

/**
 * The concrete implementation of a parameter {@link Symbol}.
 */
public class ParameterSymbol extends Symbol<Expression<?>> {
	public ParameterSymbol(String name, Expression<?> definition) {
		super(name, Symbol.Type.PARAMETER, definition);
	}
}

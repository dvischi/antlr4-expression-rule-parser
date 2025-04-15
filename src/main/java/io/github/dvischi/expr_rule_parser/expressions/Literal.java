/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * A literal expression.
 */
public class Literal<T> implements Expression<T> {
	/**
	 * The value of the literal.
	 */
	public T value;

	public Literal(T value) {
		this.value = value;
	}
	
	@Override
	public Class<?> getType() {
		return value.getClass();
	}
	
	@Override
	public T eval() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

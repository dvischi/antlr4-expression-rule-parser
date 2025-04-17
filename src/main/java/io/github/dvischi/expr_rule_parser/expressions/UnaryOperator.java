/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

import java.lang.reflect.ParameterizedType;

/**
 * A generic operator for one parameter.
 */
public abstract class UnaryOperator<S extends Expression<?>, T> implements Expression<T> {
	/**
	 * The parameter.
	 */
	public S param;
	
	public UnaryOperator(S param) {
		this.param = param;
	}
	
	@Override
	public Class<?> getType() {
		return (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Override
	public String toString() {
		return String.format("{operator: \"%s\", param: %s}", getClass().getSimpleName(), param);
	}
}

/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

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
	
	/**
	 * Method to get the type of the expression during runtime.
	 * 
	 * Note: the default implementation uses reflection to resolve the type during runtime.
	 *       given the slow execution time, it is recommended to explicitly define the type per subclass.
	 * 
	 * @return The type of the expression.
	 */
	@Override
	public Class<?> getType() {
		Type type = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		if (type instanceof ParameterizedType) {
			return (Class<?>) ((ParameterizedType) type).getRawType();
		} else {
			return (Class<?>) type;
		}
	}
	
	@Override
	public String toString() {
		return String.format("{operator: \"%s\", param: %s}", getClass().getSimpleName(), param);
	}
}

/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * A generic operator for two parameters.
 */
public abstract class BinaryOperator<R extends Expression<?>, S extends Expression<?>, T> implements Expression<T> {
	/**
	 * The first parameter.
	 */
	public R param1;
	/**
	 * The second parameter.
	 */
	public S param2;
	
	public BinaryOperator(R param1, S param2) {
		this.param1 = param1;
		this.param2 = param2;
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
		Type type = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[2];
		if (type instanceof ParameterizedType) {
			return (Class<?>) ((ParameterizedType) type).getRawType();
		} else {
			return (Class<?>) type;
		}
	}
	
	@Override
	public String toString() {
		return String.format("{operator: \"%s\", param1: %s, param2: %s}", getClass().getSimpleName(), param1, param2);
	}
}

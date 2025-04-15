/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser.expressions;

/**
 * A generic expression.
 *
 * @param <T> The return type of the expression
 */
public interface Expression<T> {
	/**
	 * Method to get the type of the expression during runtime.
	 * 
	 * @return The type of the expression.
	 */
	Class<?> getType();
	
	/**
	 * Method to evaluate the expression.
	 * Note: This function effectively traverse the abstract syntax tree.
	 * 
	 * @return The result of the evaluation.
	 */
	T eval();
	
	/**
	 * Method to generate a string representation of the expression.
	 * 
	 * @return String representation of the expression.
	 */
	public abstract String toString();
}

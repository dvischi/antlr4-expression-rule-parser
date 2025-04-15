/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

/**
 * A symbol (e.g. a variable, function or parameter) from the {@link SymbolTable}.
 * 
 * @param <T> The type of the symbol's definition.
 */
public class Symbol<T> {
	/**
	 * The type of a symbol.
	 */
	public enum Type {
		VARIABLE,
		FUNCTION,
		PARAMETER
	}
	
	/**
	 * The symbol's name.
	 */
	private String name;
	/**
	 * The symbol's type.
	 */
	private Type type;
	/**
	 * The symbol's definition.
	 */
	private T definition;
	
	public Symbol(String name, Type type, T definition) {
		super();
		this.name = name;
		this.type = type;
		this.definition = definition;
	}

	/**
	 * Method to get the name of the symbol.
	 * 
	 * @return The symbol's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to get the type of the symbol.
	 * 
	 * @return The symbol's type.
	 */
	public Type getType() {
		return type;
	}
	
	/**
	 * Method to get the definition of the symbol.
	 * 
	 * @return The symbol's definition.
	 */
	public T getDefinition() {
		return definition;
	}
}

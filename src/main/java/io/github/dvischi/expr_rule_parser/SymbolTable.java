/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.naming.OperationNotSupportedException;

/**
 * The symbol table represents a stack of scopes each containing a set of {@link Symbol}s.
 * 
 * On the bottom of the stack is the global scope which contains globally defined symbols.
 * 
 * A new scope might be added e.g. during a function call - representing the function scope.
 * The function scope contains symbols such as function parameters and local variables.
 * 
 * Note: a symbol from a higher scope shadows a symbol with the same name from a lower scope.
 */
public class SymbolTable {
	/**
	 * A scope represents a map of symbols.
	 */
	private class Scope {
		public Map<String, Symbol<?>> symbols = new HashMap<String, Symbol<?>>();
	}
	
	/**
	 * The stack of scopes.
	 */
	private Stack<Scope> scopes = new Stack<Scope>();
	
	public SymbolTable() {
		scopes.push(new Scope());  // push the global scope
	}
	
	/**
	 * Method to push a new scope on the stack.
	 */
	public void pushScope() {
		scopes.push(new Scope());
	}
	
	/**
	 * Method to pop the topmost scope from the stack.
	 */
	public void popScope() throws OperationNotSupportedException {
		if (scopes.size() <= 1) {
			throw new OperationNotSupportedException("The global scope cannot be removed!");
		}
		scopes.pop();
	}
	
	/**
	 * Method to add a symbol to the global scope.
	 * 
	 * @param symbol The new symbol to add.
	 */
	public void addGlobalSymbol(Symbol<?> symbol) {
		scopes.get(0).symbols.put(symbol.getName(), symbol);
	}
	
	/**
	 * Method to get a symbol from the global scope.
	 * 
	 * @param name The name of the symbol.
	 * @return The symbol from the global scope if it exists or null otherwise.
	 */
	public Symbol<?> getGlobalSymbol(String name) {
		return scopes.get(0).symbols.get(name);
	}
	
	/**
	 * Method to add a symbol to the current (topmost) scope.
	 * 
	 * @param symbol The new symbol to add.
	 */
	public void addScopeSymbol(Symbol<?> symbol) {
		addScopeSymbol(symbol, null);
	}
	
	/**
	 * Method to add a symbol to a specific scope.
	 * 
	 * @param symbol The new symbol to add.
	 * @param scopeIdx The index of the scope.
	 */
	public void addScopeSymbol(Symbol<?> symbol, Integer scopeIdx) {
		scopeIdx = scopeIdx != null ? scopeIdx : scopes.size() - 1;
		scopes.get(scopeIdx).symbols.put(symbol.getName(), symbol);
	}
	
	/**
	 * Method to get a symbol from the current (topmost) scope.
	 * 
	 * @param name The name of the symbol.
	 * @return The symbol from the current scope if it exists or null otherwise.
	 */
	public Symbol<?> getScopeSymbol(String name) {
		return getScopeSymbol(name, null);
	}
	
	/**
	 * Method to get a symbol from a specific scope.
	 * 
	 * @param name The name of the symbol.
	 * @param scopeIdx The index of the scope.
	 * @return The symbol from the specific scope if it exists or null otherwise.
	 */
	public Symbol<?> getScopeSymbol(String name, Integer scopeIdx) {
		scopeIdx = scopeIdx != null ? scopeIdx : scopes.size() - 1;
		while (scopeIdx >= 0) {
			Symbol<?> symbol = scopes.get(scopeIdx).symbols.get(name);
			if (symbol != null) {
				return symbol;
			}
			scopeIdx--;
		}
		return null;
	}
}

/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

/**
 * Class containing utility functions.
 */
public class Util {
	/**
	 * Helper method to generate a string by repeating the same characters {@code repeat} times.
	 * 
	 * @param character The character to repeat.
	 * @param repeat The number of times the character should be repeated.
	 * @return The generated string.
	 */
	public static String repeatChar(char character, int repeat) {
		return new String(new char[repeat]).replace('\0', character);
	}
}

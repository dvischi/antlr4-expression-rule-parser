/*
 * Copyright (c) 2025 Dario Vischi. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package io.github.dvischi.expr_rule_parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for evaluating simple expression rules.
 */
public class ExprRuleEvaluatorTest {
	/**
	 * A map of test rules.
	 */
	private static Map<String, Rule<?>> rules = new HashMap<String, Rule<?>>();
	
	@BeforeAll
	static void setup() throws IOException {
        new ExprRuleEvaluator(Paths.get("./src/test/resources/test_rules.txt")).evalRuleStatements().forEach(rule -> {
        	rules.put(rule.getName(), rule);
        });
    }
	
	/**
	 * A simple test for variables and functions.
	 */
	@Test
    public void testVariablesAndFunctions() {
    	assertEquals(10, rules.get("rule1").getExpression().eval());
    }
	
	/**
	 * A simple test for lists.
	 */
    @Test
    public void testLists() {
    	assertEquals(true, rules.get("rule2").getExpression().eval());
    	assertEquals(false, rules.get("rule3").getExpression().eval());
    }
    
    /**
	 * A simple test for operation precedences.
	 */
    @Test
    public void testOperationPrecedences() {
    	assertEquals(false, rules.get("rule4").getExpression().eval());
    }
    
    /**
	 * A simple test for nested functions.
	 */
    @Test
    public void testNestedFunctions() {
    	assertEquals(6, rules.get("rule5").getExpression().eval());
    }
}

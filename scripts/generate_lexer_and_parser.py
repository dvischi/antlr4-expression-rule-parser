#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Script for generating lexer and parser listener/visitor from RuleLexer.g4 and RuleParser.g4, respectively.

Prerequisites: ANTLR tool is within the Java CLASSPATH
The ANTLR Tool (as part of the complete ANTLR Java binaries) is available at https://www.antlr.org/download.html.

Note: The ANTLR Tool generates files in different locations on Windows and linux!
    https://github.com/antlr/antlr4/issues/3138
"""
import os
import shutil
import subprocess

GRAMMAR_PATH = "src/main/antlr4/io/github/dvischi/expr_rule_parser"
SOURCE_PATH  = "src/main/java/io/github/dvischi/expr_rule_parser"
GEN_PATH     = "src/gen"
TARGET_PATH  = GEN_PATH + "/java/io/github/dvischi/expr_rule_parser"

# Cleanup generated sources
if os.path.exists(GEN_PATH):
    shutil.rmtree(GEN_PATH)

# Generate lexer and tokens in src/main/antrl4/ExprRule
subprocess.run(["java", "org.antlr.v4.Tool", GRAMMAR_PATH + "/ExprRuleLexer.g4", "-package", "io.github.dvischi.expr_rule_parser"], env=os.environ) 

# Move intermediate files to target/generated-sources
if not os.path.exists(TARGET_PATH):
    os.makedirs(TARGET_PATH)
shutil.move("ExprRuleLexer.java", TARGET_PATH + "/ExprRuleLexer.java")
shutil.copyfile("ExprRuleLexer.tokens", TARGET_PATH + "/ExprRuleLexer.tokens")

# Generate parser, listener and visitor in src/main/antrl4/ExprRule
subprocess.run(["java", "org.antlr.v4.Tool", GRAMMAR_PATH + "/ExprRuleParser.g4", "-listener", "-visitor", "-package", "io.github.dvischi.expr_rule_parser"], env=os.environ) 

# Move intermediate files to target/generated-sources
shutil.move("ExprRuleParser.java", TARGET_PATH + "/ExprRuleParser.java")
shutil.move("ExprRuleParserListener.java", TARGET_PATH + "/ExprRuleParserListener.java")
shutil.move("ExprRuleParserBaseListener.java", TARGET_PATH + "/ExprRuleParserBaseListener.java")
shutil.move("ExprRuleParserVisitor.java", TARGET_PATH + "/ExprRuleParserVisitor.java")
shutil.move("ExprRuleParserBaseVisitor.java", TARGET_PATH + "/ExprRuleParserBaseVisitor.java")
shutil.copyfile("ExprRuleParser.tokens", TARGET_PATH + "/ExprRuleParser.tokens")

# Cleanup intermediate files
os.remove("ExprRuleLexer.tokens")
os.remove("ExprRuleLexer.interp")
os.remove("ExprRuleParser.tokens")
os.remove("ExprRuleParser.interp")
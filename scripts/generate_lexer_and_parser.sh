#!/bin/bash
#
# Script for generating lexer and parser listener/visitor from RuleLexer.g4 and RuleParser.g4, respectively.
#
# Prerequisites: ANTLR tool is within the Java CLASSPATH
# The ANTLR Tool (as part of the complete ANTLR Java binaries) is available at https://www.antlr.org/download.html.
#
# Note: The ANTLR Tool generates files in different locations on Windows and linux!
#       https://github.com/antlr/antlr4/issues/3138

ANTLRTOOL='java org.antlr.v4.Tool'
GRAMMARPATH='src/main/antlr4/io/github/dvischi/expr_rule_parser'
SOURCEPATH='src/main/java/io/github/dvischi/expr_rule_parser'
GENPATH='src/gen'
TARGETPATH="$GENPATH/java/io/github/dvischi/expr_rule_parser"

# Cleanup generated sources
rm -r $GENPATH

# Generate lexer and tokens in src/main/antrl4/ExprRule
$($ANTLRTOOL $GRAMMARPATH/ExprRuleLexer.g4 -package io.github.dvischi.expr_rule_parser)

# Move intermediate files to target/generated-sources
mkdir -p $TARGETPATH
mv ExprRuleLexer.java $TARGETPATH/ExprRuleLexer.java
cp ExprRuleLexer.tokens $TARGETPATH/ExprRuleLexer.tokens

# Generate parser, listener and visitor in src/main/antrl4/ExprRule
$($ANTLRTOOL $GRAMMARPATH/ExprRuleParser.g4 -listener -visitor -package io.github.dvischi.expr_rule_parser)

# Move intermediate files to target/generated-sources
mv ExprRuleParser.java $TARGETPATH/ExprRuleParser.java
mv ExprRuleParserListener.java $TARGETPATH/ExprRuleParserListener.java
mv ExprRuleParserBaseListener.java $TARGETPATH/ExprRuleParserBaseListener.java
mv ExprRuleParserVisitor.java $TARGETPATH/ExprRuleParserVisitor.java
mv ExprRuleParserBaseVisitor.java $TARGETPATH/ExprRuleParserBaseVisitor.java
cp ExprRuleParser.tokens $TARGETPATH/ExprRuleParser.tokens

# Cleanup intermediate files
rm ExprRuleLexer.tokens
rm ExprRuleLexer.interp
rm ExprRuleParser.tokens
rm ExprRuleParser.interp
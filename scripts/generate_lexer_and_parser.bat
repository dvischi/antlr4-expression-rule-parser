:: Script for generating lexer and parser listener/visitor from RuleLexer.g4 and RuleParser.g4, respectively.
::
:: Prerequisites: ANTLR tool is within the Java CLASSPATH
:: The ANTLR Tool (as part of the complete ANTLR Java binaries) is available at https://www.antlr.org/download.html.
::
:: Note: The ANTLR Tool generates files in different locations on Windows and linux!
::       https://github.com/antlr/antlr4/issues/3138

set ANTLRTOOL=java org.antlr.v4.Tool
set GRAMMARPATH=src\main\antlr4\io\github\dvischi\expr_rule_parser
set SOURCEPATH=src\main\java\io\github\dvischi\expr_rule_parser
set GENPATH=src\gen
set TARGETPATH=%GENPATH%\java\io\github\dvischi\expr_rule_parser

REM Cleanup generated sources
del /f /s /q %GENPATH% 1>nul
rmdir /s /q %GENPATH%

REM Generate lexer and tokens in src/main/antrl4/ExprRule
%ANTLRTOOL% %GRAMMARPATH%\ExprRuleLexer.g4 -package io.github.dvischi.expr_rule_parser

REM Move intermediate files to target/generated-sources
mkdir %TARGETPATH%
move %GRAMMARPATH%\ExprRuleLexer.java %TARGETPATH%\ExprRuleLexer.java
copy %GRAMMARPATH%\ExprRuleLexer.tokens %TARGETPATH%\ExprRuleLexer.tokens

REM Generate parser, listener and visitor in src/main/antrl4/ExprRule
%ANTLRTOOL% %GRAMMARPATH%\ExprRuleParser.g4 -listener -visitor -package io.github.dvischi.expr_rule_parser

REM Move intermediate files to target/generated-sources
move %GRAMMARPATH%\ExprRuleParser.java %TARGETPATH%\ExprRuleParser.java
move %GRAMMARPATH%\ExprRuleParserListener.java %TARGETPATH%\ExprRuleParserListener.java
move %GRAMMARPATH%\ExprRuleParserBaseListener.java %TARGETPATH%\ExprRuleParserBaseListener.java
move %GRAMMARPATH%\ExprRuleParserVisitor.java %TARGETPATH%\ExprRuleParserVisitor.java
move %GRAMMARPATH%\ExprRuleParserBaseVisitor.java %TARGETPATH%\ExprRuleParserBaseVisitor.java
copy %GRAMMARPATH%\ExprRuleParser.tokens %TARGETPATH%\ExprRuleParser.tokens

REM Cleanup intermediate files
del %GRAMMARPATH%\ExprRuleLexer.tokens
del %GRAMMARPATH%\ExprRuleLexer.interp
del %GRAMMARPATH%\ExprRuleParser.tokens
del %GRAMMARPATH%\ExprRuleParser.interp
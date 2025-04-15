parser grammar ExprRuleParser;

options {
  tokenVocab = ExprRuleLexer;
}

stmts : WS* ( stmt WS* )* ;
stmt
  : varDefStmt
  | funcDefStmt
  | ruleStmt
  ;

varDefStmt : VAR WS+ varName=WORD WS* COLON ASSIGNMENT WS* varDef=baseExpr SEMI ;
funcDefStmt : FUNC WS+ funcName=WORD WS* COLON ASSIGNMENT WS* LPAREN funcDefParams? RPAREN WS* ARROW WS* funcDef=baseExpr SEMI ;
funcDefParams : WS* paramName=WORD ( WS* COMMA addParamName=WORD )* WS* ;
ruleStmt : RULE WS+ ruleName=WORD WS* COLON ASSIGNMENT WS* ruleDef=baseExpr SEMI ;

baseExpr : andExpr ( WS+ OR WS+ andExpr )* ;
andExpr : notExpr ( WS+ AND WS+ notExpr )* ;
notExpr
  : (NOT WS+)? relExpr
  | NOT LPAREN notExpr RPAREN
  ; 
relExpr : addExpr ( WS* relOpr WS* addExpr )? ;
addExpr : mulExpr ( WS* addOpr WS* mulExpr )* ;
mulExpr : literal ( WS* mulOpr WS* literal )* ;

relOpr
  : GT
  | LT
  | EQUAL
  | NOTEQUAL
  | CONTAINS
  | CONTAINSALL
  ;
addOpr
  : ADD
  | SUB
  ;
mulOpr
  : MUL
  | DIV
  ;

literal
  : LPAREN WS* baseExpr WS* RPAREN
  | list
  | BOOLEAN
  | NUMBER
  | STRING
  | funcName=WORD LPAREN ( funcParams )? RPAREN  // function call
  | varName=WORD  // variable
  ;

listItem : STRING | NUMBER ;
list : LBRACK ( listItem ( COMMA listItem )* )? RBRACK ;

funcParams : WS* ( paramDef=baseExpr ) ( WS* COMMA ( addParamDef=baseExpr ) )* WS* ;
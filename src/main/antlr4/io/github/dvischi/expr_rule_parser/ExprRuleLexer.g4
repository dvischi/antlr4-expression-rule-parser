lexer grammar ExprRuleLexer;

// fragments
fragment DIGIT  : [0-9] ;
fragment LETTER : [a-zA-Z] ;

// keywords
VAR             : 'var' ;
FUNC            : 'func' ;
RULE            : 'rule' ;

// symbols
DQUOTE          : '"' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACK          : '[' ;
RBRACK          : ']' ;
COLON           : ':' ;
SEMI            : ';' ;
COMMA           : ',' ;
ARROW           : '->' ;

// operators
NOT             : 'not' ;
AND             : 'and' ;
OR              : 'or' ;
ASSIGNMENT      : '=' ;
GT              : '>' ;
LT              : '<' ;
EQUAL           : '==' ;
NOTEQUAL        : '!=' ;
ADD             : '+' ;
SUB             : '-' ;
MUL             : '*' ;
DIV             : '/' ;
CONTAINS        : 'contains' ;
CONTAINSALL     : 'contains all' ;

// whitespaces
WS              : [ \t\r\n] ;

// literals
BOOLEAN         : ('true' | 'TRUE' | 'false' | 'FALSE') ;
NUMBER          : DIGIT+ ;
WORD            : LETTER ( LETTER | DIGIT | '_' )* ;
STRING          : '"' ( LETTER | DIGIT | '_' | '.' )* '"' ;
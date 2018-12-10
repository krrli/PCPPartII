grammar Prolog;

// (1 + 2) * 3 = X
// X is (1+2)*3.

stmt   : expr assign ID
        | COMMENT;

assign : '=' ;

expr   : term
       | term op=(ADD | SUB) expr
       ;

term   : factor
       | factor op=(MUL | DIV) term
       ;

factor : (SUB)? number
       | '(' expr ')'
       ;

number : DIGIT* DIGIT ;


// Lexer-Regeln
ADD    : '+' ;
SUB    : '-' ;
MUL    : '*' ;
DIV    : '/' ;
ID     : [A-Z]+ ;
DIGIT  : [0-9]+ ;
WS     : [ \t\r\n]+ -> skip ;

COMMENT
    : 'BLA' .*? 'BLA' -> channel(COMMENTS)
    ;




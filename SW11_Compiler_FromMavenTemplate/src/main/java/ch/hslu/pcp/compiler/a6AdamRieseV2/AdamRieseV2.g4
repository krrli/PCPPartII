// Definition der Grammatik a0AdamRiese
grammar AdamRieseV2;

// Parser-Regeln
stmt   : (expr '=')* EOF ;

expr   : term                       # TermOnly
       | term op=(ADD | SUB) expr   # AddSubOp
       ;

term   : factor                     # FactorOnly
       | factor op=(MUL | DIV) term # MulDivOp
       ;

/*
    vorher:
    factor : number                     # NumberOnly
           | '(' expr ')'               # Parens
           ;
*/
factor : (SUB)? number              # NumberOnly
       | '(' expr ')'               # Parens
       ;

number : DIGIT* DIGIT ;


// Lexer-Regeln
ADD    : '+' ;
SUB    : '-' ;
MUL    : '*' ;
DIV    : '/' ;
DIGIT  : [0-9]+ ;
WS     : [ \t\r\n]+ -> skip ;

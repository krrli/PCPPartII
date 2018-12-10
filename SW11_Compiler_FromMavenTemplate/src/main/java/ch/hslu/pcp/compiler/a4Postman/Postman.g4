// Definition einer Grammatik mit dem Namen a4Postman
grammar Postman;

// Parser-Regeln
satz        : subjekt praedikat objekt ;

subjekt     : artikel substantiv #SubjectArtSubst
            ;

objekt      : artikel substantiv #ObjectArtSubst
            ;

praedikat    : verb ;
substantiv  : 'hund' | 'briefträger';
verb        : 'beisst' ;
artikel     : 'der' | 'den';

// Lexer-Regeln
WS          : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
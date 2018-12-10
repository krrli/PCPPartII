// Definition einer Grammatik mit dem Namen a4Postman
grammar PostmanV2;

// Parser-Regeln
satz        : subjekt praedikat objekt ;

subjekt     : artikel substantiv ;

objekt      : artikel substantiv ;

praedikat    : verb ;
substantiv  : 'hund' | 'briefträger' | 'milchmann' | 'katze' | 'brief' | 'milch';
verb        : 'beisst' | 'liefert';
artikel     : 'der' | 'den' | 'die' | 'das' ;

// Lexer-Regeln
WS          : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
lexer grammar LexerT;
BEGIN: 'ipinipicipiapar';
END: 'fipin';
MAIN: 'pripincipiapal' ;
PRINT: 'epescripibipir' ;
READ: 'lepeeper' ;
//Tipos de datos
CHAR: 'caparapacteper' ;
INT: 'epenteperopo' ;
FLOAT: 'flopotapantepe' ;
VOID: 'vapacipiopo' ;
BOOLEAN: 'lopogipicopo' ;
//Operadores matemáticos
PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIV: '/' ;
MOD: '%' ;
POW: '^' ;
//Operadores
ASSIGN: '=' ;
AND: '&' ;
OR: '|' ;
NOT: '!' ;
EQUAL: '==' ;
NOT_EQUAL: '!=' ;
GREATER: '>' ;
LESSER: '<' ;
GREATER_OR_EQUAL: '>=' ;
LESSER_OR_EQUAL: '<=' ;
//Controladores
BRACE_OPEN: '{' ;
BRACE_CLOSE: '}' ;
BRACKET_OPEN: '[' ;
BRACKET_CLOSE: ']' ;
PAR_OPEN: '(' ;
PAR_CLOSE: ')' ;
SEMICOLON: ';' ;
COMMA: ',' ;
//Estructuras condicionales y repetitivas
IF: 'sipi' ;
ELSE: 'sipinopo' ;
DO: 'hapaceper' ;
WHILE: 'mipiepentrapas' ;
FOR: 'paparapa' ;
//Constantes
NULL: 'nupulopo' ;
RETURN: 'depevupuepelvepe' ;
CONSTANT: 'coponstapantepe' ;
VAL_BOOLEAN: ('veperdapadeperopo' | 'fapalsopo') ;
//Funciones matematicas
SQRT: 'rapaipiz';
SIN: 'sipin' ;
COS: 'copos' ;

NAME_VAR: (LOWER_CHAR | UPPER_CHAR | '_' ) (LOWER_CHAR | UPPER_CHAR | DIGIT | '_' )+ ;
NUMBER: DIGIT+ ;
WORDS: '"' (LOWER_CHAR | UPPER_CHAR | ' ' | DIGIT)* '"'; 
LOWER_CHAR: [a-z] ;
UPPER_CHAR: [A-Z] ;
DIGIT: [0-9];
WS: [ \t\r\n]+ -> skip ;


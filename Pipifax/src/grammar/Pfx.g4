grammar Pfx;

program
	: (function|globalVariable)* 
	;
	
function
	: 'func' IDENTIFIER '(' ')' type '{' block '}'
	;

block
	: statement*
	;
	
statement
	: whileStmt
	| ifStmt
	| assignment
	;
	
whileStmt
	: 'while'
	;
	
ifStmt
	: 'if'
	;
	
assignment
	: IDENTIFIER '=' expression
	;
	
expression
	: INT
	;
	

globalVariable
	: 'var' IDENTIFIER type
	;
	
type
	: 'int'		#IntDecl
	| 'double'	#DoubleDe
	| 'String'	#StringDecl
	| 'void'	#VoidDecl
	;
	
	
IDENTIFIER
	: LETTER CHAR*
	;

fragment
LETTER : [A-Za-z_] ;

fragment
CHAR : LETTER|INT ;

INT : [0-9]+ ;

SPACE : [ \t\f\n\r]+ -> skip ;
COMMENT : '#' ~[\n\r]* -> skip ;
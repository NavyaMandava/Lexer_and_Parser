grammar ProjLang;
//Lexer spec
fragment LETTER
	:	'a'..'z' | 'A'..'Z'
	;
fragment DIGIT
	:	'0'..'9'
	;
IF	:	'if';
THEN	:	'then';
ELSE	:	'else';
LET	:	'let';
IN	:	'in';
VAL	:	'val';
END	:	'end';
FUNCTION:	'fun';
LEFTCUB	:	'{';
RIGHTCUB:		'}';
COLON	:	':';
WHILE   :	'while';
DO	:	'do';
SEMICOLON :	';';
ASSIGN	:	':=';
NOT	:	'!';
BINA   :	'+';
BINS   : 	'-';
BINM   :	'*';
BIND   :	'/';
BINAND    :	'&';
BINOR     :	'|';
TRUE	:	'true';
FALSE	:	'false';
NUMBER	:	(DIGIT)+;
ID	:	LETTER(LETTER | DIGIT)*;
LPAR	:	'(';
RPAR    :	')';
EQUALS	:	'=';
RELOP	: 	'<';

WS	:	(' ' |'\t'|'\n'|'\r')+{skip();};

//Parser
input	returns [Expr value]	: expr {$value = $expr.value;} SEMICOLON;
	
expr returns [Expr value]	: IF c1=expr THEN c2=expr ELSE c3=expr {$value=new IfExp ($c1.value,$c2.value,$c3.value);}
					| LET VAL l1=ID EQUALS c1=expr IN c2=expr END {$value=new LetValExp ($l1.text,$c1.value,$c2.value);}
					| LET FUNCTION f1=ID LPAR f2=ID RPAR EQUALS c1=expr IN c2=expr 'end' {$value=new LetFunExp ($f1.text,$f2.text,$c1.value,$c2.value);}
					| WHILE c1=expr DO c2=expr {$value=new WhileExp ($c1.value,$c2.value);}
					| LEFTCUB c1=expr ( SEMICOLON c2=expr {$value=new SeqExp($c1.value,$c2.value);})*RIGHTCUB
					| NOT c1=expr {$value=new NotExp ($c1.value);}
					| i=ID ASSIGN c1=expr {$value=new AssnExp($i.text,$c1.value);}
					| r=relexpr{$value=$r.value;};
					
relexpr returns [Expr value]: a=arithexpr{$value=$a.value;}((r1=RELOP|r1=EQUALS) a2=arithexpr{if ($r1.text.equals("=")) $value=new BinExp($value,BinOp.EQ,$a2.value);
				else $value=new BinExp($value,BinOp.LT,$a2.value);})?
;

	
arithexpr returns [Expr value]		:	t=term {$value=$t.value;}
			        		(BINA b1=term{$value=new BinExp($value,BinOp.PLUS,$b1.value);}
			        		|BINS b2=term{$value=new BinExp($value,BinOp.MINUS,$b2.value);}
			        		|BINOR b3=term{$value= new BinExp($value,BinOp.OR,$b3.value);})*;

term	returns [Expr value]: 	f=factor {$value=$f.value;}
			        (BINM m=factor{$value=new BinExp($value,BinOp.TIMES,$m.value);}
			        |BIND d=factor{$value=new BinExp($value,BinOp.DIV,$d.value);}
			        |BINAND a1=factor{$value=new BinExp($value,BinOp.AND,$a1.value);})*;

factor	returns [Expr value]: 	NUMBER {$value=new IntConst(Integer.parseInt($NUMBER.text));}
	|	TRUE {$value=new BoolConst(Boolean.parseBoolean("true"));}
	|	FALSE {$value=new BoolConst(Boolean.parseBoolean("false"));}
	|	d=ID {$value=new VarExp($d.text);}
	|       d1=ID LPAR x=expr RPAR {$value=new AppExp($d1.text,$x.value);}
				| LPAR x2=expr {$value=$x2.value;} RPAR
	;
	
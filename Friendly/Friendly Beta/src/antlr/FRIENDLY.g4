grammar FRIENDLY;

program : 'begin' statement+ 'end';

statement : assign | print;

assign : 'let' ID 'be' (NUMBER | ID);

print : 'print' (NUMBER | ID);



ID : [a-z]+ ;

NUMBER : [0-9]+ ;

WS : [ \n\t]+ -> skip ;
grammar FRIENDLY;

//program : 'begin' statement+ 'end';

assign : 'let' ID 'be' (NUMBER | ID);

print : 'print' (string | integer | floating_point);

program: constdec_list funcdecl_list main_function;

//prod for pkg dec
pkg: directory_list;
directory_list:directory_statement directory_list | directory_statement;
directory_statement: package_name'.'package_name;
package_name: letters;
directory_name: letters;

//production for imports

import_list: import_statement import_list;
import_statement: 'import ' import_name newline;
import_name: letters;
// production for function declaration

funcdecl_list: function_declaration funcdecl_list;
function_declaration: function_return | function_noreturn;
function_return: data_type function_retname '(' parameter_list ') ' function_content ;
function_noreturn: 'void ' function_noretname '(' parameter_list ')' function_content;
function_retname: function_name;
function_noretname: function_name;
function_name: letters;
parameter_list: parameters;
parameters: var_decl','parameters|var_decl;
main_func_param: var_decl;
function_content: '{ ' vardecl_list statement_list '}';
main_function: 'fun main (' parameter_list ')' function_content;
//production for var dec

vardecl_list: var_decl';'vardecl_list|var_decl';';
var_decl: data_type identifier_list;
data_type: 'int' | 'double' | 'char' | 'String';
identifier_list: identifier ',' identifier_list | identifier;
identifier: Letter (Letter|Digit)* subscript*;
subscript: '['integer']';



//production for statements
statement: assignment_statement | funccall_statement | if_statement | when_statement | while_statement | do_while_statement | for_statement | return_statement | 'break;' | 'continue;';
assignment_statement: identifier ':' expression;
funccall_statement: function_name '(' actual_parameter_list ');';
actual_parameter_list: actual_params;
actual_params: identifier ',' actual_params | identifier;
return_statement: 'return' expression;
if_statement: 'if (' bool_expression ')' statement 'else' statement | 'if (' bool_expression ')' statement;
when_statement: 'when (' bool_expression '){'case_list default_statement ')';
case_list: expression ' -> ' statement_list case_list;
default_statement: ' else -> ' statement_list;
while_statement: 'while (' bool_expression ')' statement;
do_while_statement: 'do ' statement ' while (' bool_expression ');';
for_statement: 'for (' assignment_statement';'bool_expression';'assignment_statement') ' statement;
statement_list: statement statement_list;
// /productions for expressions
expression: string_expression | num_expression | bool_expression | function_retname ( actual_parameter_list );
string_expression: string_identifier + string_expression | string + string_expression | string_identifier | string | '!'string_expression | '-'string_expression;
string_identifier: identifier;
num_expression: num_term '+' num_expression | num_term '-' num_expression | num_term;
num_term: num_factor '*' num_term | num_factor '/' num_term | num_factor '%' num_term | num_factor;

num_factor: '(' num_expression ')' | charac | integer | floating_point;
num_identifier: identifier;
bool_expression: num_expression rel_op num_expression | string_expression ' eq ' string_expression | string_expression ' noteq ' string_expression | bool_logical ' eq ' bool_expression | bool_logical ' noteq ' bool_expression | bool_logical;
rel_op: 'eq' | 'noteq' | 'lesseq' | 'greateq' | 'less' | 'great';
bool_logical: bool_term 'or' bool_logical | bool_term;
bool_term: bool_factor 'and' bool_term | bool_factor;
bool_factor: '(' bool_logical ')' | 'not' bool_logical | bool_identifier;
bool_identifier : identifier;

//Production for Constants
constdec_list: const_statement+;
const_statement: 'const ' const_identifier '='  constant;
const_identifier: Letter (Letter | Digit)*;
constant: integer | floating_point | character | string;
integer: sign digits | digits;
sign: '+' | '-';
floating_point: floating;
floating : digits'.'digits | digits'.' | '.'digits;
character : '"' ascii_char '"';
string: '"' ascii_char+ '"';

//Other Productions
charac: ascii_char;
ascii_char: Letter | Digit;

Digit : [0-9];
Letter : [a-zA-Z];

digits : Digit+ ;
letters : Letter+ ;
newline: '\n';
WS : [ \n\t]+ -> skip ;




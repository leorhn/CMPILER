// Generated from FRIENDLY.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FRIENDLYParser}.
 */
public interface FRIENDLYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FRIENDLYParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FRIENDLYParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FRIENDLYParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FRIENDLYParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FRIENDLYParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FRIENDLYParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#pkg}.
	 * @param ctx the parse tree
	 */
	void enterPkg(FRIENDLYParser.PkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#pkg}.
	 * @param ctx the parse tree
	 */
	void exitPkg(FRIENDLYParser.PkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#directory_list}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_list(FRIENDLYParser.Directory_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#directory_list}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_list(FRIENDLYParser.Directory_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#directory_statement}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_statement(FRIENDLYParser.Directory_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#directory_statement}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_statement(FRIENDLYParser.Directory_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(FRIENDLYParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(FRIENDLYParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_name(FRIENDLYParser.Directory_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_name(FRIENDLYParser.Directory_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#import_list}.
	 * @param ctx the parse tree
	 */
	void enterImport_list(FRIENDLYParser.Import_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#import_list}.
	 * @param ctx the parse tree
	 */
	void exitImport_list(FRIENDLYParser.Import_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(FRIENDLYParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(FRIENDLYParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(FRIENDLYParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(FRIENDLYParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#funcdecl_list}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(FRIENDLYParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(FRIENDLYParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(FRIENDLYParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(FRIENDLYParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_retname}.
	 * @param ctx the parse tree
	 */
	void enterFunction_retname(FRIENDLYParser.Function_retnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_retname}.
	 * @param ctx the parse tree
	 */
	void exitFunction_retname(FRIENDLYParser.Function_retnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_noretname}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noretname(FRIENDLYParser.Function_noretnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_noretname}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noretname(FRIENDLYParser.Function_noretnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(FRIENDLYParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(FRIENDLYParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(FRIENDLYParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(FRIENDLYParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FRIENDLYParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FRIENDLYParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#main_func_param}.
	 * @param ctx the parse tree
	 */
	void enterMain_func_param(FRIENDLYParser.Main_func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#main_func_param}.
	 * @param ctx the parse tree
	 */
	void exitMain_func_param(FRIENDLYParser.Main_func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#function_content}.
	 * @param ctx the parse tree
	 */
	void enterFunction_content(FRIENDLYParser.Function_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#function_content}.
	 * @param ctx the parse tree
	 */
	void exitFunction_content(FRIENDLYParser.Function_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(FRIENDLYParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(FRIENDLYParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void enterVardecl_list(FRIENDLYParser.Vardecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void exitVardecl_list(FRIENDLYParser.Vardecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(FRIENDLYParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(FRIENDLYParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(FRIENDLYParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(FRIENDLYParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(FRIENDLYParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(FRIENDLYParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FRIENDLYParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FRIENDLYParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(FRIENDLYParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(FRIENDLYParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void enterActual_params(FRIENDLYParser.Actual_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void exitActual_params(FRIENDLYParser.Actual_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(FRIENDLYParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(FRIENDLYParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(FRIENDLYParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(FRIENDLYParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#when_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhen_statement(FRIENDLYParser.When_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#when_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhen_statement(FRIENDLYParser.When_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#case_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_list(FRIENDLYParser.Case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#case_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_list(FRIENDLYParser.Case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#default_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefault_statement(FRIENDLYParser.Default_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#default_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefault_statement(FRIENDLYParser.Default_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(FRIENDLYParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(FRIENDLYParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(FRIENDLYParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(FRIENDLYParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(FRIENDLYParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(FRIENDLYParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(FRIENDLYParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(FRIENDLYParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#string_identifier}.
	 * @param ctx the parse tree
	 */
	void enterString_identifier(FRIENDLYParser.String_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#string_identifier}.
	 * @param ctx the parse tree
	 */
	void exitString_identifier(FRIENDLYParser.String_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterNum_expression(FRIENDLYParser.Num_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitNum_expression(FRIENDLYParser.Num_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_term}.
	 * @param ctx the parse tree
	 */
	void enterNum_term(FRIENDLYParser.Num_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_term}.
	 * @param ctx the parse tree
	 */
	void exitNum_term(FRIENDLYParser.Num_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor(FRIENDLYParser.Num_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor(FRIENDLYParser.Num_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void enterNum_identifier(FRIENDLYParser.Num_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#num_identifier}.
	 * @param ctx the parse tree
	 */
	void exitNum_identifier(FRIENDLYParser.Num_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(FRIENDLYParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(FRIENDLYParser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(FRIENDLYParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(FRIENDLYParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void enterBool_logical(FRIENDLYParser.Bool_logicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_logical}.
	 * @param ctx the parse tree
	 */
	void exitBool_logical(FRIENDLYParser.Bool_logicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void enterBool_term(FRIENDLYParser.Bool_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void exitBool_term(FRIENDLYParser.Bool_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void enterBool_factor(FRIENDLYParser.Bool_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void exitBool_factor(FRIENDLYParser.Bool_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBool_identifier(FRIENDLYParser.Bool_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#bool_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBool_identifier(FRIENDLYParser.Bool_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constdec_list}.
	 * @param ctx the parse tree
	 */
	void enterConstdec_list(FRIENDLYParser.Constdec_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constdec_list}.
	 * @param ctx the parse tree
	 */
	void exitConstdec_list(FRIENDLYParser.Constdec_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void enterConst_statement(FRIENDLYParser.Const_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void exitConst_statement(FRIENDLYParser.Const_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#const_identifier}.
	 * @param ctx the parse tree
	 */
	void enterConst_identifier(FRIENDLYParser.Const_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#const_identifier}.
	 * @param ctx the parse tree
	 */
	void exitConst_identifier(FRIENDLYParser.Const_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FRIENDLYParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FRIENDLYParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(FRIENDLYParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(FRIENDLYParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(FRIENDLYParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(FRIENDLYParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#floating_point}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point(FRIENDLYParser.Floating_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#floating_point}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point(FRIENDLYParser.Floating_pointContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#floating}.
	 * @param ctx the parse tree
	 */
	void enterFloating(FRIENDLYParser.FloatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#floating}.
	 * @param ctx the parse tree
	 */
	void exitFloating(FRIENDLYParser.FloatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(FRIENDLYParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(FRIENDLYParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(FRIENDLYParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(FRIENDLYParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#charac}.
	 * @param ctx the parse tree
	 */
	void enterCharac(FRIENDLYParser.CharacContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#charac}.
	 * @param ctx the parse tree
	 */
	void exitCharac(FRIENDLYParser.CharacContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#ascii_char}.
	 * @param ctx the parse tree
	 */
	void enterAscii_char(FRIENDLYParser.Ascii_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#ascii_char}.
	 * @param ctx the parse tree
	 */
	void exitAscii_char(FRIENDLYParser.Ascii_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(FRIENDLYParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(FRIENDLYParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#letters}.
	 * @param ctx the parse tree
	 */
	void enterLetters(FRIENDLYParser.LettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#letters}.
	 * @param ctx the parse tree
	 */
	void exitLetters(FRIENDLYParser.LettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FRIENDLYParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(FRIENDLYParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(FRIENDLYParser.NewlineContext ctx);
}
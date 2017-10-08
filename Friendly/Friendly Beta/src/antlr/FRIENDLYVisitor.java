// Generated from FRIENDLY.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FRIENDLYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FRIENDLYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FRIENDLYParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(FRIENDLYParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FRIENDLYParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#pkg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkg(FRIENDLYParser.PkgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#directory_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_list(FRIENDLYParser.Directory_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#directory_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_statement(FRIENDLYParser.Directory_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(FRIENDLYParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#directory_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_name(FRIENDLYParser.Directory_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#import_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_list(FRIENDLYParser.Import_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(FRIENDLYParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(FRIENDLYParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#funcdecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl_list(FRIENDLYParser.Funcdecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(FRIENDLYParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return(FRIENDLYParser.Function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_noreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_noreturn(FRIENDLYParser.Function_noreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_retname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_retname(FRIENDLYParser.Function_retnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_noretname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_noretname(FRIENDLYParser.Function_noretnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(FRIENDLYParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(FRIENDLYParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FRIENDLYParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#main_func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_func_param(FRIENDLYParser.Main_func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#function_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_content(FRIENDLYParser.Function_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(FRIENDLYParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#vardecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl_list(FRIENDLYParser.Vardecl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(FRIENDLYParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(FRIENDLYParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(FRIENDLYParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FRIENDLYParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(FRIENDLYParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FRIENDLYParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(FRIENDLYParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#funccall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall_statement(FRIENDLYParser.Funccall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_parameter_list(FRIENDLYParser.Actual_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#actual_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_params(FRIENDLYParser.Actual_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FRIENDLYParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(FRIENDLYParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#when_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_statement(FRIENDLYParser.When_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_list(FRIENDLYParser.Case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#default_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_statement(FRIENDLYParser.Default_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(FRIENDLYParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(FRIENDLYParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(FRIENDLYParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(FRIENDLYParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FRIENDLYParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(FRIENDLYParser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#string_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_identifier(FRIENDLYParser.String_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expression(FRIENDLYParser.Num_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_term(FRIENDLYParser.Num_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor(FRIENDLYParser.Num_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#num_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_identifier(FRIENDLYParser.Num_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(FRIENDLYParser.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(FRIENDLYParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_logical(FRIENDLYParser.Bool_logicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_term(FRIENDLYParser.Bool_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_factor(FRIENDLYParser.Bool_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#bool_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_identifier(FRIENDLYParser.Bool_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constdec_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdec_list(FRIENDLYParser.Constdec_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#const_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_statement(FRIENDLYParser.Const_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#const_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_identifier(FRIENDLYParser.Const_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FRIENDLYParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(FRIENDLYParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(FRIENDLYParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#floating_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point(FRIENDLYParser.Floating_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#floating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating(FRIENDLYParser.FloatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(FRIENDLYParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(FRIENDLYParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#charac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharac(FRIENDLYParser.CharacContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#ascii_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscii_char(FRIENDLYParser.Ascii_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(FRIENDLYParser.DigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#letters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetters(FRIENDLYParser.LettersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(FRIENDLYParser.NewlineContext ctx);
}
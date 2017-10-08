// Generated from C:\Users\Tyler\Desktop\Test\FRIENDLY.g4 by ANTLR 4.7
package antlr;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FRIENDLYParser}.
 */
public interface FRIENDLYListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link FRIENDLYParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(FRIENDLYParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link FRIENDLYParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(FRIENDLYParser.AddContext ctx);
}
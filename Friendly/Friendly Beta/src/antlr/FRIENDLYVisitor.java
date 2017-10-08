package antlr;


// Generated from C:\Users\Tyler\Desktop\FRIENDLY.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link FRIENDLYParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FRIENDLYParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FRIENDLYParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FRIENDLYParser.StatementContext ctx);
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
}
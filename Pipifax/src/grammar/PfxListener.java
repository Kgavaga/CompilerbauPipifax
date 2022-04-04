// Generated from Pfx.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PfxParser}.
 */
public interface PfxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PfxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PfxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PfxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PfxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PfxParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PfxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PfxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PfxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PfxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PfxParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PfxParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PfxParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PfxParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PfxParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PfxParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PfxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PfxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PfxParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariable(PfxParser.GlobalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PfxParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariable(PfxParser.GlobalVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDecl}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntDecl(PfxParser.IntDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDecl}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntDecl(PfxParser.IntDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleDe}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleDe(PfxParser.DoubleDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleDe}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleDe(PfxParser.DoubleDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDecl}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringDecl(PfxParser.StringDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDecl}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringDecl(PfxParser.StringDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidDecl}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVoidDecl(PfxParser.VoidDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidDecl}
	 * labeled alternative in {@link PfxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVoidDecl(PfxParser.VoidDeclContext ctx);
}
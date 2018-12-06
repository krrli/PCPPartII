// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/compiler/AdamRiese\FinalAdamRiese.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.AdamRiese;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FinalAdamRieseParser}.
 */
public interface FinalAdamRieseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FinalAdamRieseParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(FinalAdamRieseParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalAdamRieseParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(FinalAdamRieseParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTermOnly(FinalAdamRieseParser.TermOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTermOnly(FinalAdamRieseParser.TermOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link FinalAdamRieseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(FinalAdamRieseParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link FinalAdamRieseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(FinalAdamRieseParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorOnly(FinalAdamRieseParser.FactorOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorOnly(FinalAdamRieseParser.FactorOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link FinalAdamRieseParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(FinalAdamRieseParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link FinalAdamRieseParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(FinalAdamRieseParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberOnly(FinalAdamRieseParser.NumberOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberOnly}
	 * labeled alternative in {@link FinalAdamRieseParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberOnly(FinalAdamRieseParser.NumberOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link FinalAdamRieseParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParens(FinalAdamRieseParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link FinalAdamRieseParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParens(FinalAdamRieseParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalAdamRieseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FinalAdamRieseParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalAdamRieseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FinalAdamRieseParser.NumberContext ctx);
}
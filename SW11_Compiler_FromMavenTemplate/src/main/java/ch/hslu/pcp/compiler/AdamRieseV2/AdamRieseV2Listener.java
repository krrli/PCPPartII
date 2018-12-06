// Generated from C:/Code/PCPPartII/SW11_Compiler_FromMavenTemplate/src/main/java/ch/hslu/pcp/compiler/AdamRieseV2\AdamRieseV2.g4 by ANTLR 4.7
package ch.hslu.pcp.compiler.AdamRieseV2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdamRieseV2Parser}.
 */
public interface AdamRieseV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AdamRieseV2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(AdamRieseV2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdamRieseV2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(AdamRieseV2Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermOnly}
	 * labeled alternative in {@link AdamRieseV2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTermOnly(AdamRieseV2Parser.TermOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermOnly}
	 * labeled alternative in {@link AdamRieseV2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTermOnly(AdamRieseV2Parser.TermOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link AdamRieseV2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(AdamRieseV2Parser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubOp}
	 * labeled alternative in {@link AdamRieseV2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(AdamRieseV2Parser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorOnly}
	 * labeled alternative in {@link AdamRieseV2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorOnly(AdamRieseV2Parser.FactorOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorOnly}
	 * labeled alternative in {@link AdamRieseV2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorOnly(AdamRieseV2Parser.FactorOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link AdamRieseV2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(AdamRieseV2Parser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivOp}
	 * labeled alternative in {@link AdamRieseV2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(AdamRieseV2Parser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberOnly}
	 * labeled alternative in {@link AdamRieseV2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberOnly(AdamRieseV2Parser.NumberOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberOnly}
	 * labeled alternative in {@link AdamRieseV2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberOnly(AdamRieseV2Parser.NumberOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link AdamRieseV2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParens(AdamRieseV2Parser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link AdamRieseV2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParens(AdamRieseV2Parser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link AdamRieseV2Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AdamRieseV2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdamRieseV2Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AdamRieseV2Parser.NumberContext ctx);
}
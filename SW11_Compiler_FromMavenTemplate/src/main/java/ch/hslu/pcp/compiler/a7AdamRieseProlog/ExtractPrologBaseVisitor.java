package ch.hslu.pcp.compiler.a7AdamRieseProlog;

public class ExtractPrologBaseVisitor extends PrologBaseVisitor<String> {
    @Override
    public String visitAssign(PrologParser.AssignContext ctx) {
        return " is ";
    }

    @Override
    public String visitStmt(PrologParser.StmtContext ctx) {
        String prologExpr
                = ctx.ID().getText() // ID
                + visit(ctx.assign()) // assign
                + ctx.expr().getText() // expr
                + ".";
        return prologExpr;
    }
}

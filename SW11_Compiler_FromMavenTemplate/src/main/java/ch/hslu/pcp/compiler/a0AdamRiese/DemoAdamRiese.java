package ch.hslu.pcp.compiler.a0AdamRiese;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class DemoAdamRiese {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // create a CharStream that reads from args[0]
        ANTLRInputStream input = new ANTLRInputStream(args[0]);
        // create a lexer that feeds off of input CharStream
        FinalAdamRieseLexer lexer = new FinalAdamRieseLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        FinalAdamRieseParser parser = new FinalAdamRieseParser(tokens);
        // begin parsing at start rule - stmt
        ParseTree tree = parser.stmt();
        // create a visitor
        EvalVisitor eval = new EvalVisitor();
        // start walking the parse tree - visit
        Integer res = eval.visit(tree);
        System.out.println(args[0]+res);
    }
}

package ch.hslu.pcp.compiler.a4Postman;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class DemoPostman {
    public static void main(String[] args) throws IOException {
        // create a CharStream that reads from args[0]
        ANTLRInputStream input = new ANTLRInputStream(args[0]);
        PostmanLexer lexer = new PostmanLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostmanParser parser = new PostmanParser(tokens);
        ParseTree tree = parser.satz();
    }
}

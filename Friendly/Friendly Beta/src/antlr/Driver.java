package antlr;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Driver {
	public static void main(String[] args) {
	    try {
	        ANTLRInputStream input = new ANTLRInputStream(
	            new FileInputStream(new File("C:/Users/Tyler/Desktop/FRIENDLYtest.txt")));

	        FRIENDLYLexer lexer = new FRIENDLYLexer(input);
	        FRIENDLYParser parser = new FRIENDLYParser(new CommonTokenStream(lexer));
	        parser.addParseListener(new MyListener());

	        // Start parsing
	        parser.program(); 
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}

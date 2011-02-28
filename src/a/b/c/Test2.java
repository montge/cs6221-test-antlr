package a.b.c;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test2 {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream stream = 
			new ANTLRStringStream("3 * (2 + 4) * 3");
		Sample2Lexer lexer = new Sample2Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Sample2Parser parser = new Sample2Parser(tokenStream);
		int result = parser.evaluator();
		System.out.println("ok - result is " + result);
	}

}

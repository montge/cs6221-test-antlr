package a.b.c;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import a.b.c.evaluators.Evaluator;

public class Test3 {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream stream = 
			new ANTLRStringStream("3 * (2 + 4) * 3");
		Sample3Lexer lexer = new Sample3Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Sample3Parser parser = new Sample3Parser(tokenStream);
		Evaluator evaluator = parser.evaluator();
		System.out.println(evaluator.toTreeString(""));
		System.out.println();
		System.out.println("ok - result is " + evaluator.evaluate());
	}

}

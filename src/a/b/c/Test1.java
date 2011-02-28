package a.b.c;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test1 {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
		CharStream stream = 
			new ANTLRStringStream("program XLSample1 =\n" + 
					"/*	constant one : Integer := 1;\n" + 
					"	constant two : Integer := 2;\n" + 
					"	var x,      y,z : Integer := 42; */\n" + 
					"\n" + 
					"	procedure foo() =\n" + 
					"		var x : Integer := 2;\n" + 
					"	begin\n" + 
					"	end foo.\n" + 
					"\n" + 
					"	procedure fee(y : Integer) =\n" + 
					"		var x : Integer := 2;\n" + 
					"	begin\n" + 
					"	end fee.\n" + 
					"\n" + 
					"	function fie(y : Integer) : Integer =\n" + 
					"		var x : Integer := 2;\n" + 
					"	begin\n" + 
					"		return y;\n" + 
					"	end fie.\n" + 
					"\n" + 
					"\n" + 
					"\n" + 
					"begin\n" + 
					"\n" + 
					"/* loop\n" + 
					"	x := x + 1;\n" + 
					"	exit when x = 42;\n" + 
					"end loop;\n" + 
					"\n" + 
					"while x < 10 loop\n" + 
					"end loop; */\n" + 
					"\n" + 
					"//	x := (42 + 6)  * (7 + 10) - x * y;\n" + 
					"//	y := 10;\n" + 
					"//	if x < 10 then\n" + 
					"//		y := 12;\n" + 
					"//		x := 22;\n" + 
					"//		if x = 23 then\n" + 
					"//			y := 2;\n" + 
					"//		else\n" + 
					"//			y := 3;\n" + 
					"//		end if;\n" + 
					"//	elsif x < 20 then\n" + 
					"//		y :=22;\n" + 
					"//	else\n" + 
					"//		y :=32;\n" + 
					"//	end if;\n" + 
					"end XLSample1.");
		SampleLexer lexer = new SampleLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SampleParser parser = new SampleParser(tokenStream);
		parser.program();
		System.out.println("ok");
	}

}

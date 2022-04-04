package pipifax;

import grammar.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Evaluator {

	public static void main(String[] args) {
		try {
			CharStream input = CharStreams.fromFileName(args[0]);
			PfxLexer lexer = new PfxLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			PfxParser parser = new PfxParser(tokens);
			
			System.out.println("Starting with the first production.");
			
			PfxParser.ProgContext program = parser.prog(); // Hiermit bestimmt man die Startproduktion
			
			Calculator calculator = new Calculator();
			program.accept(calculator);
		}catch (Exception e) {
			System.err.println(e);
		}
	}

}

package pipifax;

import grammar.*;

public class Calculator extends PfxBaseVisitor<Integer>{
	
	public Integer visitProg(PfxParser.ProgContext ctx) { 
		System.out.println("Visiting Program");
		for(PfxParser.ExprOrAssignmentOrDeclarationContext e : ctx.exprOrAssignmentOrDeclaration()) {
			e.accept(this);
		}
		return null;
	}
}

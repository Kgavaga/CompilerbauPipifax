move Pfx.g4 _.g4
del Pfx*
move _.g4 Pfx.g4
antlr4 Pfx.g4 && javac Pfx*.java && grun Pfx program ../pipifax/Expr.txt -gui
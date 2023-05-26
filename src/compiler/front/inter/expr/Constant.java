package compiler.front.inter.expr;

import compiler.front.lexer.Keyword;
import compiler.front.lexer.Num;
import compiler.front.lexer.Real;
import compiler.front.lexer.Token;
import compiler.front.symbol.Type;


public class Constant extends Expr {

    public Constant(Token token, Type type) {
        super(token, type);
    }

    public Constant(int i) {
        super(new Num(i), Type.INT);
    }

    public Constant(float i) {
        super(new Real(i), Type.FLOAT);
    }

    public static final Constant True = new Constant(Keyword.TRUE, Type.BOOLEAN),
            False = new Constant(Keyword.FALSE, Type.BOOLEAN);

}
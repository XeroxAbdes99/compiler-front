package compiler.front.inter.expr.logic;
import compiler.front.inter.expr.Expr;
import compiler.front.lexer.Token;
public class Not extends Logical
{

    public Not(Token token, Expr x1) {
        super(token, x1, x1);
    }



}


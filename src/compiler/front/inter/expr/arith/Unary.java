package compiler.front.inter.expr.arith;

import compiler.front.inter.expr.Expr;
import compiler.front.lexer.Token;
import compiler.front.symbol.Type;

public class Unary extends Expr {

    public Expr expr;

    public Unary(Token token, Expr x) {
        super(token, null);
        this.expr = x;
        type = Type.maxNumericType(Type.INT, expr.type);
        if (type == null) {
            error("type error");
        }
    }

}
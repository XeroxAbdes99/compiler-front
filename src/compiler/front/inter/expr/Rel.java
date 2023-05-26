package compiler.front.inter.expr;
import compiler.front.inter.expr.logic.Logical;
import compiler.front.lexer.Token;
import compiler.front.symbol.Array;
import compiler.front.symbol.Type;
public class Rel extends Logical {

    public Rel(Token token, Expr x1, Expr x2) {
        super(token, x1, x2);
    }

    @Override
    public Type check(Type p1, Type p2) {
        if (p1 instanceof Array || p2 instanceof Array) {
            return null;
        } else if (p1 == p2) {
            return Type.BOOLEAN;
        } else {
            return null;
        }
    }

}

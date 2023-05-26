package compiler.front.inter.expr.arith;
import compiler.front.inter.expr.Expr;
import compiler.front.lexer.Token;
import compiler.front.symbol.Type;
public class Arith extends Expr {

    public Expr expr1, expr2;

    public Arith(Token op, Expr x1, Expr x2) {
        super(op, null);
        this.expr1 = x1;
        this.expr2 = x2;
        super.type = Type.maxNumericType(expr1.type, expr2.type);
        if (super.type == null) {
            error("number type expected ,type error ");
        }

    }

}

package compiler.front.inter.expr.logic;
import compiler.front.inter.expr.Expr;
import compiler.front.lexer.Token;
import compiler.front.symbol.Type;


public class Logical extends Expr {

    public Expr expr1, expr2;

    public Logical(Token token, Expr x1, Expr x2) {
        super(token, null);
        this.expr1 = x1;
        this.expr2 = x2;
        type = check(expr1.type, expr2.type);
        if (type == null) {
            System.out.println("type error : boolean expected");
        }
    }

    public Type check(Type p1, Type p2) {
        if (p1 == Type.BOOLEAN && p2 == Type.BOOLEAN) {
            return Type.BOOLEAN;
        } else {
            return null;
        }
    }

}

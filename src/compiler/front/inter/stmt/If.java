package compiler.front.inter.stmt;

import compiler.front.inter.expr.Expr;
import compiler.front.symbol.Type;

public class If extends Stmt {

    public Expr expr;
    public Stmt stmt;

    public If(Expr e, Stmt s) {
        this.expr = e;
        this.stmt = s;
        if (expr.type != Type.BOOLEAN) {
            expr.error("boolean required in if");
        }
    }

}
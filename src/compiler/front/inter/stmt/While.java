package compiler.front.inter.stmt;

import compiler.front.inter.expr.Expr;
import compiler.front.symbol.Type;

public class While extends Stmt{
    Expr expr; Stmt stmt;

    public While() {
        expr= null;
        stmt=null;
    }

    public void init(Expr e, Stmt s) {
        this.expr = e;
        this.stmt = s;
        if (expr.type != Type.BOOLEAN) {
            expr.error("boolean required in while");
        }
    }


}
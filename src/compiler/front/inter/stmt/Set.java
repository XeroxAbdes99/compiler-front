package compiler.front.inter.stmt;

import compiler.front.inter.expr.Expr;
import compiler.front.inter.expr.Id;
import compiler.front.symbol.Type;

public class Set extends Stmt {

    Id id;
    Expr expr;

    public Set(Id id, Expr expr) {
        this.id = id;
        this.expr = expr;
        if (check(id.type, expr.type) == null) {
            error("type error ");
        }
    }

    public Type check(Type p1, Type p2) {
        if (Type.isNumeric(p1) && Type.isNumeric(p2)) {
            return p2;
        } else if (p1 == Type.BOOLEAN && p2 == Type.BOOLEAN) {
            return p2;
        } else {
            return null;
        }
    }

}
package compiler.front.inter.expr;

import compiler.front.lexer.Keyword;
import compiler.front.symbol.Type;
public class Id extends Expr{

    public int offset;

    public Id(Keyword token, Type type, int address) {
        super(token, type);
        this.offset= address;
    }

}
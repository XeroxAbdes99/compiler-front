package compiler.front.inter.expr;
import compiler.front.lexer.Keyword;
import compiler.front.symbol.Type;
import compiler.front.lexer.Tag;
public class Access extends Expr {

    public Id arrayid;
    public Expr index;

    public Access(Id a, Expr i, Type p) {
        super(new Keyword("[]", Tag.ARRAY_TYPE), p);
        arrayid = a;
        index = i;
        if (index.type != Type.INT) {
            System.out.println("array index expected to be int");
        }
    }

}
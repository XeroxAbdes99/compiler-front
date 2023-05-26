package compiler.front.inter.expr;
import compiler.front.inter.Node;
import compiler.front.lexer.Token;
import compiler.front.symbol.Type;
public class Expr extends Node{

    public Token token;
    public Type type;

    public Expr(Token token, Type type) {
        this.token = token;
        this.type = type;
    }

}

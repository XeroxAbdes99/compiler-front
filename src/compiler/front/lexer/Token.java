package compiler.front.lexer;

public sealed class Token permits Keyword,Num,Real  {
    public final int tag;

    public Token(int tag) {
        this.tag = tag;
    }
}

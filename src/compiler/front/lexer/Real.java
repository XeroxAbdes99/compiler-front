package compiler.front.lexer;

public final class Real extends Token {


        public final float value;

        public Real(float value) {
            super(Tag.REAL);
            this.value = value;
        }


}

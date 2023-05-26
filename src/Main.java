import compiler.front.lexer.Lexer;
import compiler.front.parser.Parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {
            try{
                System.setIn(new FileInputStream(new File(args[0])));
                Lexer lexer = new Lexer();
                Parser parser = new Parser(lexer);
                parser.start();
            }
            catch(IOException e){
                e.printStackTrace();

            }
        }
    }

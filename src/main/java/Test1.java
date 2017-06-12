import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) {
        try {
            Reader input =
                    args.length > 0 ?
                    new FileReader(args[0]) :
                    new InputStreamReader(System.in);
            Yylex scanner = new Yylex(input);
            int token;
            do {
                token = scanner.yylex();
                System.out.println(token);
            } while (token != Yylex.YYEOF);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Main {

    public static void main(String[] args) throws Lexer.ParseException {
        Lexer LEX = new Lexer("if (a>b); then c:=\"hello\"; else if (a<b); then \"world\")");
        List<Token> allTokens = new ArrayList<>();
        allTokens.addAll(LEX.getAllTokens());
        allTokens.forEach(new Consumer<Token>() {

            @Override
            public void accept(Token integer) {
                System.out.println(integer.toString());
            }
        });
    }
}
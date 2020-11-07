public class Token {

    private final TokenType TType;
    private final String Text;
    int index,matched;

    public TokenType getTType() {
        return TType;
    }

    @Override
    public String toString() {
        return "Token{" +
                "Type=" + TType +
                ", Text='" + Text + '\'' +
                ", index=" + index +
                ", matched=" + matched +
                '}';
    }

    public int getMatched() {
        return matched;
    }

    public Token(TokenType TType,String Text,int index,int matched) {
        this.TType = TType;
        this.Text = Text;
        this.index = index;
        this.matched = matched;
    }
}
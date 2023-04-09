package lessons.oop;

public class BasicCharacter {

    private char ch;

    private BasicCharacter(char c)
    {
        ch = c;
    }

    public boolean isDigit()
    {
        return ch >= 48 && ch <= 57;
    }

    public boolean isLetter()
    {
        return ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122;
    }

    public boolean isLowerCase()
    {
        return ch >= 97 && ch <= 122;
    }

    public boolean isUpperCase()
    {
        return ch >= 65 && ch <= 90;
    }

    public boolean isWhiteSpace()
    {
        return ch == 32;
    }

    public char toLowerCase()
    {
        return isUpperCase() ? (char)(ch + 32) : ch;
    }

    public char toUpperCase()
    {
        return isLowerCase() ? (char)(ch - 32) : ch;
    }

    public static BasicCharacter valueOf(char c)
    {
        return new BasicCharacter(c);
    }
}

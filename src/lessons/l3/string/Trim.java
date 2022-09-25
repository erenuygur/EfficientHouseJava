package lessons.l3.string;

public class Trim {
    public static void main(String[] args)
    {
        String s = "           Bunu kesin samet demistir           ";
        System.out.printf("(%s)%n", s);
        System.out.printf("(%s)\n", s.trim());
    }
}

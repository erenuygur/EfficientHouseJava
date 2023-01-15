package lessons.languagebasics;

public class OrOperators {
    public static void main(String[] args)
    {
        if (getTrue() | getFalse())
            System.out.println("True");

        System.out.println("------------");

        if (getTrue() | getTrue())
            System.out.println("True");

        System.out.println("---------------");

        if (getFalse() | getFalse())
            System.out.println("True");

        System.out.println("---------------");

        if (getTrue() || getFalse())
            System.out.println("True");

        System.out.println("------------");

        if (getTrue() || getTrue())
            System.out.println("True");

        System.out.println("---------------");

        if (getFalse() || getFalse())
            System.out.println("True");
    }

    public static boolean getTrue()
    {
        System.out.println("getTrue()");
        return true;
    }

    public static boolean getFalse()
    {
        System.out.println("getFalse()");
        return false;
    }
}

package lessons.languagebasics;

public class AndOperators {
    public static void main(String[] args)
    {
        if (getTrue() & getFalse()) // true AND false = false
            System.out.println("True");

        System.out.println("------------");

        if (getTrue() & getTrue()) // true AND true = true
            System.out.println("True");

        System.out.println("---------------");

        if (getFalse() & getFalse()) // false AND false = false
            System.out.println("True");

        System.out.println("---------------");

        if (getFalse() && getTrue()) // false -> false
            System.out.println("True");

        System.out.println("------------");

        if (getTrue() && getTrue()) // true AND true = true
            System.out.println("True");

        System.out.println("---------------");

        if (getFalse() && getFalse()) // false -> false
            System.out.println("True");
    }

    public static boolean getTrue()
    {
        //...
        System.out.println("getTrue()");
        return true;
    }

    public static boolean getFalse()
    {
        //...
        System.out.println("getFalse()");
        return false;
    }
}

package lessons.oop.basics.examples;

public class Tricky {
    public static void main(String[] args)
    {
        int a = 10;
        int b;

        b = 10;

        System.out.println(a); // 10
        System.out.println(b); // 10

        ++a;

        System.out.println(a); // 11
        System.out.println(b); // 10
    }
}

class X {
    public int a;
    public boolean b;

    //...
}

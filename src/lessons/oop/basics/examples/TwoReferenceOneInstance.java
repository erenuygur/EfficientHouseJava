package lessons.oop.basics.examples;

public class TwoReferenceOneInstance {
    public static void main(String[] args)
    {
        A z;
        A y;

        z = new A();
        y = z;

        z.x = 5;
        z.b = true;

        System.out.println(y.x);
        System.out.println(y.b);

        y.x = 10;
        y.b = false;

        System.out.println(z.x);
        System.out.println(z.b);
    }
}

class A {
    public int x;
    public boolean b;
}

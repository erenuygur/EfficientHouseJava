package lessons.oop.basics.statics;

public class Intro {
    public static void main(String[] args)
    {
        System.out.printf("X.i = %d%n", X.i);
        System.out.printf("X.d = %f%n", X.d);

        X.i = 33;
        X.d = 41.41f;

        System.out.printf("X.i = %d%n", X.i);
        System.out.printf("X.d = %f%n", X.d);

        X x = new X();
        System.out.println(x.l);

        X x1 = new X();
        System.out.println(x1.l);

        // X.l = 5; --ERROR
    }
}

class X {
    public static int i;
    public static double d;

    public long l = 12;
}


package lessons.methods.methodoverloading;

public class Example2 {
    public static void main(String[] args)
    {
         // Over.foo(5, 5); -> Error: Ambiguous method call. Both
    }
}

class Over {
    public static void foo(long l, int i)
    {
        //...
    }


    public static void foo(int i, double d)
    {
        //...
    }


    public static void foo(float f, int i)
    {
        //...
    }

}

class Calculator {
    public long add(long a, long b)
    {
        return add(a, b, 0);
    }

    public long add(long a, long b, long c)
    {
        return add(a, b, c, 0);
    }

    public long add(long a, long b, long c, long d)
    {
        return a + b + c + d;
    }

    public double add(double a, double b)
    {
        return add(a, b, 0.);
    }

    public double add(double a, double b, double c)
    {
        return add(a, b, c, 0.);
    }

    public double add(double a, double b, double c, double d)
    {
        return a + b + c + d;
    }
}
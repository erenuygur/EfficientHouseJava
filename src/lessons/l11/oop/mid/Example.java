package lessons.l11.oop.mid;

public class Example {
    public static void main(String[] args)
    {
        Sample x, y, z;

        x = new Sample();
        y = new Sample();
        z = new Sample();

        x.a = 10;
        x.b = true;

        y.a = 20;
        y.b = false;

        z = x;

        System.out.println(z.a);
        System.out.println(z.b);

        z.a++;

        System.out.println(x.a);

        y = z;

        System.out.println(y.a);
        System.out.println(y.b);

        y.b = false;
        y.a--;

        System.out.println(x.a);
        System.out.println(x.b);

    }
}

class Sample {
    public int a;
    public boolean b;
}

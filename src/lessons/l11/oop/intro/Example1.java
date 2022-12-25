package lessons.l11.oop.intro;

public class Example1 {
    public static void main(String[] args)
    {
        Sample s , k;

        s = new Sample();
        k = new Sample();

        s.x = 10;
        s.b = true;

        k.x = 20;
        k.b = false;

        System.out.println(s.x);
        System.out.println(s.b);
        System.out.println("-----------------------------------");
        System.out.println(k.x);
        System.out.println(k.b);
    }
}

class Sample {
    int x;
    boolean b;
}


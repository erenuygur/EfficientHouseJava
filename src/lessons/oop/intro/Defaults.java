package lessons.oop.intro;

public class Defaults {
    public static void main(String[] args)
    {
        K k;

        k = new K();

        System.out.printf("k.b: %d%n", k.b); // 0
        System.out.printf("k.s: %d%n", k.s); // 0
        System.out.printf("k.i: %d%n", k.i); // 0
        System.out.printf("k.l: %d%n", k.l); // 0

        System.out.println("---------------------------");

        System.out.printf("k.f: %f%n", k.f); // 0.0
        System.out.printf("k.d: %f%n", k.d); // 0.0

        System.out.println("---------------------------");


        System.out.printf("k.b: %c%n", k.ch); // character at zero index from unicode table
        System.out.printf("k.b: %b%n", k.bool); // false
    }
}

class K {
    public byte b; // 1  2 4 8 4 8 2 --1
    public short s;
    public int i;
    public long l;

    public float f;
    public double d;

    public char ch;
    public boolean bool;
}





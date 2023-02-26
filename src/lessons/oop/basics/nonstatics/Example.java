package lessons.oop.basics.nonstatics;

public class Example {
    public static void main(String[] args)
    {
        Y y;

        y = new Y();
        System.out.printf("Y.x: %d%n", y.x); // 0

        y.changeX(10);
        System.out.printf("Y.x: %d%n", y.x); // 10

        Y y1 = y;
        System.out.printf("Y.x: %d%n", y1.x); // 10

        y1.changeX(11);
        System.out.printf("Y.x: %d%n", y.x); // 11
    }
}

class Y {
    public int x;

    public void changeX(int a)
    {
        x = a;
    }
}

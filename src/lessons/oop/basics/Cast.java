package lessons.oop.basics;

public class Cast {
    public static void main(String[] args)
    {
        X x;
        Y y;

        x = new X();

        // y = (Y)x; ERROR
    }
}

class X {
    public int x;
    public boolean b;

    //...
}

class Y {
    public int x;
    public boolean b;

    //...
}

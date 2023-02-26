package lessons.oop.basics.nonstatics;

public class Example1 {
    public static void main(String[] args)
    {
       Z.changeX(10);
    }
}

class Z {
    public int x;

    public static void changeX(int a)
    {
        // x = a;  // ERROR: Non-static field 'x' cannot be referenced from a static context
    }
}

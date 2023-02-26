package lessons.oop.basics.nonstatics;

public class Example2 {
    public static void main(String[] args)
    {
        K k = new K();
        k.bar();
    }
}

class K {
    public static void foo()
    {
        // bar(); ERROR: Non-static method 'bar()' cannot be referenced from a static context
        System.out.println("foo()");
    }

    public void bar()
    {
        System.out.println("bar()");
        foo();
    }
}
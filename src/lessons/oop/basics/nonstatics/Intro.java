package lessons.oop.basics.nonstatics;

public class Intro {
    public static void main(String[] args)
    {
        A a = new A();
        a.foo(); // Static member 'lessons.oop.intro.nonstatics.A.foo()' accessed via instance reference

        // A.bar(); --Non-static method 'bar()' cannot be referenced from a static context

        A.foo(); // ++
    }
}

class A {
    public static void foo()
    {
        //...
    }

    public void bar()
    {
        //..
    }
}

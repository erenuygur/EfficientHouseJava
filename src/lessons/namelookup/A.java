package lessons.namelookup;

public class A {

    int b;

    public static void main(String[] args)
    {
        B b = new B(); // B niteliksiz (unqualified)

        B.bar(); // B niteliksiz (unqualified) || bar() (qualified)

        b = new B(); // b niteliksiz (unqualified)
        b.bar(); // niteliksiz (unqualified)

        System.out.println("B.x = " + b.s); // System (unqualified) || out qualified  || println qualified  || b unqualified || s qualified
    }
}


class B {
    int s;

    public static void bar()
    {
        System.out.println("B.bar()");
    }
}
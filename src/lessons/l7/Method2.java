package lessons.l7;

public class Method2 {
    public static void main(String[] args)
    {
        System.out.println("main starts ;)");
        foo();
        bar();
        tar();
        System.out.println("main ends ;(");
    }

    public static void foo()
    {
        System.out.println("foo()");
        bar();
    }

    public static void bar()
    {
        System.out.println("bar()");
        tar();
    }

    public static void tar()
    {
        System.out.println("tar()");
    }
}

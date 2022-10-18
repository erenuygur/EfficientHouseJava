
package lessons.l7;

public class MethodIntro {
    public static void main(String[] args)
    {
        System.out.println("main starts ;)");
        MethodIntro.foo();
        MethodIntro.bar();
        tar();
        System.out.println("main ends ;(");
    }

    public static void foo()
    {
        System.out.println("foo()");
    }

    public static void bar()
    {
        System.out.println("bar()");
    }

    public static void tar()
    {
        System.out.println("tar()");
    }
}



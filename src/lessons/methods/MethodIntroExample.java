package lessons.methods;

public class MethodIntroExample {
    public static void main(String[] args)
    {
        System.out.println("main method starts ;)");
        foo();
        bar();
        tar();
        System.out.println("main method ends ;(");
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

package lessons.l7;

public class MethodCalling {
    public static void main(String[] args)
    {
        System.out.println("main method starts ;)");
        foo("call foo()");
        bar("call bar()");
        tar("call tar()");
        System.out.println("main method ends ;(");
    }

    public static void foo(String message)
    {
        System.out.println(message);
    }

    public static void bar(String message)
    {
        System.out.println(message);
    }

    public static void tar(String message)
    {
        System.out.println(message);
    }
}

package lessons.oop.intro;

public class ClassMembers {
    public static void main(String[] args)
    {
        int a;
    }
}

class A {
    public int x; // field / member field

    public static void foo()
    {
        //...
    }
}

class B {
    public int a;

    public static void foo(int x)
    {
        int a;
    }

   // double a; // error
}

class C {
   public int a, b, c;
   protected static double d, k;
}

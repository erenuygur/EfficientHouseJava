package lessons.methods.methodoverloading;

public class MethodOverloading {

    public static void main(String[] args) {

        // Sample Method for see to explanation method and candidates
        System.out.println("Efficient House");

        // When methods 1, 2 are written
        lessons.methods.methodoverloading.MyMethods.foo(5, 5);

        // lessons.methods.methodoverloading.MethodOverloading.foo(5,5); -> reaching with source path
        MyMethods.foo(5, 5);
        MyMethods.foo(5, 5.0);

        // When YourMethod class was written

        // YourMethods yourMethod = new YourMethods();
        // yourMethod.foo(5,5); -> There is no OVERLOADING

        // When methods 1, 2, 3, 4 are written
        MyMethods myMethod = new MyMethods();
        myMethod.foo(5.5, 5);
        myMethod.foo(5, 5);

        // When just 7, 8, 9 methods are written (AMBIGUITY)
        short s = 5;
        MyMethods.foo(s, 5);
    }
}

class MyMethods {

    // 1
    public static void foo(int a, int b) {
        System.out.println("You are in 1. method -> void method(int, int)");
        System.out.printf("You called this method -> MyMethod.method(%d, %d);", a, b);
    }

    // 2
    public static void foo(int a, double b) {
        System.out.println("You are in 2. method -> void method(int, double)");
        System.out.printf("You called this method -> MyMethod.method(%d, %.2f);", a, b);
    }

    // 3
    public static void foo(short a, long b) {
        System.out.println("You are in 3. method -> void method(short, long)");
        System.out.printf("You called this method -> MyMethod.method(%d, %d);", a, b);
    }

    // 4 non-static
    public void foo(double a, int b) {
        System.out.println("You are in 4. method -> void method(double, int)");
        System.out.printf("You called this method -> MyMethod.method(%.2f, %d);", a, b);
    }

    // 5
    public static void foo(short a, byte b) {
        System.out.println("You are in 5. method -> void method(short, byte)");
        System.out.printf("You called this method -> MyMethod.method(%d, %d);", a, b);
    }

    // 6
    public static void foo(short a, int b) {
        System.out.println("You are in 6. method -> void method(short, int)");
        System.out.printf("You called this method -> MyMethod.method(%d, %d);", a, b);
    }

    // 7
    public static void foo(short a, double b) {
        System.out.println("You are in 7. method -> void method(short, double)");
        System.out.printf("You called this method -> MyMethod.method(%d, %.2f);", a, b);
    }


    // 8
    public static void foo(int a, float b) {
        System.out.println("You are in 8. method -> void method(int, float)");
        System.out.printf("You called this method -> MyMethod.method(%d, %.2f);", a, b);
    }

    // 9
    public static void foo(int a, long b) {
        System.out.println("You are in 9. method -> void method(int, long)");
        System.out.printf("You called this method -> MyMethod.method(%d, %d);", a, b);
    }
}

class YourMethods {
    public void foo(int a, int b) {
        System.out.println("This is YourMethods class");
    }

//    public static void foo(int a, int b) {
//        System.out.println("This is YourMethods class");
//    }
}

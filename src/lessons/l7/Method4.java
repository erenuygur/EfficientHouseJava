package lessons.l7;

public class Method4 {
    public static void main(String[] args)
    {
        addTwoNumbers(5, 6);
        // int a = 5; -> int b = 6;
        // System.out.printf("%d + %d = %d", 5, 6, 11);
        // 5 + 6 = 11

        int a = 5;
        int b = 6;
        addTwoNumbers(a, b);
        // addTwoNumbers(a, b); a = 5 -> b = 6
        // int a = 5; -> int b = 6;
        // System.out.printf("%d + %d = %d", 5, 6, 11);
        // 5 + 6 = 11

        addThreeNumbers(a, 5, b);
        // addThreeNumbers(5, 5, 6);
        // int a = 5; -> int b = 5; -> int c = 6;
        // System.out.printf("%d + %d = %d", 5, 5, 6, 16);
        // 5 + 5 + 6 = 16
    }

    public static void addTwoNumbers(int a, int b) // int a = 5; -> int b = 6;
    {
        System.out.printf("%d + %d = %d%n", a, b, a + b);
    }

    public static void addThreeNumbers(int a, int b, int c)
    {
        System.out.printf("%d + %d + %d = %d%n", a, b, c, a + b + c);
    }
}

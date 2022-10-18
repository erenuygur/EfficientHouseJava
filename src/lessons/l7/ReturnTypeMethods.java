package lessons.l7;

public class ReturnTypeMethods {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        int sum = addTwoNumbers(5, 10);
        // addTwoNumbers(int a, int b)  a = 5 || b = 10
        // int temp = 15
        // int sum = temp;
        System.out.println(sum); // 15

        sum = addThreeNumbers(sum, 12, 13); // 40
        // addThreeNumbers(sum, 12, 13)  sum = 15
        // addThreeNumbers(int a, int b, int c) a = 15 || b = 12 || c = 13
        // return 15 + 12 + 13;
        // int temp = 40;
        // int sum = temp;
        // int sum = 40;
        System.out.println(sum); // 40

        System.out.print("val: ");
        int val = keyboard.nextInt();

        System.out.printf("%d is Even ? = %b", val, isEven(val));

    }

    public static int addTwoNumbers(int a, int b)
    {
        return a + b; // int temp = a + b;
    }

    public static int addThreeNumbers(int a, int b, int c)
    {
        return a + b + c;
    }

    public static boolean isEven(int val)
    {
        return val % 2 == 0;
        // boolean temp = val % 2 == 0;
    }
}

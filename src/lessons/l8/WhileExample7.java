package lessons.l8;
/*
        Write a method named reversed that will take an int argument and returns reverse of argument.

        123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
 */
public class WhileExample7 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int val;
        System.out.println("Number:");

        while ((val = kb.nextInt()) != 0) {
            System.out.printf("%d -> reversed: %d%n", val, reversed(val));
            System.out.println("Number:");
        }
    }

    public static int reversed(int val) // 123
    {
        int result = 0;

        while (val != 0) {  // 123 12 1
            result = result * 10 + val % 10 ; // 3 32 321
            val /= 10;
        }

        return result;
    }
}

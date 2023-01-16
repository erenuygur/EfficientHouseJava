package lessons.loops.whileloops;
/*
	 Write a method named sumDigits that will take an int argument and returns sum of all digits.
*/
public class WhileExample6 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = kb.nextInt();

        System.out.printf("%d -> sum of digits = %d%n", val, sumDigits(val));
    }

    public static int sumDigits(int val)
    {   // 1123
        int sum = 0;

        while (val > 0) {
            sum += val % 10; // 3 + 2 + 1 + 1 = 7
            val /= 10;       // 112 11 1 0
        }

        return sum;
    }
}

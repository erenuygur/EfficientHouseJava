package lessons.l8;

/*
	 Write a method named countDigits that will take an int argument and returns total digits count.
*/

public class DoWhileExample {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int val = kb.nextInt();

        System.out.printf("%d -> total digits count: %d", val, countDigits(val));
    }

    public static int countDigits(int val)
    {
        int count = 0;

        do {
            val /= 10;
            ++count;
        } while (val > 0);

        return count;
    }
}

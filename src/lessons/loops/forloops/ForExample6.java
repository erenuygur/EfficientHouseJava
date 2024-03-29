package lessons.loops.forloops;

public class ForExample6 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Number:");
        int val = kb.nextInt();


        if (isPrime(val))
            System.out.printf("%d. is prime. ", getPrimeIndex(val));
        else
            System.out.println("please enter the prime number");
    }

    public static int getPrimeIndex(int n)
    {
        int count = 1;

        for (int i = 1; i <= n; i += 2) {
            if (isPrime(i))
                count++;
        }

        return count;
    }

    public static boolean isPrime(long a)
    {
        if (a <= 1)
            return false;

        if (a % 2 == 0)
            return a == 2;

        for (long i = 3; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }
}

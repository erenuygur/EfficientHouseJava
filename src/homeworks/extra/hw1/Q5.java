package homeworks.extra.hw1;

public class Q5 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("number:");
            long l = kb.nextLong();

            if (l == 0)
                return;

            if (isPrime(l))
                System.out.printf("%d is prime %n", l);
            else
                System.out.printf("%d is not prime%n", l);
        }
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

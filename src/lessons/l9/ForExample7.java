package lessons.l9;

public class ForExample7 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int val = kb.nextInt();

        System.out.printf("%d. asal sayi: %d", val, getPrime(val));
    }

    public static int getPrime(int n)
    {
        int val = 2;
        int count = 0;

        while (true) {
            if (isPrime(val))
                ++count;

            if (count == n)
                return val;

            val++;
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

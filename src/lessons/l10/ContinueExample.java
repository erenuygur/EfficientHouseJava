package lessons.l10;

public class ContinueExample {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("n: ");
        int n = kb.nextInt();

        for (int i = 0; i <= n; ++i) {
            if (!isPrime(i))
                continue;

            System.out.println(i);
        }
    }

    public static boolean isPrime(int a)
    {
        if (a <= 1)
            return false;

        if (a % 2 == 0)
            return a == 2;

        if (a % 3 == 0)
            return a == 3;

        if (a % 5 == 0)
            return a == 5;

        if (a % 7 == 0)
            return a == 7;

        for (int i = 11; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }
}

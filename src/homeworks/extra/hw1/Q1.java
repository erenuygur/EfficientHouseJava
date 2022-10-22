package homeworks.extra.hw1;

public class Q1 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("a: ");
        int a = kb.nextInt();

        System.out.print("b: ");
        int b = kb.nextInt();

        System.out.print("c: ");
        int c = kb.nextInt();

        display(a, b, c);
    }

    public static void display(int a, int b, int c)
    {
        int min = min(a, min(b, c));
        int max = max(a, max(b, c));
        int mid = a + b + c - (min + max);

        if (min < mid)
            System.out.printf("%d < %d ", min, mid);
        else
            System.out.printf("%d = %d ", min, mid);

        if (mid < max)
            System.out.printf("< %d", max);
        else
            System.out.printf("= %d", max);
    }

    public static int max(int a, int b)
    {
        return a >= b ? a : b;
    }

    public static int min(int a, int b)
    {
        return a <= b ? a : b;
    }
}

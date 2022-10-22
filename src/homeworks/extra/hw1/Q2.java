package homeworks.extra.hw1;

public class Q2 {
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

        System.out.println(mid(a, b, c));
    }

    public static int mid(int a, int b, int c)
    {
        if (b <= a && a <= c || c <= a && a <= b)
            return a;

        if (a <= b && b <= c || c <= b && b <= a)
            return b;

        return c;
    }
}



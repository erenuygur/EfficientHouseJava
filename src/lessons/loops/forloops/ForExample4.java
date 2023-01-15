package lessons.loops.forloops;

public class ForExample4 {
    public static void main(String[] args)
    {
        int n = 5;
        int i;

        for (i = 0; i < n; ++i);
            System.out.printf("%d", i); // 5

        System.out.println("\n--------------");


        for (i = n - 1; i >= 0; --i)
            System.out.printf("%d ", i); // 4 3 2 1 0

        System.out.printf("%ni = %d", i);

    }
}

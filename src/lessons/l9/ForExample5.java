package lessons.l9;

public class ForExample5 {
    public static void main(String[] args)
    {
        for (int i = 0, j = 10; i < 5 && j >= 0; ++i, --j)
            System.out.printf("{i: %d, j: %d}%n", i, j);

        System.out.println("-------------");

        for (int i = 0, j = 10; i < 5 || j >= 0; ++i, --j)
            System.out.printf("{i: %d, j: %d}%n", i, j);

        /*
            {i: 0, j: 10}     0 < 5  -> true || -> true
            {i: 1, j: 9}      1 < 5  -> true || -> true
            ....

            {i: 4, j: 6}      4 < 5  -> true || -> true
            {i: 5, j: 5}      5 < 5  || 5 >= 0 -> false || true -> true
         */
    }
}

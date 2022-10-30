package lessons.l9;

public class ForExample9 {
    public static void main(String[] args)
    {
        // 3 Basamakli Armstrong sayilarinin ic ice dongu ile bulmak

        for (int a = 1; a <= 9; ++a)
            for (int b = 0; b <= 9; ++b)
                for (int c = 0; c <= 9; ++c)
                    if (pow(a, 3) + pow(b, 3) + pow(c, 3) == 100 * a + 10 * b + c)
                        System.out.printf("%d%d%d%n", a, b, c);
    }


    public static int pow(int a, int b)
    {
        int result = 1;

        for (;b != 0; b--) {
            result *= a;
        }

        return result;
    }
}

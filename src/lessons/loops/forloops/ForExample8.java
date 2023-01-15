package lessons.loops.forloops;

public class ForExample8 {
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }

    public static int factorial(int n)
    {
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}

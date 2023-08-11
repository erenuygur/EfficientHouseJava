package lessons.oop.basics.examples;

public class EquationSolver {
    public static void main(String[] args)
    {
        EquationSolverApp.run();
    }
}

class EquationSolverApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("a:");
        int a = kb.nextInt();

        System.out.print("b:");
        int b = kb.nextInt();

        System.out.print("c:");
        int c = kb.nextInt();

        NumberUtil.printRoots(a, b, c);
    }
}

class NumberUtil {
    public static void calculateForDifferentRoots(double delta, int a, int b)
    {
        double x1, x2;
        double sqrtDelta;

        sqrtDelta = Math.sqrt(delta);

        x1 = (-b - sqrtDelta) / 2 * a;
        x2 = (-b + sqrtDelta) / 2 * a;

        System.out.printf("x1 = %f, x2 = %f", x1, x2);
    }

    public static void calculateForSameRoots(int a, int b)
    {
        double x;

        x = -b / (2. * a);

        System.out.printf("x = %f", x);
    }

    public static double getDelta(int a, int b, int c)
    {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static void printRoots(int a, int b, int c)
    {
        double delta = getDelta(a, b, c);

        if (delta > 0)
            calculateForDifferentRoots(delta, a, b);
        else if (delta == 0)
            calculateForSameRoots(a, b);
        else
            System.out.println("No real root");

    }
}

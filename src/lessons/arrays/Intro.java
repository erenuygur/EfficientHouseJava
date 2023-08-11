package lessons.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void IntroArrays()
    {
        int [] a; // array ref.
        boolean b[];
        double[] d;

        Scanner kb = new Scanner(System.in);

        System.out.print("Length: ");
        int n = Integer.parseInt(kb.nextLine());

        a = new int[n];

        System.out.println("Array length: " + a.length);

        for (int i = 0; i < a.length; ++i) {
            System.out.printf("a[%d] = %d%n", i, a[i]);
        }

        System.out.println("--------------------------");

        for (int i = 0; i < a.length; ++i) {
            a[i] = i;
            System.out.printf("a[%d] = %d%n", i, a[i]);
        }


        String[] names = new String[6]; // indexes -> [0, 6)

        for (int i = 0; i < names.length; ++i) {
            System.out.printf("names[%s] = %s%n", i, names[i].concat("x"));
        }

    }
}

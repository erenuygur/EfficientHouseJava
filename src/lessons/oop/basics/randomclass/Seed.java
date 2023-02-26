package lessons.oop.basics.randomclass;

import java.util.Random;
import java.util.Scanner;

public class Seed {
    public static void main(String[] args)
    {
        java.util.Random r = new java.util.Random();

        algorithm(new Random(), new Scanner(System.in));

        r.setSeed(10);

        for (int i = 0; i < 12; ++i)
            System.out.printf("%d ", r.nextInt(9) + 1);

        System.out.println();
    }

    public static void algorithm(java.util.Random r, java.util.Scanner kb)
    {
        int sumForFirstSeed = 0;
        int sumForSecondSeed = 0;

        System.out.print("seed: ");
        r.setSeed(kb.nextLong());

        for (int i = 0; i < 5; ++i) {
            sumForFirstSeed += r.nextInt(100);
        }

        System.out.println("----------------------------------------");

        System.out.print("seed: ");
        r.setSeed(kb.nextLong());

        for (int i = 0; i < 5; i++) {
            sumForSecondSeed += r.nextInt(100);
        }

        System.out.printf("Random Tuncay: %d%n", sumForFirstSeed);
        System.out.printf("Random Berk: %d%n", sumForSecondSeed);


    }
}
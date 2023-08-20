package lessons.arrays.examples;

import java.util.Random;
import java.util.Scanner;
import static lessons.arrays.examples.ArrayMethods.*;

public class ArrayMethodsTest {
    public static Scanner kb = new Scanner(System.in);
    public static Random r = new Random();

    public static void main(String[] args)
    {
        insertionShortTest();
    }

    public static void reverseTest()
    {
        for (;;) {
            System.out.print("Arrays Length:");
            int length = Integer.parseInt(kb.nextLine());

            if (length <= 0)
                break;

            System.out.print("Begin (inclusive):");
            int begin = Integer.parseInt(kb.nextLine());

            System.out.print("End (exclusive):");
            int end = Integer.parseInt(kb.nextLine());

            int [] randomArray = getRandomIntArray(r, length, begin, end);

            displayArray(randomArray);
            System.out.print("reversed array: ");
            reverse(randomArray);
            displayArray(randomArray);
        }
    }

    public static void sumTest()
    {
        for (;;) {
            System.out.print("Arrays Length:");
            int length = Integer.parseInt(kb.nextLine());

            if (length <= 0)
                break;

            System.out.print("Begin (inclusive):");
            int begin = Integer.parseInt(kb.nextLine());

            System.out.print("End (exclusive):");
            int end = Integer.parseInt(kb.nextLine());

            int [] randomArray = getRandomIntArray(r, length, begin, end);

            displayArray(randomArray);
            System.out.printf("Sum of the numbers: %d%n", sum(randomArray));
        }
    }

    public static void selectionSortDescendingTest()
    {
        for (;;) {
            System.out.print("Arrays Length:");
            int length = Integer.parseInt(kb.nextLine());

            if (length <= 0)
                break;

            System.out.print("Begin (inclusive):");
            int begin = Integer.parseInt(kb.nextLine());

            System.out.print("End (exclusive):");
            int end = Integer.parseInt(kb.nextLine());

            int [] randomArray = getRandomIntArray(r, length, begin, end);
            displayArray(randomArray);
            selectionSortDescending(randomArray);
            displayArray(randomArray);

        }
    }


    public static void selectionSortAscendingTest()
    {
        for (;;) {
            System.out.print("Arrays Length:");
            int length = Integer.parseInt(kb.nextLine());

            if (length <= 0)
                break;

            System.out.print("Begin (inclusive):");
            int begin = Integer.parseInt(kb.nextLine());

            System.out.print("End (exclusive):");
            int end = Integer.parseInt(kb.nextLine());

            int [] randomArray = getRandomIntArray(r, length, begin, end);
            displayArray(randomArray);
            selectionSortAscending(randomArray);
            displayArray(randomArray);

        }
    }

    public static void bubbleSortAscendingTest()
    {
        for (;;) {
            System.out.print("Arrays Length:");
            int length = Integer.parseInt(kb.nextLine());

            if (length <= 0)
                break;

            System.out.print("Begin (inclusive):");
            int begin = Integer.parseInt(kb.nextLine());

            System.out.print("End (exclusive):");
            int end = Integer.parseInt(kb.nextLine());

            int [] randomArray = getRandomIntArray(r, length, begin, end);
            displayArray(randomArray);
            bubbleSortAscending(randomArray);
            displayArray(randomArray);

        }
    }

    public static void bubbleSortDescendingTest()
    {
            System.out.print("Arrays Length:");
            int length = Integer.parseInt(kb.nextLine());

            System.out.print("Begin (inclusive):");
            int begin = Integer.parseInt(kb.nextLine());

            System.out.print("End (exclusive):");
            int end = Integer.parseInt(kb.nextLine());

            int [] randomArray = getRandomIntArray(r, length, begin, end);
            displayArray(randomArray);

            long startTime = System.currentTimeMillis();
            bubbleSortDescending(randomArray);
            long endTime = System.currentTimeMillis();

            System.out.printf("Bircan: %d%n", endTime - startTime);
            displayArray(randomArray);
    }

    public static void insertionShortTest()
    {
        System.out.print("Arrays Length:");
        int length = Integer.parseInt(kb.nextLine());

        System.out.print("Begin (inclusive):");
        int begin = Integer.parseInt(kb.nextLine());

        System.out.print("End (exclusive):");
        int end = Integer.parseInt(kb.nextLine());

        int [] randomArray = getRandomIntArray(r, length, begin, end);
        displayArray(randomArray);

        long startTime = System.nanoTime();
        insertionShort(randomArray);
        long endTime = System.nanoTime();

        System.out.println("--------------------------");
        displayArray(randomArray);
        System.out.printf("Time efficiency: %d%n", endTime - startTime);
    }
    public static void insertionShortAscendingTest()
    {
        System.out.print("Arrays Length:");
        int length = Integer.parseInt(kb.nextLine());

        System.out.print("Begin (inclusive):");
        int begin = Integer.parseInt(kb.nextLine());

        System.out.print("End (exclusive):");
        int end = Integer.parseInt(kb.nextLine());

        int [] randomArray = getRandomIntArray(r, length, begin, end);
        displayArray(randomArray);

        long startTime = System.nanoTime();
        insertionShortAscending(randomArray);
        long endTime = System.nanoTime();

        System.out.println("--------------------------");
        displayArray(randomArray);
        System.out.printf("Time efficiency: %d%n", endTime - startTime);
    }
    public static void insertionShortDescendingTest()
    {
        System.out.print("Arrays Length:");
        int length = Integer.parseInt(kb.nextLine());

        System.out.print("Begin (inclusive):");
        int begin = Integer.parseInt(kb.nextLine());

        System.out.print("End (exclusive):");
        int end = Integer.parseInt(kb.nextLine());

        int [] randomArray = getRandomIntArray(r, length, begin, end);
        displayArray(randomArray);

        long startTime = System.nanoTime();
        insertionShortDescending(randomArray);
        long endTime = System.nanoTime();

        System.out.println("--------------------------");
        displayArray(randomArray);
        System.out.printf("Time efficiency: %d%n", endTime - startTime);
    }

}

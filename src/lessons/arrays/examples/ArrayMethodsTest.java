package lessons.arrays.examples;

import java.util.Random;
import java.util.Scanner;
import static lessons.arrays.examples.ArrayMethods.*;

public class ArrayMethodsTest {
    public static Scanner kb = new Scanner(System.in);
    public static Random r = new Random();

    public static void main(String[] args)
    {
        bubbleSortDescendingTest();
        System.out.println("--------------------------");
        bubbleSortDescendingSametTest();
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

    public static void bubbleSortDescendingSametTest()
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
            bubbleSortDescendingSamet(randomArray);
            long endTime = System.currentTimeMillis();
            System.out.printf("Samet: %d%n", endTime - startTime);

            displayArray(randomArray);
    }
}

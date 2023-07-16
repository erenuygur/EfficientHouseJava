package lessons.arrays.examples;

import java.util.Random;
import java.util.Scanner;
import static lessons.arrays.examples.ArrayMethods.*;

public class ArrayMethodsTest {
    public static Scanner kb = new Scanner(System.in);
    public static Random r = new Random();

    public static void main(String[] args)
    {
        bubbleSortAscendingTest();
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
}

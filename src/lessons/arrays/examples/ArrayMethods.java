package lessons.arrays.examples;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {

    public static void bubbleSortAscending(int[] a)
    {
        for (int i = a.length - 1; i > 0; --i)
            for (int j = 0; j < i; ++j)
                if (a[j] > a[j + 1])
                    swap(a, j, j + 1);
    }

    public static void bubbleSortDescending(int[] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int j = a.length -1; j > 0; --j)
                if (a[j] > a[j - 1])
                    swap(a, j , j -1);
    }

    public static void bubbleSortDescendingSamet(int[] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int j = a.length -1; j > i; --j)
                if (a[j] > a[j - 1])
                    swap(a, j , j -1);
    }


    public static void displayArray(int[] a)
    {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static int[] getRandomIntArray(int length, int start, int end)
    {
       return getRandomIntArray(new Random(), length, start, end);
    }

    public static int[] getRandomIntArray(Random r, int length, int start, int end)
    {
        int[] randomArray = new int[length];

        for (int i = 0; i < randomArray.length; ++i) {
            randomArray[i] = r.nextInt(start, end);
        }

        return randomArray;
    }

    public static int max(int[] nums)
    {
        int max = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > max)
                max = nums[i];
        }

        return max;
    }

    public static int min(int[] nums)
    {
        int min = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < min)
                min = nums[i];
        }

        return min;
    }

    public static double average(int[] nums)
    {
        return (double) sum(nums) / nums.length;
    }

    public static void reverse(int[] nums)
    {
        int lastIndex = nums.length - 1;

        for (int i = 0; i < nums.length / 2; ++i) {
            int temp = nums[i];
            nums[i] = nums[lastIndex - i];
            nums[lastIndex - i] = temp;
        }
    }

    public static void selectionSortAscending(int[] a)
    {
        for (int i = 0; i < a.length - 1; ++i) {

            int minIndex = i;

            for (int j = i + 1; j < a.length; ++j)
                if (a[j] < a[minIndex])
                    minIndex = j;


            swap(a, i, minIndex);
        }
    }

    public static void selectionSortDescending(int[] a)
    {
        for (int i = 0; i < a.length - 1; ++i) {

            int maxIndex = i;

            for (int j = i + 1; j < a.length; ++j)
                if (a[maxIndex] < a[j])
                    maxIndex = j;

            swap(a, i, maxIndex);
        }
    }

    public static int sum(int[] nums)
    {
        int result = 0;

        for (int i = 0; i < nums.length; ++i) {
            result += nums[i];
        }

        return result;
    }

    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}


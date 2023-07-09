package lessons.arrays.examples;

import java.util.Random;

public class ArrayMethods {


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


    public static int[] reverse(int[] nums)
    {
        int lastIndex = nums.length - 1;

        for (int i = 0; i < nums.length / 2; ++i) {
            int temp = nums[i];
            nums[i] = nums[lastIndex - i];
            nums[lastIndex - i] = temp;
        }

        return nums;
    }

    public static int sum(int[] nums)
    {
        int result = 0;

        for (int i = 0; i < nums.length; ++i) {
            result += nums[i];
        }

        return result;
    }
}


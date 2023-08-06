package lessons.arrays.lottery;

import lessons.arrays.examples.ArrayMethods;

import java.util.Random;

public class NumericLottery {
    public int[] nums = new int[6];

    public void fillNumsAndSortAscending(Random r)
    {
        for (int i = 0; i < nums.length; ++i) {
            int num;

            do {
                num = r.nextInt(90) + 1;
            } while(contains(num));

            nums[i] = num;
        }
    }

    public boolean contains(int n)
    {
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == n)
                return true;
        }

        return false;
    }

    public int[] getNums(Random random)
    {
        fillNumsAndSortAscending(random);
        ArrayMethods.bubbleSortAscending(nums);
        return nums;
    }
}

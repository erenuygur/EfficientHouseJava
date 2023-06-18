package lessons.arrays;

public class Initialization {
    public static void initExamples()
    {
        int[] nums = new int[5];
        int[] ages = {1, 2, 3, 5};
        double[] heights = new double[] {1.86, 1.93, 1.78, 1.56};

        for (int i = 0; i < ages.length; ++i) {
            System.out.printf("ages[%d] = %d%n", i, ages[i]);
        }

        System.out.println("------------------------");

        for (int i = heights.length - 1; i >= 0; --i) {
            System.out.printf("ages[%d] = %f%n", i, heights[i]);
            heights[i] = heights[i] * 2;
        }
    }
}

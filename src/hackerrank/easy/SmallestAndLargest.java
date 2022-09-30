package hackerrank.easy;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Substring length: ");
        int k = Integer.parseInt(kb.nextLine());

        System.out.print("Text: ");
        String s = kb.nextLine();


        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k)
    {
        String max = s.substring(0, k);
        String min = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; ++i) {

            String text = s.substring(i, i + k);
            if (max.compareTo(text) < 0)
                max = text;

            if (min.compareTo(text) > 0)
                min = text;
        }

        return max + "\n" + min;
    }
}

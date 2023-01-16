package lessons.loops.whileloops;

/*
    Write a method named countPositiveAndNegatives that takes no argument and that will sum positive and
    negative numbers and until entered zero from input. This will display total positives and negatives on the
    screen.
*/

public class WhileExample3 {
    public static void main(String[] args)
    {
        countPositiveAndNegatives();
    }

    public static void countPositiveAndNegatives()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter numbers (EXIT = 0):");
        int val;

        int positive = 0, negative = 0;

        while ((val = kb.nextInt()) != 0) {
            if (val > 0)
                positive += val;
            else
                negative += val;
        }

        display(positive, negative);
    }

    public static void display(int positive, int negative)
    {
        if (positive > 0)
            System.out.printf("Sum of Positive numbers: %d%n", positive);
        else
            System.out.println("You have not entered any Positive number");

        if (negative < 0)
            System.out.printf("Sum of Negative numbers: %d%n", negative);
        else
            System.out.println("You have not entered any Negative number");
    }
}

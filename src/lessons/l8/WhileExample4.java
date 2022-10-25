package lessons.l8;
/*
    Write a method named countPositiveAndNegatives that takes no argument and that will count positive,
    negative numbers and until entered zero from input. This will display total count of positives and negatives on the
    screen.
*/
public class WhileExample4 {
    public static void main(String[] args)
    {
        countPositiveAndNegatives();
    }

    public static void countPositiveAndNegatives() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Sayilari girmeye basla !!");

        int posSum = 0, negSum = 0;
        int posCount = 0, negCount = 0;
        int val;

        while ((val = kb.nextInt()) != 0) {
            if (val > 0) {
                posSum += val;
                ++posCount;
            } else {
                negSum += val;
                ++negCount;
            }
        }

        display(posSum, posCount, negSum, negCount);
    }

    public static void display(int posSum, int posCount, int negSum, int negCount)
    {
        if (posCount > 0)
            System.out.printf("%d numbers of positive sum:%d%n", posCount, posSum);
        else
            System.out.println("You have not entered any Positive number");

        if (negCount > 0)
            System.out.printf("%d numbers of negative sum:%d%n", negCount, negSum);
        else
            System.out.println("You have not entered any Negative number");

    }
}

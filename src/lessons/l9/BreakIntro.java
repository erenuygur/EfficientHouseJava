package lessons.l9;

public class BreakIntro {
    public static void main(String[] args)
    {
       // finds the sum of all values entered until 0 is entered from the input ?

        java.util.Scanner kb = new java.util.Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Number:");
            int val = kb.nextInt();

            if (val == 0) {
                break;
            }

            sum += val;
        }
        System.out.printf("sum: %d%n", sum);
    }
}



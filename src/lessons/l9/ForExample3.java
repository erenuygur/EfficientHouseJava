package lessons.l9;

public class ForExample3 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Number: ");
        int n = kb.nextInt();

        int i; // declare

        for (i = 0; i < n; i++) { // init; boolean exp; update
            System.out.printf("%d ", i);
        }

        System.out.println(i);
        // i = 5

        System.out.println("-------------------");

        for (System.out.println("init"); i < n; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println("\nBye");
    }
}

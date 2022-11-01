package lessons.l9;

public class ForExample1 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Number: ");
        int n = kb.nextInt();

        int i = 0;

        for (System.out.println("INITIALIZE"); i < n; System.out.println("UPDATE")) {
            System.out.println("STATEMENT");
            ++i;
        }
        //...

        int j;

        for (j = 1; j < n;) {
            System.out.println(j);
            //...

            j += 2;
        }

        // System.out.println(j); ERROR
    }
}

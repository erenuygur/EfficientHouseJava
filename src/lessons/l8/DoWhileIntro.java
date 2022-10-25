package lessons.l8;

public class DoWhileIntro {
    public static void main(String[] args)
    {
        /*
        do {
            <statements>
        } while (condition);
         */

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Number:");
        int n = kb.nextInt();

        int i = 0;

        do {
            System.out.printf("%d ", i);
            ++i;
        } while (i < n);

    }
}

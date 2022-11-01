package lessons.l9;

public class ForExample2 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Number: ");
        int n = kb.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println("------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", i);
        }
    }
}

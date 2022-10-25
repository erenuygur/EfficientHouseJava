package lessons.l8;

public class WhileExample {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("How many times you want to loop through:");
        int n = kb.nextInt();

        System.out.println("------------------");

        int i = 0;

        while (i < n) {
            System.out.println(i);
            i = i + 1;
        }

        System.out.printf("i = %d%n", i);

        System.out.println("How many times you want to loop through:");
        int n2 = kb.nextInt();

        System.out.println("------------------");

        int j = 1;

        while (j <= n2) {
            System.out.println(j);
            j++;
        }

        System.out.printf("j = %d", j);
    }
}

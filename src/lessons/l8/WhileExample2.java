package lessons.l8;

public class WhileExample2 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Kac defa donmek istiyorsunuz:");
        int n = kb.nextInt();

        System.out.println("----------");

        int i = 0;

        while (i < n--) {
            System.out.println(n);
        }

        System.out.printf("n = %d", n);
    }
}

package lessons.l9;

public class BreakIntro {
    public static void main(String[] args)
    {
       // Klavyeden 0 girilene kadar girilen butun degerlerin toplamini bulan program ?

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



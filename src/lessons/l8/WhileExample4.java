package lessons.l8;
/*
    Klavyeden sifir girilene kadar girilen degerleri pozitif ve negatif olarak toplayip kacar tane girildigin ekrana bastir.
 */
public class WhileExample4 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run() {
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
            System.out.printf("%d tane pozitif sayinin toplami:%d%n", posCount, posSum);
        else
            System.out.println("Pozitif sayi girilmemistir");

        if (negCount > 0)
            System.out.printf("%d tane negatif sayinin toplami:%d%n", negCount, negSum);
        else
            System.out.println("Negatif sayi girilmemistir");

    }
}

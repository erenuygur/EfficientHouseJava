package lessons.l8;

/*
    Klavyeden sifir girilene kadar girilen degerleri pozitif ve negatif olarak toplayip ekrana bastir.
 */

public class WhileExample3 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int val;
        int positive = 0, negative = 0;

        while ((val = kb.nextInt()) != 0) {
            if (val > 0)
                positive += val;
            else
                negative += val;
        }

        display(positive, negative);
    }

    public static void display(int positive, int negative)
    {
        if (positive > 0)
            System.out.printf("Pozitif sayilar toplami: %d%n", positive);
        else
            System.out.println("Hic pozitif sayi girmediniz");

        if (negative < 0)
            System.out.printf("Negatif sayilar toplami: %d%n", negative);
        else
            System.out.println("Hic negatif sayi girmediniz");
    }
}

package lessons.l9;

public class ForExample1 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int n = kb.nextInt();

        int i = 0;

        for (System.out.println("EFFICIENT HOUSE"); i < n; System.out.println("Abi boolean exp e bakmadan once bunu yaparim")) {
            System.out.println(i);
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

package lessons.loops.forloops;

public class ForIntro {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Kac defa donmek istiyorsunuz");
        int n = kb.nextInt();

        int i = 0; // init

        while (i < n) { //boolean exp.
            System.out.println(i);
            //...

            ++i;
        }

        System.out.println("------------------------");


        for (int i2 = 0; i2 < 5; i2++) {
            System.out.println(i2);
        }
    }
}

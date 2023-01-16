package lessons.languagebasics;

public class OperatorsExample {
    public static void main(String[] args)
    {
        int a = 10;
        int b;

//        ++a; // a = a + 1;
//        System.out.println(a);

//        b = a++;
//        b = ++a;

        b = 5 + a++;

//        System.out.println(b);
//        System.out.println(a);

        int x = 10;
        int y = 20;
        int z;

        z = ++x - y++ + 12;
//        z = 11 - 20 + 12;
//        z = 3;
//        y = y + 1;

        System.out.println(z); // 3
        System.out.println(x); // 11
        System.out.println(y); // 21

//        int x1 = 10;
//        int x2 = 1 - --x1; // x2 = -8; // x1 = 9;
//        System.out.println(x1); // 9
//        System.out.println(x2); // -8

        System.out.println("----------------");

        int x2 = 10;
        int y2 = 9;
        int z2 = 6;

        int q = x2++ - --y2 + z2++ - 15; // q = 10 - 8 + 6 - 15 // q = -7
        System.out.println(x2); // 11
        System.out.println(y2); // 8
        System.out.println(z2); // 7
        System.out.println(q); // -7


        int total = 10 * 6 / 3 + 11 - 21;
        // 1 - total = 60 / 3 + 11 - 21;
        // 2 - total = 20 + 11 - 21;
        // 3 - total = 31 - 21;
        // 4 - total = 10;

        int total2 = 10 * 6 / (3 + 11) - 21;
        // 1 - total = 10 * 6 / 14 - 21;
        // 2 - total = 60 / 14 - 21;
        // 3 - total = 4 - 21;
        // 4 - total = -17;

        int k = 5;
        int l = 8;
        int m = -13;

        int total3 = k++ * 12 + --l - 15 / m-- * 3;
        // 1 - total = 5 * 12 + 7 - 15 / -13 * 3;
        // 2 - total = 60 + 7 - 15 / -13 * 3;
        // 3 - total = 60 + 7 - -1 * 3;
        // 4 - total = 60 + 7 - -3;
        // 5 - total = 67 - -3;
        // 5 - total = 70;

        System.out.println(k); // 6
        System.out.println(l); // 7
        System.out.println(m); // -14
        System.out.println(total3); // 70

        System.out.println("---------------------");
        int q1 = 10;
        q1 = q1++; // Brain f*ck

        System.out.println(q1); // 10

        q1 = ++q1; // q1 = (q1 + 1;);

        System.out.println(q1);
    }
}

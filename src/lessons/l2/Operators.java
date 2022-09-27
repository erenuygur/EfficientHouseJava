package lessons.l2;

public class Operators {
    public static void main(String[] args)
    {
        final double EXCHANGE_RATE = 18.54; //CONSTANT
        final double PI = 3.142; //CONSTANT
//        PI = 5.6; //ERROR
//        EXCHANGE_RATE = 18.56; //ERROR

        double b = 5 / 3;
        System.out.println(b);

        mathOp();
    }

    public static void mathOp()
    {
        int a = 5, b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//        a += b;
//        a -= b;
//        a *= b;
//        a /= b;
//        a %= b;

        a++;

        b = a++; // first assign b's value to a's value after that increment "a" with one
        b = ++a; // increment "a" with one after that assign b's value to a's value after that
        b = --a;
        b = a--;
    }

}

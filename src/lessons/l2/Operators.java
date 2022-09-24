package lessons.l2;

public class Operators {
    public static void main(String[] args)
    {
        final double DOLAR_KURU = 18.54; //CONSTANT (SABIT)
        final double PI = 3.142; //CONSTANT
//        PI = 5.6; //ERROR
//        DOLAR_KURU = 18.56; //ERROR

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

        b = a++; // abi once b ye a'nin degerini ver sonra a'yi 1 arttir.
        b = ++a; // abi once a'yi 1 arttir sonra b ye a'nin degerini ver.
        b = --a;
        b = a--;
    }

}

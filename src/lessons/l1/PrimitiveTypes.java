/*
    Merhabalar benim adim Bircan SANA SELAMLAR
 */
package lessons.l1;

public class PrimitiveTypes {
    public static void main(String[] args)
    {
        int i = 0b1010; //binary
        System.out.println(i);

        int i2 = 1010; //decimal
        System.out.println(i2);

        int i3 = 0137; //Octal integer
        System.out.println(i3);

        int i4 = 0x35A;
        System.out.println(i4);

        char ch = 65535; //int (decimal)
        System.out.println(ch);

        char ch2 = 0x59; // Hexadecimal
        System.out.println(ch2);

        char ch3 = 0b1011001; // Binary
        System.out.println(ch3);

        char ch4 = 0131; // Octal (8)
        System.out.println(ch4);

        char ch5 = 0xFFFF; // char -> [0, 65535]
        System.out.println(ch5);

        System.out.println("Y = \u0059 \nA = \u2161 HASTASIN");
    }

    public static void decimalNumbers()
    {
        byte b = 127;
        short s = 32333;
        int i = 5342342;
        long l = 1_000_000_000_000L;
    }

    public static void floatingNumbers()
    {
        float f = 3.14f;
        final double AVAGADRO_NUMBER = 6.023e23;
    }
}

package lessons.oop.stringexamples;

/*
    - '\t' Horizontal tabulation

	- '\n' Line feed

	- '\f form feed

	- '\r' carriage return

    byte b = Byte.parseByte("127");
    short s = Short.parseShort("320");
    int i = Integer.parseInt("66000");
    long l = Long.parseLong("200000000000");

    float f = Float.parseFloat("3.2f");
    double d = Double.parseDouble("5.5");

    boolean bool = Boolean.parseBoolean("false");
 */

import java.util.Random;

public class StringMethodTest {
    public static void main(String[] args)
    {
//        CapitalizeTest.run();
//        RemoveAllWhitespacesTest.run();
//        IsBlankTest.run();
//        LeftRightPadTest.run();
//        PangramTest.run();
        RandomTextTest.run();
    }
}

class CapitalizeTest {
    public static void run()
    {
        System.out.println(StringMethods.capitalize(")=__09mER?)()_hAba")); //
    }
}

class RemoveAllWhitespacesTest {
    public static void run()
    {
        System.out.println("(" + StringMethods.removeAllWhiteSpaces("    Efficient      House      ") + ")");
    }
}

class IsBlankTest {
    public static void run()
    {
        String str = "                ";
        System.out.printf("(%s) is Empty ? -> %b%n",str, str.isEmpty());
        System.out.printf("(%s) is Blank or Empty ? -> %b%n",str, str.isBlank());
    }
}

class LeftRightPadTest {
    public static void run()
    {
        String str = "Efficient";
        System.out.printf("(%s)%n", StringMethods.leftPad(str, 12));
        System.out.printf("(%s)\n", StringMethods.leftPad(str, 12, '*'));
        System.out.printf("(%s)%n", StringMethods.rightPad(str, 12));
        System.out.printf("(%s)\n", StringMethods.rightPad(str, 12, '*'));
    }
}

class PangramTest {
    public static void run() {
        System.out.println(StringMethods.isPangramTR("Açgözlü ve hoşnut, prestije feci bağımlıydık."));
        System.out.println(StringMethods.isPangramEN("the quick brown fox jumps over a lazy dog"));
    }
}

class RandomTextTest {
    public static void run()
    {
        java.util.Random r = new java.util.Random();
        r.setSeed(13);

        System.out.println(StringMethods.getRandomTextTR(r, 10));
    }
}
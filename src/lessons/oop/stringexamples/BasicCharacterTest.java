package lessons.oop.stringexamples;

import lessons.oop.BasicCharacter;

public class BasicCharacterTest {
    public static void main(String[] args)
    {
        // String text = " e 25 f 09  f i  c i 2 e 0  n t 2 h o  2 u s e ";

        String str = "M1e1... rh1a1/*b..1a= 4 be nim= ad2313im=  ***Er12563e n=/11*2 b4e6n=*Ef f i2*46c i e5n*8t= Ho-14 5*us33e= u*35y3*e4231*si34*yi*m=";
        String letters = "";
        String numbers = "";
        int spaceCountInText = 0;
        String encryptMessage = "";

        for (int i = 0; i < str.length(); ++i) {
            BasicCharacter character = BasicCharacter.valueOf(str.charAt(i));

            if (character.isDigit())
                numbers += str.charAt(i);

            if (character.isLetter())
                letters += str.charAt(i);

            if (character.isWhiteSpace())
                ++spaceCountInText;
        }

        for (int i = 0; i < str.length(); ++i)
        {
            BasicCharacter character = BasicCharacter.valueOf(str.charAt(i));

            if (character.isLetter())
                encryptMessage += str.charAt(i);

            if (str.charAt(i) == '=')
                encryptMessage += " ";
        }


        String result = "";
        for (int i = 0; i < letters.length(); ++i) {
            BasicCharacter character = BasicCharacter.valueOf(letters.charAt(i));

            result += i % 2 == 0 ? character.toLowerCase() : character.toUpperCase();
        }

        System.out.printf("Numbers: %s%n", numbers);
        System.out.printf("Letters: %s%n", letters);
        System.out.printf("Space Count: %d%n", spaceCountInText);
        System.out.printf("Letters (lower case): %s%n", result);
        System.out.printf("sifre: %s%n", encryptMessage);

        /*
                System.out.println((byte)0xFFFF); // - 1
                System.out.println((short)0xFFFF); // - 1
                System.out.println((int)((char)0xFFFF)); // 65535
                System.out.println(0xFFFF); // 65535
                System.out.printf("%.32f%n", (float)0xFFFF); // IEEE754
                System.out.printf("%.32f%n", (double)0xFFFF); // IEEE754

                long l = 0b10100100;
                System.out.println(l);
                int i = (int)l;
                System.out.println(i);
                short s = (short)i;
                System.out.println(s);
                byte b = (byte)s;
                System.out.println(b);
         */

    }
}


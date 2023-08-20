package lessons.oop.stringexamples;

import java.util.Random;

public class StringMethods{
    public static String TRAlphabet = "abcçdefgğhıijklmnoöprsştuüvyz";
    public static String ENAlphabet = "abcdefghijklmnopqrstuvwxyz";
    public static Random random = new Random();

    public static String capitalize(String str)
    {
        int idx;

        for (idx = 0; idx < str.length() && !Character.isLetter(str.charAt(idx)); ++idx);

        return str.substring(0, idx) + Character.toUpperCase(str.charAt(idx)) + str.substring(idx + 1).toLowerCase();
    }

    public static String concatWithDelimiter(String delimiter)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter your texts:");
        String result = "";

        while (true) {
            String text = kb.nextLine();

            if (text.equals("quit"))
                break;

            result = result.concat(text).concat(delimiter);
        }

        return result.substring(0, result.length() - delimiter.length());
    }

    public static String concatWithDelimiter(char delimeter)
    {
        return concatWithDelimiter(String.valueOf(delimeter));
    }

    public static void displayFullAddress()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("web address:");
        String address = kb.nextLine(); // www.google.com

        if (!address.startsWith("https://"))
            address = "https://www."  + address; //

        if (!address.endsWith(".com"))
            address += ".com";

        System.out.println(address);
    }

    /**

     **/
    public static String getRandomText(java.util.Random random, int len, String alphabet)
    {
        String resultText = "";

        for (int i = 0; i < len; ++i) {
            resultText += alphabet.charAt(random.nextInt(alphabet.length()));
        }

        return resultText;
    }

    public static String getRandomTextEN(int len)
    {
        return getRandomText(random, len, ENAlphabet);
    }

    public static String getRandomTextEN(java.util.Random r, int len)
    {
        return getRandomText(r, len, ENAlphabet);
    }

    public static String getRandomTextTR(int len)
    {
        return getRandomText(random, len, TRAlphabet);
    }

    public static String getRandomTextTR(java.util.Random r, int len)
    {
        return getRandomText(r, len, TRAlphabet);
    }

    public static String leftPad(String str, int len, char ch)
    {
        int length = str.length();

        return length >= len ? str : (ch + "").repeat(len - length) + str;
    }

    public static String leftPad(String str, int len)
    {
        return leftPad(str, len, ' ');
    }

    public static boolean isPangramEN(String text)
    {
        return isPangram(text, ENAlphabet);
    }

    public static boolean isPangramTR(String text)
    {
        return isPangram(text, TRAlphabet);
    }

    public static boolean isPangram(String text, String alphabet)
    {
        String lowerText = text.toLowerCase();

        for (int i = 0; i < alphabet.length(); ++i) {
            if (!lowerText.contains(alphabet.charAt(i) + ""))
                return false;
        }

        return true;
    }

    public static boolean isPalindrome(String str)
    {
        return str.equals(reversed(str));
    }


    public static String reversed(String str)
    {
        char[] chars = str.toCharArray();
        int lastIndex = chars.length - 1;

        for (int i = 0; i < chars.length / 2; ++i) {
            char temp = chars[lastIndex - i];
            chars[lastIndex - i] = chars[i];
            chars[i] = temp;
        }

        return String.valueOf(chars);
    }

    public static String removeAllWhiteSpaces(String str) // It's not best practice
    {
        String result = "";

        for (int i = 0; i < str.length(); ++i)
            if (str.charAt(i) != ' ')
                result += str.charAt(i);

        return result;
    }

    public static String rightPad(String str, int len, char ch)
    {
        int length = str.length();

        return length >= len ? str : str + (ch + "").repeat(len - length) ;
    }

    public static String rightPad(String str, int len)
    {
        return rightPad(str, len, ' ');
    }

}



package lessons.oop.util;

public class StringUtil {

    public static boolean isPalindrom(String str)
    {
        return str.equals(reversed(str));
    }

    public static String reversed(String str)
    {
        String result = "";

        for (int i = str.length() - 1; i >= 0; --i)
            result += str.charAt(i);

        return result;
    }
}

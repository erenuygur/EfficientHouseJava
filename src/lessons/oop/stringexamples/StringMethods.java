package lessons.oop.stringexamples;

public class StringMethods{

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

}



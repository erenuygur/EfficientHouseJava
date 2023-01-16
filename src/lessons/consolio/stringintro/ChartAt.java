package lessons.consolio.stringintro;

public class ChartAt {
    public static void main(String[] args)
    {
        //Returns: the char value at the specified index of this string. The first char value is at index 0.

        String str = "EFFICIENT HOUSE ";

        int lastIndex = str.length() - 1;
        System.out.println(lastIndex);

        char lastChar = str.charAt(lastIndex);
        System.out.println(str.charAt(lastIndex));

        for (int i = 0; i < str.length(); i = i + 1) {
            System.out.printf("%c " , str.charAt(i));
        }
    }
}

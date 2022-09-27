package lessons.l3.string;

public class ChartAt {
    public static void main(String[] args)
    {
        // charAt method is used to get the character in any index

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

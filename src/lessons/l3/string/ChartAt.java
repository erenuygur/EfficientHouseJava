package lessons.l3.string;

public class ChartAt {
    public static void main(String[] args)
    {
        // charAt metodu herhangi bir indexteki karakteri elde etmede kullanilir.

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

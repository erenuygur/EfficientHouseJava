package lessons.consolio.stringintro;

public class Equals {
    public static void main(String[] args)
    {
        String s = "Efficient House"; // it's cached
        String s2 = "Efficient House"; // Uses cached object instead of creating new object
        if (s == s2)
            System.out.println("Same object");
        else
            System.out.println("Different object");

        if (s.equals(s2))
            System.out.println("These keep exactly the same characters");
        else
            System.out.println("These do not hold the same characters");


        String str = "EFFICIENT HOUSE";
        String str2 = "EffIciENt HouSE";


        if (str.equalsIgnoreCase(str2))
            System.out.println("Same character set except for case sensitive");
        else
            System.out.println("Different character set except for case sensitive");

    }
}

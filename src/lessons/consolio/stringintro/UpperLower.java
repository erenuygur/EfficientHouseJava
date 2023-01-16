package lessons.consolio.stringintro;

public class UpperLower {
    public static void main(String[] args)
    {
        String s = "five";
        String s2 = s.toUpperCase(); // Returns: the String, converted to uppercase.

        // String's are constant; their values cannot be changed after they are created.
        // Because String objects are immutable they can be shared. For example:

        if (s == s2)
            System.out.println("Same object");
        else
            System.out.println("Different object");

        System.out.println(s);
        System.out.println(s2);


        String s3 = "FIVE";
        String s4 = s3.toLowerCase(); // Returns: the String, converted to lowercase.

        System.out.println(s4);

        if (s == s4)
            System.out.println("Same object");
        else
            System.out.println("Different object");
    }
}

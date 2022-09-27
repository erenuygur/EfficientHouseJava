package lessons.l3.string;

public class Length {
    public static void main(String[] args)
    {
        String str = "Efficient House, we are learning Java. This is not a CACIK Bootcamp.";
        int length = str.length(); //Returns: the length of the sequence of characters represented by this object.

        // printf (format – A format string as described in Format string syntax)
        // %s = String || %d = decimal types || %f = floating types || %b = boolean || %c = char
        System.out.printf("%s length = %d%n", str, length);
        System.out.println(str + " length = " + length);


        System.out.printf("the concentration of this mixture is: %%%d %n", 99);
        System.out.printf("PI = %.2f%n", Math.PI);

        int day = 5;
        int month = 9;
        int year = 2022;
        System.out.printf("Date : %05d / %03d / %d%n", day, month, year);
    }
}

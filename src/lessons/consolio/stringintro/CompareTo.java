package lessons.consolio.stringintro;

public class CompareTo {
    public static void main(String[] args)
    {
        char ch = 65;
        System.out.println(ch);

        // A: 65 || B: 66 || C: 67 ....... Z: 90
        // a: 97 || b: 98 || c: 99 ....... z: 122

        // z: 122 > Z: 90 (+)
        // b: 98 > A: 65 (+)
        // C: 67 > z: 122 (-)
        // C: 67 == C: 67 (0)

        String s1 = "A"; // 65
        String s2 = "B"; // 66

        System.out.println(s1.compareTo(s2)); // 65 > 66 || 65 - 66 = -1 (returns)
        System.out.println(s2.compareTo(s1)); // 66 > 65 || 66 - 65 = 1

        System.out.println("E".compareTo("e"));
        // 69 > 101 || (-)   69 - 101 = (-)32;

        System.out.println("E".toLowerCase().compareTo("e".toUpperCase()));
        // "E".toLowerCase() // "e"
        // "e".compareTo("e".toUpperCase())
        // "e".compareTo("E")  ||  101 - 69 = +32


        String s3 = "abc";
        String s4 = "abd";

        System.out.println(s3.compareTo(s4));
        // "a".compareTo("a") || 0
        // "b".compareTo("b") || 0
        // "c".compareTo("d") || -1


        String s5 = " abd";
        String s6 = "abc";

        System.out.println(s5.trim().compareTo(s6)); // 1
    }
}

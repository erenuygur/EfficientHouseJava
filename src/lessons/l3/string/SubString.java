package lessons.l3.string;

public class SubString {
    public static void main(String[] args)
    {
        String name = "Efficient Hub";
        System.out.println(name.substring(0, 9)); // substring([0, 9))
        System.out.println(name.substring(10));


        String text = "  Hello my name is John    "; // HELLO (String = Immutable class)
        String result = text.trim().toUpperCase().substring(0, 5);
        // String result = text.trim();  "Hello my name is John"
        // String result = text.toUpperCase(); "HELLO MY NAME IS JOHN"
        // String result = text.substring(0, 5); "HELLO"
        System.out.println(result);
        System.out.println(text);
    }
}

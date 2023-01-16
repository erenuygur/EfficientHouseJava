package lessons.consolio;

public class ScannerExamples {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Text: ");
        String mainText = input.next();

        System.out.println("(" + mainText.trim() + ")");
        System.out.println("(" + mainText.charAt(4) + ")");
        System.out.println("(" + mainText.trim().substring(0, 5) + ")");
        System.out.println("(" + mainText.toUpperCase() + ")");
        System.out.println("(" + mainText.toLowerCase() + ")");

        // Immutable Class (String)
        String mainText2 = mainText.trim();
        String mainText3 = mainText2.substring(0, 5);
        String mainText4 = mainText3.toUpperCase();
        String mainText5 = mainText4.toLowerCase();

        System.out.println(mainText);
        System.out.println(mainText2);
        System.out.println(mainText3);
        System.out.println(mainText4);
        System.out.println(mainText5);

        java.util.Scanner input2 = new java.util.Scanner(System.in);
        input2.useDelimiter("-");

        System.out.println("Enter number1 and number2");  // 123-456-
        int number1 = input2.nextInt();
        int number2 = input2.nextInt();

        System.out.println(number1); // 123
        System.out.println(number2); // 456
    }
}



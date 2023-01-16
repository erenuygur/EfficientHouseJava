package lessons.consolio;

public class PrintMethods {
    public static void main(String[] args)
    {
        System.out.print("Efficient\n"); // System.out.println("Efficient");
        System.out.print("House\n");
        System.out.println("Efficient\tHouse");

        System.out.println(10.0 + 20.0 + 30); // 60.0
        System.out.println(10 + 20 + "30"); // 3030
        System.out.println("30" + 10 + 20); // 301020

        double price = 21.98;
        String organization = "Efficient House";

        System.out.printf("$ %.2f each%n", price);
        System.out.printf("%s%n", organization);

        String name = "John";
        int age = 23;
        double height = 1.86;
        float weight = 100.2f;
        boolean greenEyes = true;
        char myFavoriteLetter = 'E';

        System.out.printf("Name: %s, Age: %d, Height: %.2f, Weight: %.1f, Green Eyes: %b, Favorite Letter: %c%n",
                name, age, height, weight, greenEyes, myFavoriteLetter);


        int day = 2;
        int month = 3;
        int year = 1999;

        System.out.printf("Date: %02d/%02d/%04d", day, month, year);
    }
}

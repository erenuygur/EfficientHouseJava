package lessons.l6;

public class IfElseExample2 {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Age: ");
        int age = keyboard.nextInt();

        // Display Generation

        if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 18) {
            System.out.println("Genc");
        } else if (age < 25) {
            System.out.println("Yetiskin");
        } else if (age < 35) {
            System.out.println("Orta yas");
        } else {
            System.out.println("Yasli");
        }
    }
}

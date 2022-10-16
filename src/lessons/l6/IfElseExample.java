package lessons.l6;

public class IfElseExample {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = keyboard.nextInt();

        System.out.print("Second number: ");
        int secondNumber = keyboard.nextInt();

        // First > Second
        if (firstNumber > secondNumber) {
            System.out.println("First number > Second Number");
        }

        System.out.print("Yasin age: ");
        int yasinAge = keyboard.nextInt();


        if (yasinAge >= 18) {
            System.out.println("Ilk adim tamamlandi");

            System.out.print("Yasinin kiz arkadasi var mi? ");
            boolean hasGirlFriend = keyboard.nextBoolean();

            if (hasGirlFriend) {
                System.out.println("Girebilirsin");
            } else {
                System.out.println("Giremezsin");
            }
        }
    }
}

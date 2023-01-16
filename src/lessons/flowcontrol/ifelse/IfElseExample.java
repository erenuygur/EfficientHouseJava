package lessons.flowcontrol.ifelse;

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

            System.out.print("Do you have girlfriend ? ");
            boolean hasGirlFriend = keyboard.nextBoolean();

            if (hasGirlFriend) {
                System.out.println("You can enter the disco");
            } else {
                System.out.println("You cant enter");
            }
        }
    }
}

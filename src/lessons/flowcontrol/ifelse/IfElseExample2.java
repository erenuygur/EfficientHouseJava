package lessons.flowcontrol.ifelse;

public class IfElseExample2 {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Age: ");
        int age = keyboard.nextInt();

        // Display Generation

        if (age < 5) {
            System.out.println("Baby");
        } else if (age < 13) {
            System.out.println("Child");
        } else if (age < 25) {
            System.out.println("Young");
        } else if (age < 35) {
            System.out.println("Mid");
        } else {
            System.out.println("Old");
        }
    }
}

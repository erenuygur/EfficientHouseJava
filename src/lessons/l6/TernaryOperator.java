package lessons.l6;

public class TernaryOperator {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = keyboard.nextInt();

        System.out.print("Second number: ");
        int secondNumber = keyboard.nextInt();

        int max;

        if (firstNumber >= secondNumber) {
            max = firstNumber;
        } else {
            max = secondNumber;
        }

        max = (firstNumber >= secondNumber) ? firstNumber : secondNumber;
        System.out.println(max);
    }
}

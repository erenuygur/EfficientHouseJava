package lessons.l6;

public class BooleanExpressions {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = keyboard.nextInt();

        System.out.print("Second number: ");
        int secondNumber = keyboard.nextInt();

        boolean isEqual = firstNumber == secondNumber;
        boolean isFirstNumberGreater = firstNumber > secondNumber;
        boolean isFirstNumberLess = firstNumber < secondNumber;

        boolean isFirstNumberGreaterOrEquals = firstNumber >= secondNumber;
        boolean isFirstNumberLessOrEquals = firstNumber <= secondNumber;

        boolean isNotEqual = firstNumber != secondNumber; // ***

        boolean isAlive = true;
        //...

        if (!isAlive) {
            System.out.println("DEAD");
        }
    }
}

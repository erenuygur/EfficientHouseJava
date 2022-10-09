package lessons.l5;


public class ScannerClass {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int x = 5;
        int y = 6;

        if (x < y) // Condition 'x < y' is always 'true'
            System.out.println(y);


        System.out.println("First int: ");
        int firstNumber = input.nextInt();

        System.out.println("Second int: ");
        int secondNumber = input.nextInt();

        if (firstNumber < secondNumber)
            System.out.println("second number > first number");


        System.out.print("Double: ");
        double d = input.nextDouble();

        System.out.print("float: ");
        float f = input.nextFloat();

        System.out.print("byte: ");
        byte b = input.nextByte();

        System.out.print("short: ");
        short s = input.nextShort();

        System.out.print("boolean: ");
        boolean bool = input.nextBoolean();

        String temp = input.nextLine();
        System.out.println(temp.isEmpty());

        System.out.print("text:" );
        String str = input.nextLine();
        System.out.print(str.isEmpty());
    }
}



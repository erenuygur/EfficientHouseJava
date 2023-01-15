package homeworks.chapter3;
/*
An Armstrong number is an n-digit number that equals the sum of the nth power
of its digits. For example 153 is a three-digit number where the sum of the cubes
of the individual digits (13 + 53 + 33) equals the number itself (153).

 Write a program that takes as input the start and end numbers of an Armstrong
number range to be printed. Your program should prompt for new start and end
numbers until the user decides that she or he is through. Use variables of the type
integer to store the start and end numbers of the range.
*/
public class Q7 {
    public static void main(String[] args)
    {
        displayAndRun();
    }

    public static void displayAndRun()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while(true) {

            System.out.print("First number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Last number: ");
            int lastNumber = scanner.nextInt();

            for(int i = firstNumber; i < lastNumber; i++)
                if(isArmStrong(i))
                    System.out.printf("%d is an armstrong number.%n", i);

            System.out.print("Want to exit press 0");
            int exitNumber = scanner.nextInt();
            if(exitNumber == 0)
                break;
        }
    }

    public static boolean isArmStrong(int a)
    {
        return a == findArmstrong(a);
    }

    public static int findArmstrong(int a)
    {
        int sum;
        int digit = countDigits(a);

        for(sum = 0; a != 0; a /= 10) {
            sum += pow(a % 10, digit);
        }

        return sum;
    }

    public static int pow(int a, int digit)
    {
        int pow;
        int temp = digit;

        for(pow = 1; temp != 0; temp--) {
            pow *= a;
        }

        return pow;

    }

    public static int countDigits(int a)
    {

        int count;

        for(count = 0; a > 0; a /= 10) {
            count++;
        }

        return count;
    }
}

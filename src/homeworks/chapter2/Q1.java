package homeworks.chapter2;

/*
Body Mass Index (BMI) helps in specifying the weight category a person
belongs to, depending on their body weight. BMI is estimated using the following formula:

BMI = Weight in kilograms / (Height in meters)2

Write a program that calculates and outputs the BMI. Assume various input values
wherever required.
*/

public class Q1 {
    public static void main(String[] args)
    {
        double kilogram, meter, bmi;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Kilogram: ");
        kilogram = scanner.nextDouble();

        System.out.println("Meter: ");
        meter = scanner.nextDouble();

        bmi = kilogram / (meter * meter);
        System.out.printf("Body Mass Index is: %.2f", bmi);
    }
}

package homeworks.chapter2;
/*
A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5
feet of height and 5 pounds for each additional inch. Write a program with a variable
for the height of a person in feet and another variable for the additional inches. Assume
the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall
would be represented with a variable that stores the number 6 and another variable that
stores the number 3. Based on these values, calculate and output the ideal body weight.
*/

public class Q9 {
    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Feet: ");
        int feet = kb.nextInt();

        System.out.println("Inch: ");
        int inch = kb.nextInt();

        System.out.println("Pound: ");
        int pound = kb.nextInt();

        feet -= 5;
        inch = inch + (feet * 12);
        pound = pound + (inch * 5);

        System.out.println(pound);
    }
}
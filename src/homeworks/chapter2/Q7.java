package homeworks.chapter2;
/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
and 51 seconds. Test your program with a different number of total seconds to
ensure that it works for other cases.
*/

public class Q7 {
    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Seconds: ");
        int seconds = Integer.parseInt(kb.nextLine());

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
        System.out.printf("%02d hours, %02d minutes, %02d seconds", hours, minutes, seconds);
    }
}

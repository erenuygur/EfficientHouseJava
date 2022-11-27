package lessons.l10;

public class LeapYear {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Year: ");
        int year = kb.nextInt();

        if (isLeapYear(year))
            System.out.printf("%d is Leap Year", year);
    }

    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

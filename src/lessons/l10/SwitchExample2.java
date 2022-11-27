package lessons.l10;

public class SwitchExample2 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("day:");
            int day = kb.nextInt();

            System.out.print("month:");
            int month = kb.nextInt();

            System.out.print("year:");
            int year = kb.nextInt();

            if (day == 0)
                break;

            System.out.println("------------------------");

            if (isValidDate(day, month, year))
                System.out.printf("%02d/%02d/%d is Valid Date%n", day, month, year);
            else
                System.out.println("invalid date");

            System.out.println("------------------------");

        }
    }

    public static boolean isValidDate(int day, int month, int year)
    {
        return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
    }

    public static int getDays(int month, int year)
    {
        int day = 31;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                if (isLeapYear(year))
                    ++day;
        }

        /*

        switch (month) {
            case 4, 6, 9, 11 -> day = 30;
            case 2 -> {
                day = 28;
                if (isLeapYear(year))
                    ++day;
            }
        }

         */
        return day;
    }

    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}

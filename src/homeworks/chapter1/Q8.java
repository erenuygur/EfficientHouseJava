package homeworks.chapter1;

public class Q8 {
    public static final double DISTANCE = 6.21;

    public static void main(String[] args)
    {
        double time, pace;

        System.out.println("This program calculates your pace given a time"
                + "and distance traveled.");

        time = 35.5; /* 35 minutes and 30 seconds */
        pace = time / DISTANCE;

        System.out.printf("Your pace is %.2f miles per hour.", pace);
    }
}

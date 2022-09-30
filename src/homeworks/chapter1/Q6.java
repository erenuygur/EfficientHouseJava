package homeworks.chapter1;

public class Q6 {
    public static void main(String[] args)
    {
        final double HOUR_TO_MINUTE = 60;
        final double PI = 3.14;
        final double INCH_TO_MILE = (1. / 12) * (1. / 5280);

        double gearSize = 100;
        double cadence = 90;

        double speed = gearSize * PI * INCH_TO_MILE * cadence * HOUR_TO_MINUTE;
        System.out.printf("Speed: %f (mph)", speed);
    }
}

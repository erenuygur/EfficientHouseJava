package homeworks.chapter1;

public class Q7 {
    public static void main(String[] args)
    {
        int seconds = 50391;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
        System.out.printf("%02d hours, %02d minutes, %02d seconds", hours, minutes, seconds);
    }
}

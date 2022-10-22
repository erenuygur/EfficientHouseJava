package homeworks.extra.hw1;

public class Q3 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int val = keyboard.nextInt();

        System.out.println(signum(val));
    }

    public static int signum(int number)
    {
        if (number > 0)
            return 1;

        if (number == 0)
            return 0;

        return -1;
    }
}
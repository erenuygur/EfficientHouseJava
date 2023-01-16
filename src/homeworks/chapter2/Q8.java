package homeworks.chapter2;

public class Q8 {

    public static void main(String[] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("time: ");
        double time = Double.parseDouble(kb.nextLine());

        System.out.print("distance: ");
        double distance = Double.parseDouble(kb.nextLine());

        System.out.println("This program calculates your pace given a time "
                + "and distance traveled.");

        double pace = time / distance;

        System.out.printf("Your pace is %.2f miles per hour.", pace);
    }
}

package homeworks.chapter3;

public class Q3 {
    public static void main(String[] args)
    {
        calculateNewton();
    }

    public static void calculateNewton()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {

            if (makeChoice() == 0)
                break;

            System.out.print("Please enter the car kilogram : ");
            double carKilogram = kb.nextInt();

            displayByChoice(makeChoice(), carKilogram);
        }
    }


    public static int makeChoice()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("\n\" 0 \" --> Exit");
        System.out.println("\" 1 \" --> Calculate newton on earth.");
        System.out.println("\" 2 \" --> Calculate newton on moon.\n");

        System.out.print("Please choose an option : ");

        return kb.nextInt();
    }

    public static double calculateNewtonOnEarth(double carKilogram)
    {
        return carKilogram * 9.81;
    }

    public static double calculateNewtonOnMoon(double carKilogram)
    {
        return calculateNewtonOnEarth(carKilogram) / 6;
    }

    public static void displayByChoice(int choice, double carKilogram)
    {
        if (choice == 1) {
            System.out.printf("%.2f kg car on earth is %.2f Newton.%n", carKilogram, calculateNewtonOnEarth(carKilogram));
        }
        else if ( choice == 2) {
            System.out.printf("%.2f kg car on moon is %.2f Newton.%n", carKilogram, calculateNewtonOnMoon(carKilogram));
        }
    }
}

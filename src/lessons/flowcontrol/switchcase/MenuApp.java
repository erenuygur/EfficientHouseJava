package lessons.flowcontrol.switchcase;

public class MenuApp {
    public static void main(String[] args)
    {
        run();
    }

    public static void displayMenu()
    {
        System.out.println("1- Mercimek");
        System.out.println("2- Kuru Fasulye");
        System.out.println("3- Beyran");
        System.out.println("4- Cacik");
        System.out.println("5- Istemiyorum");
    }

    public static void doWorkForMercimek()
    {
        System.out.println("--------------------------");
        System.out.println("Mercimek is loading");
        System.out.println("--------------------------");
    }

    public static void doWorkForKuru()
    {
        System.out.println("--------------------------");
        System.out.println("Kuru is loading");
        System.out.println("--------------------------");
    }

    public static void doWorkForBeyran()
    {
        System.out.println("--------------------------");
        System.out.println("Beyran is loading");
        System.out.println("--------------------------");
    }

    public static void doWorkForCacik()
    {
        System.out.println("--------------------------");
        System.out.println("Cacik is loading");
        System.out.println("--------------------------");
    }

    public static void doWorkFor(int option)
    {
        if (option == 1)
            doWorkForMercimek();
        else if (option == 2)
            doWorkForKuru();
        else if (option == 3)
            doWorkForBeyran();
        else
            doWorkForCacik();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            displayMenu();

            int option = kb.nextInt();

            if (option < 1 || option > 5) {
                System.out.println("Invalid option");
                continue;
            }

            if (option == 5)
                break;

            doWorkFor(option);
        }

        System.out.println("Tekrardan bekleriz. Bizi tercih ettiginiz icin tesekkur ederiz");
    }

}

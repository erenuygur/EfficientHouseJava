package lessons.oop.basics.randomclass;

public class CoinSimulationApp {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        CoinSimulation coinSimulation = new CoinSimulation();

        for (;;) {
            System.out.print("How many times do you want to flip the coin ? ");
            int n = Integer.parseInt(kb.nextLine());

            // TODO

            if (n <= 0)
                break;

            coinSimulation.run(n);

            System.out.printf("Tail odds: %f%n", coinSimulation.odds);
        }
    }
}

class CoinSimulation {
    public double odds;

    public static int getTailCount(int n)
    {
        java.util.Random r = new java.util.Random();
        int count = 0;

        for (int i = 0; i < n; ++i)
            if (r.nextBoolean())
                ++count;

        return count;
    }

    public void run(int n)
    {
        odds = getTailCount(n) / (double)n;
    }
}


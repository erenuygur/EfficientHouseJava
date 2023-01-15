package homeworks.chapter3.chapter3;

public class Q4 {
    public static void main(String[] args)
    {
        inflationCalculator();
    }

    public static void inflationCalculator()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Please enter the item cost : ");
        double itemCost = kb.nextDouble();

        System.out.print("Please enter how many years later you will buy it : ");
        int year = kb.nextInt();

        System.out.print("Please enter the inflation rate : ");
        double inflationRate = kb.nextDouble() / 100;

        for(int i = 0; i < year; i++)
            itemCost += itemCost * inflationRate;

        System.out.printf("%nThe price of the item after %d years with %.2f inflation rate : %.2f",year,inflationRate,itemCost);
    }
}

package lessons.oop.basics.randomclass;


public class SameTwoDiceAppSimple {
    public static void main(String[] args)
    {
        Test.run();
    }
}

class Test {
    public static void run()
    {
        for (;;) {
            System.out.print("How many time you want to dice:");
            int diceCount = new java.util.Scanner(System.in).nextInt();

            if (diceCount == 0)
                return;

            System.out.printf("%d per times rolling dice percent: %%%.3f%n", diceCount,
                    SameTwoDiceCalculation.sameDiceChangeRatio(diceCount, new java.util.Random()) * 100);
        }
    }
}


class SameTwoDiceCalculation {

    public static double sameDiceChangeRatio(int loopTimes, java.util.Random r)
    {
        int diceOne = r.nextInt(6) + 1;
        int count = 0;

        for (int i = 3; i <= loopTimes + 3; ++i)
            if (r.nextInt(6) + 1 == diceOne)
                ++count;


        return (double)count / loopTimes;

    }
}

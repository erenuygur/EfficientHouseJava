package homeworks.chapter3;
/*
The Fibonacci numbers Fn are defined as follows: F0 is 1, F1 is 1, and

Fi+2 = Fi + Fi+1

i = 0, 1, 2, . . . . In other words, each number is the sum of the previous two numbers. The first few Fibonacci numbers are 1, 1, 2, 3, 5, and 8. One place where these
numbers occur is as certain population growth rates. If a population has no deaths,
then the series shows the size of the population after each time period. It takes an
organism two time periods to mature to reproducing age, and then the organism
reproduces once every time period. The formula applies most straightforwardly to
asexual reproduction at a rate of one offspring per time period. In any event, the
green crud population grows at this rate and has a time period of five days. Hence, if
a green crud population starts out as 10 pounds of crud, then in 5 days, there is still
10 pounds of crud; in 10 days, there is 20 pounds of crud; in 15 days, 30 pounds;
in 20 days, 50 pounds; and so forth. Write a program that takes both the initial size
of a green crud population (in pounds) and a number of days as input and outputs
the number of pounds of green crud after that many days. Assume that the population size is the same for four days and then increases every fifth day. Your program
should allow the user to repeat this calculation as often as desired.
*/
public class Q6 {
    public static void main(String[] args)
    {
        displayAndRun();
    }

    public static void displayAndRun()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int day = 0;

        while (true) {
            day += 5;
            System.out.println(poundCalculator(day));

            System.out.print("Press 0 to exit: ");
            int choice = scanner.nextInt();

            if(choice == 0)
                break;
        }
    }

    public static int poundCalculator(int day)
    {
        int a = 0;
        int b = 10;

        for(int i = 0; i < day / 5; i++) {
            int temp;
            temp = a;
            a = b;
            b += temp;
        }
        return a;
    }
}

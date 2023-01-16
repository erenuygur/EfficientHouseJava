package homeworks.chapter2;
/*
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose. Write a program with a variable that holds the number of milligrams of caffeine in a drink and
outputs how many drinks it takes to kill a person.
A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.
*/

public class Q10 {
    public static void main(String[] args) {

        int colaCount, coffeeCount;
        int milligram = 10000;

        colaCount = milligram / 34;
        coffeeCount = milligram / 160;

        System.out.printf("If you drink %d of the 12-ounce Cokes, it's an overdose.%n", colaCount);
        System.out.printf("If you drink %d of the 16-ounce Coffees, it's an overdose.", coffeeCount);
    }
}
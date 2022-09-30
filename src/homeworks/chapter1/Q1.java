package homeworks.chapter1;

public class Q1 {
    public static void main(String[] args)
    {
        double weight = 150; // pound

        int running = 10; //METS (Metabolic equivalents)
        int basketball = 8;
        int sleeping = 1;

        int runningTimeInMinutes = 30;
        int basketballTimeInMinutes = 30;
        int sleepingTimeInMinutes = 6 * 60;

        // Calories = 0.0175 x MET x Weight in kilograms x Minute(s)

        double totalRunningCalories = 0.0175 * running * runningTimeInMinutes * weight;
        double totalBasketCalories = 0.0175 * basketball * basketballTimeInMinutes * weight;
        double totalSleepingCalories = 0.0175 * sleeping * sleepingTimeInMinutes * weight;

        System.out.println("Exercise\t\tTime(min)\tCalories(cal)");
        System.out.println("--------------------------------------");
        System.out.printf("Running%11d\t%14.2f%n", runningTimeInMinutes, totalRunningCalories);
        System.out.printf("Basketball%8d\t%14.2f%n", basketballTimeInMinutes, totalBasketCalories);
        System.out.printf("Sleeping%11d\t%14.2f%n", sleepingTimeInMinutes, totalSleepingCalories);
        System.out.println("--------------------------------------");
        System.out.printf("Total Calories: %19.2f%n", totalRunningCalories + totalBasketCalories + totalSleepingCalories);
    }
}

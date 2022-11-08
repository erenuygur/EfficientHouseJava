package homeworks.chapter3;

public class Q1 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Enter the a number: ");
        double n = Double.parseDouble(kb.nextLine());

        if(n < 0) {
            System.out.print("You entered a negative number. Try again.");
            return;
        }

        System.out.printf("The square root of %.2f is %.2f%n", n, babylonianAlgorithm(n));
    }

    public static double babylonianAlgorithm(double n)
    {
        double guess = n / 2;
        double previousGuess = guess;
        double differenceBetweenGuesses = 1;

        while (differenceBetweenGuesses >= 0.01) {
            double r = n / guess;
            guess = (guess + r) / 2;
            differenceBetweenGuesses = (previousGuess - guess) / guess;
            previousGuess = guess;
        }

        return guess;
    }
}

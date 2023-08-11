package lessons.arrays.lottery;

import lessons.arrays.examples.ArrayMethods;

import java.util.Random;
import java.util.Scanner;

public class NumericLotteryShop {
    public static Random random = new Random();
    public static Scanner kb = new Scanner(System.in);
    public static int costOfRow = 10;

    public static int[] generateNumericLottery()
    {
        return new NumericLottery().getNums(random);
    }

    public static void getInfoFromCustomer(Customer customer)
    {
        System.out.println("Clerk: How old are you ?");
        System.out.printf("Customer: %d%n", customer.age);

        if (customer.age < 19) {
            System.out.println("You are not allowed to play");
            return;
        }

        System.out.print("Clerk: How many row do you want ?");
        int rowCount = Integer.parseInt(kb.nextLine());
        System.out.printf("Customer: %d%n", rowCount);

        int price = rowCount * costOfRow;

        System.out.printf("Clerk: %d $ please%n", price);

        if (!customer.isSufficientBalance(price))  {
            return;
        }

        customer.pay(price);

        System.out.println("----------------Lottery Machine Sound----------------");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < rowCount; ++i) {
            ArrayMethods.displayArray(generateNumericLottery());
        }

        System.out.println("-----------------------------------------------------");

    }

    public static void run()
    {
        getInfoFromCustomer(new Customer(1000, 22));
    }
}

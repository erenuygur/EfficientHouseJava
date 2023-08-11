package lessons.arrays.lottery;

import lessons.arrays.examples.ArrayMethods;

import java.util.Random;
import java.util.Scanner;

public class NumericLotteryShop {
    public static Scanner kb = new Scanner(System.in);
    public static Random random = new Random();
    public static int costOfRow = 10;

    public static int[] generateNumericLottery()
    {
        return new NumericLottery().getNums(random);
    }
    public static void getInfoFromCustomer(Customer customer)
    {
        int customerAge = takeCustomerAge(customer);
        System.out.printf("Customer: %d%n", customerAge);

        if (!isOfAge(customerAge)) {
            System.out.println("You are not allowed to play");
            return;
        }

        int rowCount = takeCustomerWantedRowCount();
        System.out.printf("Customer: %d%n", rowCount);

        int price = rowCount * costOfRow;

        boolean isPaymentSucceeded = tryPayment(customer, price);

        if(!isPaymentSucceeded){
            System.out.println("I don't have enough money.Have a nice day.");
            return;
        }

        runLotteryMachine(rowCount);
    }
    public static boolean isOfAge(int customerAge)
    {
        return customerAge > 18;
    }
    public static void run()
    {
        getInfoFromCustomer(new Customer(1000, 22));
    }

    public static void runLotteryMachine(int rowCount)
    {
        System.out.println("----------------Lottery Machine Sound----------------\n" +
                "-----------------------------------------------------");

        for (int i = 0; i < rowCount; ++i)
            ArrayMethods.displayArray(generateNumericLottery());

        System.out.println("-----------------------------------------------------");
    }

    public static int takeCustomerAge(Customer customer)
    {
        System.out.println("Clerk: How old are you ?");
        return customer.age;
    }

    public static int takeCustomerWantedRowCount()
    {
        System.out.print("Clerk: How many row do you want ?");
        return Integer.parseInt(kb.nextLine());
    }

    public static boolean tryPayment(Customer customer, int price)
    {
        boolean flag = true;
        System.out.printf("Clerk: %d $ please%n", price);

        if (!customer.isSufficientBalance(price))
            flag = false;

        customer.pay(price);
        return flag;
    }
}

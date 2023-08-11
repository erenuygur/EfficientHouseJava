package lessons.oop.basics.constructors.basicshoppingapp;

public class Market {
    public static java.util.Scanner kb = new java.util.Scanner(System.in);

    public static void displayProducts()
    {
        System.out.println("Products");
        System.out.println("--------------------");
        System.out.println("1- Milk - 10");
        System.out.println("2- Bread - 5");
        System.out.println("3- Egg - 7");
        System.out.println("4- Apple - 3");
        System.out.println("5- Newspaper - 2");
        System.out.println("0- '-End shopping -> Go to Payment'");
    }

    public static int getProduct()
    {
        int cost = 0;
        int count = 0;

        displayProducts();

        while (true) {

            int choice = Integer.parseInt(kb.nextLine());

            if (checkInput(choice))
                continue;

            switch (choice) {
                case 1 : cost += 10;
                        break;
                case 2 : cost += 5;
                    break;
                case 3 : cost += 7;
                    break;
                case 4 : cost += 3;
                    break;
                case 5 : cost += 2;
                    break;
                default :
                    System.out.printf("-----------------------%n" +
                            "%d products - %d $" +
                            "%n-----------------------%n", count, cost);
                    return cost;
            }

            count++;
        }
    }

    public static void shopping(Customer customer)
    {
        int cost = getProduct();

        System.out.println("How do you want to pay ? \n" +
                "Card or Cash");

        Wallet wallet = customer.getWallet();
        String paymentChoice = kb.nextLine();

        if (paymentChoice.equalsIgnoreCase("card"))
            paymentWithCard(wallet.getCard(), cost);
        else if (paymentChoice.equalsIgnoreCase("cash"))
            paymentWithCash(wallet, cost);
        else
            System.out.println("Invalid Input");
    }

    public static void paymentWithCard(Card card, int cost)
    {
        for (int i = 3; 0 < i; i--) {
            System.out.print("password:");
            if (kb.nextLine().equals(card.getPassword())) {
                if (checkBalance(card.getBalance(), cost)) {
                    card.setBalance(card.getBalance() - cost);
                    System.out.println("Successfully Paid");
                    System.out.printf("Remaining Card Balance : %d", card.getBalance());
                } else {
                    System.out.println("Insufficient Balance");
                    break;
                }
            } else {
                System.out.printf("Wrong password - Your remaining left %d%n", i);
            }
        }
    }

    public static void paymentWithCash(Wallet wallet, int cost)
    {
        if (checkBalance(wallet.getCashMoney(), cost)) {
            wallet.setCashMoney(wallet.getCashMoney() - cost);
            System.out.println("Thanks for your choosing us");
            System.out.printf("New Balance : %d", wallet.getCashMoney());
        }
        else
            System.out.println("You did not give enough money");
    }

    public static boolean checkBalance(int balance, int cost)
    {
        return balance >= cost;
    }

    public static boolean checkInput(int choice)
    {
        boolean flag = false;

        if (choice < 0 || choice > 5) {
            System.out.println("Invalid Input");
            flag = true;
        }

        return flag;
    }
}

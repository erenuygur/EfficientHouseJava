package lessons.oop.basics.constructors.basicshoppingapp;

public class BankApp {
    public static java.util.Scanner kb = new java.util.Scanner(System.in);
    public static Customer customer;

    public void login(Customer newCustomer)
    {
        customer = newCustomer;

        for (int i = 2; i >= 0; i--) {
            System.out.print("Customer Id: ");
            String inputId = kb.nextLine();

            System.out.print("Password: ");
            String inputPassword = kb.nextLine();

            if (loginCheck(inputId, inputPassword)) {
                System.out.println("-------------------");
                System.out.println("Login successfully");
                System.out.println("-------------------");
                menu();
                break;
            }
            else
                System.out.printf("Wrong id or password. Remaining left: %d%n", i);
        }
    }

    public boolean loginCheck(String inputId, String inputPw)
    {
        return customer.getId().equals(inputId) && customer.getPassword().equals(inputPw);
    }

    public void menu()
    {
        for (;;) {
            displayMenu();

            String choice = kb.nextLine();
            menuOptions(choice);

            if (choice.equals("0"))
                break;
        }
    }

    public void displayMenu()
    {
        System.out.println("1- Show Balance\n" +
                "2- Withdraw\n" +
                "3- Deposit\n" +
                "0- Exit\n" +
                "-------------------");
    }

    public void menuOptions(String choice)
    {
        switch (choice) {
            case "0":
                System.out.println("Exiting menu");
                break;
            case "1":
                showBalance();
                break;
            case "2":
                withdraw();
                break;
            case "3":
                deposit();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public void showBalance()
    {
        System.out.printf("Balance: %d%n", customer.getWallet().getCard().getBalance());
    }

    public void withdraw()
    {
        Card sender = customer.getWallet().getCard();

        System.out.println("Iban: ");
        Card receiver = new Card(kb.nextLine());

        System.out.println("How much to wanna send:");
        int toSendMoney = Integer.parseInt(kb.nextLine());

        if (sender.checkBalance(sender.balance, toSendMoney)) {
            sender.setBalance(sender.getBalance() - toSendMoney);
            receiver.setBalance(receiver.getBalance() + toSendMoney);
            System.out.println("Your transaction is completed successfully");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit()
    {
        System.out.println("How much do you want to deposit");
        int amount = Integer.parseInt(kb.nextLine());

        Wallet wallet = customer.getWallet();
        Card card = wallet.getCard();

        card.setBalance(card.getBalance() + amount);
        wallet.setCashMoney(wallet.getCashMoney() - amount);
    }
}

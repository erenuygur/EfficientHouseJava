package lessons.oop.basics.constructors.basicshoppingapp;

public class BasicShoppingTest {
    public static void run()
    {
        // Customer.goToMarket(new Customer("Eren", new Wallet(new Card("1234", 1000), 1000), new Phone("536 999 99 99")));


        Customer customer1 = new Customer("Eren", new Wallet(new Card("1234", 1000), 1000), new Phone("536 999 99 99"));
        Customer customer2 = new Customer("Tuncay", new Wallet(new Card("1122", 5000), 2000), new Phone("536 1111 11 11"));

        customer1.getPhone().call(customer2);
    }
}

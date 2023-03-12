package lessons.oop.basics.constructors.basicshoppingapp;

public class BasicBankTest {
    public static void run()
    {
        Customer yavuz = new Customer("Yavuz", new Wallet(new Card("99999", "1234", 1000), 10),new Phone("536 663 336"), "434445", "12345");

        BankApp ziraat = new BankApp();
        ziraat.login(yavuz);
    }
}

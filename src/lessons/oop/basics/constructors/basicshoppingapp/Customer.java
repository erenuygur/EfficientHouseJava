package lessons.oop.basics.constructors.basicshoppingapp;

public class Customer {
    public String id;
    public String password;
    public String name;
    public Wallet wallet;
    public Phone phone;

    public Customer(String newName, Wallet newWallet, Phone newPhone, String newId, String newPassword)
    {
        name = newName;
        wallet = newWallet;
        phone = newPhone;
        id = newId;
        password = newPassword;
    }


    public String getId()
    {
        return id;
    }

    public String getPassword()
    {
        return password;
    }

    public String getName()
    {
        return name;
    }

    public Wallet getWallet()
    {
        return wallet;
    }

    public Phone getPhone()
    {
        return phone;
    }

    public static void goToMarket(Customer customer)
    {
        Market.shopping(customer);
    }
}

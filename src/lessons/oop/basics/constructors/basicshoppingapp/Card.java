package lessons.oop.basics.constructors.basicshoppingapp;

public class Card {
    public String iban;
    public String password;
    public int balance;

    public Card(String newIban)
    {
        iban = newIban;
    }

    public Card(String newIban, String newPassword, int newBalance)
    {
        iban = newIban;
        password = newPassword;
        balance = newBalance;
    }

    public String getPassword()
    {
        return password;
    }

    public void setBalance(int newBalance)
    {
        balance = newBalance;
    }

    public int getBalance()
    {
        return balance;
    }

    public boolean checkBalance(int balance, int cost)
    {
        return balance >= cost;
    }
}

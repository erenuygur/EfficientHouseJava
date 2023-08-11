package lessons.arrays.lottery;

public class Customer {
    public int balance;
    public int age;

    public Customer(int newBalance, int newAge)
    {
        balance = newBalance;
        age = newAge;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isSufficientBalance(int amount)
    {
        return balance >= amount;
    }

    public void pay(int payAmount)
    {
        balance = balance - payAmount;
    }

    public void earn(int earnedAmount)
    {
        balance += earnedAmount;
    }
}

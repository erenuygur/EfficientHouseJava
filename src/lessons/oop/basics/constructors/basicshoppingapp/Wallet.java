package lessons.oop.basics.constructors.basicshoppingapp;

public class Wallet {
    public Card card;
    public int cashMoney;

    public Wallet(Card newCard, int newCashMoney)
    {
        card = newCard;
        cashMoney = newCashMoney;
    }

    public Card getCard()
    {
        return card;
    }

    public int getCashMoney()
    {
        return cashMoney;
    }

    public void setCashMoney(int money)
    {
        cashMoney = money;
    }
}

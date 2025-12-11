package model;

public class CoinAcceptor implements MoneyAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void deposit(int amount) {
        this.amount += amount;
    }

    @Override
    public boolean pay(int price) {
        if(amount >= price) {
            amount = amount - price;
            return true;
        }
        return false;
    }
}

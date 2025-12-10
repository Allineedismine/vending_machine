package model;

public interface MoneyAcceptor{
    int getAmount();
    void deposit(int amount);
    boolean pay(int price);
}
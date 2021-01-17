package Lesson14_OOP.HomeWork;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String name) {
        super(name);
    }

    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public BigDecimal getCashFromCard(double cash) {
        BigDecimal bigCash = new BigDecimal(cash);
        if (bigCash.compareTo(balance) > 0)
            System.out.println("Внимание! Баланс вашего счета меньше '0'");
        balance = balance.subtract(bigCash);
        return balance;
    }
}

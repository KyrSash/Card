package Lesson14_OOP.HomeWork;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Card {
    protected String name;
    protected BigDecimal balance;

    public Card(String name) {
        this.name = name;
    }

    public Card(String name, double balance) {
        this.name = name;
        this.balance = new BigDecimal(balance);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCardInformation() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public BigDecimal addMoneyToCard(double money) {
        BigDecimal bigMoney = new BigDecimal(money);
        balance = balance.add(bigMoney);
        return balance;
    }

    public abstract BigDecimal getCashFromCard(double cash) throws Exception;

    public BigDecimal getBalanceInAnotherCurrency(double currency) {
        BigDecimal bigCurrency = new BigDecimal(currency);
        return balance.divide(bigCurrency, 5, RoundingMode.HALF_UP);
    }

    @Override
    public int hashCode() {
        int result = 10;
        result = 31 * result + name.hashCode();
        result = 31 * result + balance.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Card)) return false;

        Card that = (Card) object;

        if (!name.equals(that.name)) return false;
        if (balance.compareTo(that.balance) != 0) return false;
        return true;
    }
}
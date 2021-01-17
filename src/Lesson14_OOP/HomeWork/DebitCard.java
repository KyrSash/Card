package Lesson14_OOP.HomeWork;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(String name) {
        super(name);
    }

    public DebitCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public BigDecimal getCashFromCard(double cash) throws InsufficientFundsException {
        BigDecimal bigCash = new BigDecimal(cash);

        if (bigCash.compareTo(balance) > 0) {
            //System.out.println("Внимание! Сумма кеша не должна превышать баланса вашей карты");
            throw new InsufficientFundsException(cash);
        }
        balance = balance.subtract(bigCash);
        return balance;
    }
}

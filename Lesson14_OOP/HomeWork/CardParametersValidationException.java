package Lesson14_OOP.HomeWork;

import java.math.BigDecimal;

public class CardParametersValidationException extends Exception {
    private BigDecimal balance;

    public CardParametersValidationException(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}

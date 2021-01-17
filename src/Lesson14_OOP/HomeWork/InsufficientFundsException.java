package Lesson14_OOP.HomeWork;

public class InsufficientFundsException extends Exception {
    private double cash;

    public InsufficientFundsException(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }
}

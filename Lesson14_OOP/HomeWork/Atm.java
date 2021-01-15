package Lesson14_OOP.HomeWork;

public class Atm {
    private Card card;

    public Atm(Card card) {
        this.card = card;
    }

    public void getCash(double cash) throws Exception {
        card.getCashFromCard(cash);
    }

    public void addMoney(double money) {
        card.addMoneyToCard(money);
    }

    @Override
    public String toString() {
        return "Atm{" +
                "card=" + card +
                '}';
    }
}
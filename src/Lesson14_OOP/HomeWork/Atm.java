package Lesson14_OOP.HomeWork;

public class Atm {
    private Card card;

    public Atm(Card card) {
        this.card = card;
    }

    public void getCash(double cash) throws Exception {
        try {
            DebitCard debitCard = new DebitCard("Alex", 100);
            debitCard.getCashFromCard(300);
        } catch (InsufficientFundsException e) {
            //System.out.println("Внимание! Сумма кеша не должна превышать баланса вашей карты");
            e.printStackTrace();
        }
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
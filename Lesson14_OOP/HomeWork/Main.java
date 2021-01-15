package Lesson14_OOP.HomeWork;

public class Main {
    public static void main(String[] args) throws Exception {
        CreditCard creditCard = new CreditCard("Kurilov", 115);
        DebitCard debitCard = new DebitCard("Alex", 115);
        Atm atm = new Atm(debitCard);

        try {
            debitCard.getCashFromCard(300);
        } catch (InsufficientFundsException e) {
            System.out.println("Внимание! Сумма кеша не должна превышать баланса вашей карты. У вас на балансе: " +
                    debitCard.getBalance());
            e.printStackTrace();
        }
        System.out.println(debitCard.getBalance());
        atm.getCash(200);
        System.out.println(debitCard.getBalance());
    }
}

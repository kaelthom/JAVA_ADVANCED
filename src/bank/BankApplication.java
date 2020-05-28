package bank;

public class BankApplication {
    public static void main(String[] args) {
        Card registeredCard = new RegisteredCard();
        registeredCard.connect();
        Card bankCardAdapter = new BankCardAdapter(new BankCard("02132451"));
        bankCardAdapter.connect();

    }
}

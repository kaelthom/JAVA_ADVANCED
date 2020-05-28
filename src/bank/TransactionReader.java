package bank;

public class TransactionReader {
    public void startTransaction(Card card) {
        card.connect();
    }
}

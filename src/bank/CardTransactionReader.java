package bank;

public class CardTransactionReader implements TransactionReader {
    public void startTransaction(Card card) {
        card.connect();
    }
}

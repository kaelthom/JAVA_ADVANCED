package bank;

public class CardTransactionReaderProxy {
    public static final int MAX_TRANSACTIONS_WITH_SAME_CARD = 3;
    CardTransactionReader cardTransactionReader;
    private int nTransactionsWithSameCard = 0;
    private String lastReadCard;

    public CardTransactionReaderProxy(CardTransactionReader cardTransactionReader) {
        this.cardTransactionReader = cardTransactionReader;
    }

    public void startTransaction(Card card) {

        if (card.getCode().equals(lastReadCard)) {
            nTransactionsWithSameCard++;
        } else {
            nTransactionsWithSameCard = 0;
        }

        if (nTransactionsWithSameCard < MAX_TRANSACTIONS_WITH_SAME_CARD) {
            cardTransactionReader.startTransaction(card);
        } else {
            System.out.println("You're trying to start a transaction with the same card for more than " + MAX_TRANSACTIONS_WITH_SAME_CARD + " times.. that's strange guy");
        }
        lastReadCard = card.getCode();
    }
}

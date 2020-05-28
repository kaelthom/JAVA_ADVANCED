package bank;

public class BankCardAdapter implements Card {

    private BankCard bankCard;

    public BankCardAdapter(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void connect() {
        bankCard.startTransactionWithBank();
    }
}

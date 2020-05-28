package bank;

import java.util.Objects;

public class BankCardAdapter implements Card {

    private BankCard bankCard;

    public BankCardAdapter(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankCardAdapter)) return false;
        BankCardAdapter that = (BankCardAdapter) o;
        return bankCard.equals(that.bankCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankCard);
    }

    @Override
    public void connect() {
        bankCard.startTransactionWithBank();
    }

    @Override
    public String getCode() {
        return bankCard.getAccountNumber();
    }
}

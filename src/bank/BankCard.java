package bank;

import java.util.Objects;

public class BankCard {
    private String accountNumber;

    public BankCard(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankCard)) return false;
        BankCard bankCard = (BankCard) o;
        return accountNumber.equals(bankCard.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public void startTransactionWithBank() {
        System.out.println("Bank card transaction started");
    }
}

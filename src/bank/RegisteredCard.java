package bank;

import java.util.Objects;

public class RegisteredCard implements Card {
    private String cardNumber;

    public RegisteredCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisteredCard)) return false;
        RegisteredCard that = (RegisteredCard) o;
        return cardNumber.equals(that.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber);
    }

    @Override
    public void connect() {
        System.out.println("Registered card connected!");
    }

    @Override
    public String getCode() {
        return this.cardNumber;
    }
}

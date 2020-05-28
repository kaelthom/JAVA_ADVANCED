package bank;

public class RegisteredCard implements Card {
    @Override
    public void connect() {
        System.out.println("Registered card connected!");
    }
}

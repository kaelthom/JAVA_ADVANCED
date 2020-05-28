package bank;

public class BankApplication {
    public static void main(String[] args) {
        Card registeredCard = new RegisteredCard("12454321");
        registeredCard.connect();
        Card bankCardAdapter = new BankCardAdapter(new BankCard("02132451"));
        bankCardAdapter.connect();

        CardTransactionReader transactionReader = new CardTransactionReader();
        transactionReader.startTransaction(registeredCard);
        transactionReader.startTransaction(bankCardAdapter);

        System.out.println("TEsting with reader proxy");
        CardTransactionReaderProxy transactionReaderProxy = new CardTransactionReaderProxy();
        transactionReaderProxy.startTransaction(registeredCard);
        transactionReaderProxy.startTransaction(registeredCard);
        transactionReaderProxy.startTransaction(registeredCard);
        transactionReaderProxy.startTransaction(registeredCard);
        transactionReaderProxy.startTransaction(registeredCard);

        transactionReaderProxy.startTransaction(bankCardAdapter);
        transactionReaderProxy.startTransaction(bankCardAdapter);
        transactionReaderProxy.startTransaction(bankCardAdapter);
        transactionReaderProxy.startTransaction(bankCardAdapter);
        transactionReaderProxy.startTransaction(bankCardAdapter);


        transactionReaderProxy.startTransaction(new RegisteredCard("02132451"));
        transactionReaderProxy.startTransaction(new RegisteredCard("02132451"));
        transactionReaderProxy.startTransaction(new RegisteredCard("02132451"));
        transactionReaderProxy.startTransaction(new RegisteredCard("02132451"));
    }
}

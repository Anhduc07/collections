package collections.abstraction;

public class CreditcardPayment extends PaymentMethod {
    public CreditcardPayment() {
        super("Creditcard");
    }
    @Override
    public void pay(long amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
    }
}

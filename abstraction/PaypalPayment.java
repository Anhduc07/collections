package collections.abstraction;

public class PaypalPayment extends PaymentMethod {

    public  PaypalPayment() {
        super("Paypal");
    }
    @Override
    public void pay(long amount) {
        System.out.println("Processing Paypal payment of $" + amount);
    }
}

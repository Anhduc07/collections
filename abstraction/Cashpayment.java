package collections.abstraction;

public class Cashpayment implements Payment {
    public void pay(long amount) {
        System.out.println("Pay cash $" + amount);
    }
}

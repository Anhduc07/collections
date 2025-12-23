package collections.abstraction;

public class CardPayment implements Payment {
    public void pay(long amount) {
        System.out.println("Pay card $" + amount);
    }
}

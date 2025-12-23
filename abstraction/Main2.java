package collections.abstraction;

public class Main2 {
    public  static void main(String[] args) {
        Payment a = new Cashpayment();
        a.pay(1000);
        a.pay(2000);
    }
}

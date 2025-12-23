package collections.abstraction;

public class Main {
    public  static void main(String[] args) {
        Animal n1 = new Dog() {};
        Animal n2 = new Cat() {};

        n1.sound();
        n2.sound();

    }
}

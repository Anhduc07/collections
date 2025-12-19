package collections.LinkedList;
import java.security.PublicKey;
import  java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> car = new LinkedList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");

        List<Integer> list = new ArrayList<>();


        System.out.println("Intial LinkedList: " + car);

        car.add(3, "Honda");
        System.out.println("After add(3, Honda): " + car);

        car.addFirst( "Aston");
        System.out.println("After add(1, Aston): " + car);

        car.addLast("Bentley");
        System.out.println("After addLast(Bentley): " + car);

        List<String> allCar = new ArrayList<String>();
        allCar.add("Jaguar");
        allCar.add("Lexus");

        allCar.addAll(allCar);
        System.out.println("After add(allCar, Lexus): " + car);

    }
}

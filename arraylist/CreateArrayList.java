package collections.arraylist;
import java.util.*;

public class CreateArrayList {
    public static void main(String[] args) {
        List<String> Fruit = new ArrayList<>();

        Fruit.add("Apple");
        Fruit.add("Banana");
        Fruit.add("Cherry");

        System.out.println("ArrayList: " + Fruit);

        //add
        Fruit.add(2,"Mango");
        System.out.println("After adding Mango: " + Fruit);

        // Get the size
        System.out.println("Size of ArrayList: " + Fruit.size());

        // Access an element by index
        System.out.println("Element at index 1: " + Fruit.get(1));
    }
}

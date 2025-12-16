package collections.LinkedList;
import java.util.*;

public class IterateOverLinkedList {
    public static void main(String[] args) {
        LinkedList<String> Fruit= new LinkedList<String>();
        Fruit.add("Apple");
        Fruit.add("Banana");
        Fruit.add("Cherry");
        Fruit.add("Pear");
        Fruit.add("Mango");

        // Using for Forech lambda
        System.out.println("\nUsing for lambda:");
        Fruit.forEach(fruit -> {
            System.out.println(fruit);
        });

        // Using for loop with iterator(lap)
        System.out.println("\nUsing for loop with iterator:");
        Iterator<String> iterator = Fruit.iterator();
        Fruit.forEach(fruit -> {
            System.out.println(fruit);
        });

        // using ListIterator
        ListIterator<String> listFruit = Fruit.listIterator(Fruit.size());
        while (listFruit.hasPrevious()) {
            String fruit = listFruit.previous();
            System.out.println(fruit);
        }

        // for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : Fruit) {
            System.out.println(fruit);
        }

    }
}

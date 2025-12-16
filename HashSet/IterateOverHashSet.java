package collections.HashSet;
import java.util.*;
import java.util.Iterator;

//lap qua HashSet
public class IterateOverHashSet {
    public static void main(String[] args) {
        HashSet<String> Fruit = new HashSet<String>();
        Fruit.add("Apple");
        Fruit.add("Banana");
        Fruit.add("Orange");
        Fruit.add("Mango");

        // Sử dụng vòng lặp for-each lambda
        System.out.println("\nUsing for-each loop:");
        Fruit.forEach(fruit-> {
            System.out.println(Fruit);
        });

        // iterate qua HashSet
        System.out.println("Using iterate:");
        Iterator<String> FruitIterator  = Fruit.iterator();
        while (FruitIterator.hasNext()) {
            String fruit = FruitIterator.next();
            System.out.println(FruitIterator.next());
        }

        //Using forEach
        System.out.println("Using forEach method:");
        for(String fruit : Fruit) {
            System.out.println(fruit);
        }
    }
}

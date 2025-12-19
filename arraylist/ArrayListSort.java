package collections.arraylist;
import java.util.*;
import java.util.Comparator;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Grapes");

        System.out.println("Fruit: " + fruit);

        // Truy caap
        System.out.println("Fruit: " + fruit.get(2));

        // duyệt
        for (int i = 0; i < fruit.size(); i++) {
            System.out.println("Fruit " + i + ": " + fruit.get(i));
        }

        // Sort the ArrayList
        fruit.sort(new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                return fruit1.compareTo(fruit2);
            }
        });
        // use lambda
        fruit.sort((fruit1, fruit2) -> fruit1.compareTo(fruit2));

        System.out.println("After sorting: " + fruit);
    }
}

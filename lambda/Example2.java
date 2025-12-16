package collections.lambda;
import java.util.*;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<String> Fruits = new ArrayList<String>();
        Fruits.add("Orange");
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Pineapple");

        Consumer<String> method = (n) -> System.out.println(n);
        Fruits.forEach(method);
    }
}

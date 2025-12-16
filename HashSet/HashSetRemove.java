package collections.HashSet;
import java.util.HashSet;
import java.util.*;

public class HashSetRemove {
    public static void main(String[] args) {
        HashSet<Double> numbers = new HashSet<>();
        numbers.add(556.2);
        numbers.add(23.7);
        numbers.add(78.9);
        numbers.add(90.4);
        numbers.add(88.39);

        System.out.println("list numbers" + numbers);
        // Remove an element
        boolean isRemoved = numbers.remove(78.9);
        System.out.println("after remove(78.9) : "+ numbers);

        List<Double> Squares= new ArrayList<>();
        Squares.add(23.7);
        Squares.add(90.4);

        numbers.removeAll(Squares);
        System.out.println("after removeAll(Squares) : "+ numbers);

        numbers.clear();
        System.out.println("after clear() : "+ numbers);
    }
}

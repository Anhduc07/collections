package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        System.out.println("before" +numbers);
        Collections.sort(numbers);
        System.out.println("After"+ numbers);
    }
}

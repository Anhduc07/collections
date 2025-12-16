package collections;
import  java.util.ArrayList;
import  java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(1.0);
        numbers.add(2.5);
        numbers.add(3.8);
        numbers.add(4.2);
        numbers.add(5.6);

        Iterator<Double> numbersItertor = numbers.iterator();
        while (numbersItertor.hasNext()) {
            Double num = numbersItertor.next();
            if (num > 3.0) {
                numbersItertor.remove();
            }
        }

        System.out.println("After"+ numbers);
    }
}

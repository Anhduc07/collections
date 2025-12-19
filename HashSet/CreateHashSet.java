package collections.HashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class CreateHashSet {
    public static void main(String[] args) {
        HashSet<String> dayOfWeek = new HashSet<String>();
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");

        dayOfWeek.add("Monday");
        dayOfWeek.remove("Friday");// Duplicate entry, will be ignored

        System.out.println("Days of the week: " + dayOfWeek);

        //contains
        System.out.println(dayOfWeek.contains("Monday"));

        HashSet<Double> numbers = new HashSet<Double>();
        numbers.add(1.1);
        numbers.add(2.2);
        numbers.add(3.3);
        numbers.add(5.7);
        numbers.add(6.8);
        numbers.add(2.2); // Duplicate entry, will be ignored
        numbers.add(6.8);
        System.out.println("Numbers: " + numbers);
    }
}

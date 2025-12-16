package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> Animals = new ArrayList<>();

        Animals.add("Dog");
        Animals.add("Cat");
        Animals.add("Elephant");
        Animals.add("Pig");
        Animals.add("Lion");
        System.out.println("Animals List: " + Animals);

        Animals.add(2, "Tiger");
        System.out.println("After adding Tiger at index 2: " + Animals);
    }
}

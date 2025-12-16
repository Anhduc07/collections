package collections.HashMap;
import java.util.*;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> NumberMapping = new HashMap<>();
        NumberMapping.put("One", 1);
        NumberMapping.put("Two", 2);
        NumberMapping.put("Three", 3);
        NumberMapping.put("Four", 4);

        NumberMapping.putIfAbsent("Five", 5);

        System.out.println("Number Mapping: " + NumberMapping);

    }
}

package collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Geeks {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Map<Integer, String> hm = new HashMap<Integer, String>();

        map.put("Geek1", 1);
        map.put("Geek2", 2);
        map.put("Geek3", 3);

        hm.put(new Integer(1), "Geeks");
        hm.put(new Integer(2), "For");
        hm.put(new Integer(3), "Geeks");
        hm.put(new Integer(4), "All");

        hm.put(new Integer(2), "Welcome");// update
        hm.remove(new Integer(4)); // remove

        for (Map.Entry mapElement : hm.entrySet()) { // lặp
            int key = (int) mapElement.getKey();

            String value = (String) mapElement.getValue();

            System.out.println(key + " : " + value);
        }
            System.out.println("Map elements: " + map);
            System.out.println("Map elements: " + hm);

    }
}

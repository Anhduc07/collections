package collections.treemap;
import  java.util.*;

public class CreateTreeMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> extensions = new TreeMap<>();
        extensions.put(1, "One");
        extensions.put(2, "Two");
        extensions.put(3, "Three");
        extensions.put(4, "Four");

        System.out.println(extensions);
    }
}

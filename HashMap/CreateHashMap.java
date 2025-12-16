package collections.HashMap;
import java.util.*;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> NumberMapping = new HashMap<>();
        NumberMapping.put("One", 1);
        NumberMapping.put("Two", 2);
        NumberMapping.put("Three", 3);
        NumberMapping.put("Four", 4);
        NumberMapping.put("six", 6 );


// put key chưa tồn tại
        NumberMapping.putIfAbsent("Five", 5);

        // cùng key and value -> chỉ ghi 1 lần
        NumberMapping.put("six", 6 );

        // cùng key but khác value -> ghi đè (6 -> 66)
        NumberMapping.put("six", 66 );

        System.out.println("Number Mapping: " + NumberMapping);

    }
}

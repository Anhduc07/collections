package collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 1key nhiều value
public class MultivalueMap {
    public  static void main(String[] args) {
        HashMap<String,List<String>> cityDistricts = new HashMap<>();
        cityDistricts.computeIfAbsent("Hanoi",k -> new ArrayList<>()).add("Hoan Kiem");
        cityDistricts.computeIfAbsent("Hanoi",k -> new ArrayList<>()).add("Ba Dinh");
        cityDistricts.computeIfAbsent("Hanoi",k -> new ArrayList<>()).add("Tay Ho");

        System.out.println("City Districts:"+ cityDistricts);

     List<String> hanoi =cityDistricts.getOrDefault("Hanoi", List.of());
     System.out.println("Hanoi districts"+ hanoi);

    }
}

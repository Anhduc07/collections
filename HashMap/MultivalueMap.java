package collections.HashMap;

import java.util.*;

// 1key nhiều value
public class MultivalueMap {
    public  static void main(String[] args) {
        // map list cho phép trùng value(vẫn lưu) (1key, nhieu value)
        HashMap<String,List<String>> cityDistricts = new HashMap<>();
        cityDistricts.computeIfAbsent("Hanoi",k -> new ArrayList<>()).add("Hoan Kiem");
        cityDistricts.computeIfAbsent("Hanoi",k -> new ArrayList<>()).add("Ba Dinh");
        cityDistricts.computeIfAbsent("Hanoi",k -> new ArrayList<>()).add("Tay Ho");
        cityDistricts.computeIfAbsent("Hanoi",k -> new ArrayList<>()).add("Tay Ho");


        System.out.println("City Districts:"+ cityDistricts);

        List<String> hanoi =cityDistricts.getOrDefault("Hanoi", List.of());
        System.out.println("Hanoi districts"+ hanoi);


        //map set ko cho phép trùng value(nếu trùng ko lưu)
        HashMap<String, Set<String>> cityDistricts2 = new HashMap<>();
        cityDistricts2.computeIfAbsent("Hano",k -> new HashSet<>()).add("hà đông");
        cityDistricts2.computeIfAbsent("Hano",k -> new HashSet<>()).add("hà đông");
        cityDistricts2.computeIfAbsent("Hano",k -> new HashSet<>()).add("Tay Ho");


        System.out.println("City Districts2:"+ cityDistricts2);

        Set<String> hanoiSET =cityDistricts2.getOrDefault("Hanoi",Set.of());
        System.out.println("Hanoi districts2"+ hanoiSET);

    }
}

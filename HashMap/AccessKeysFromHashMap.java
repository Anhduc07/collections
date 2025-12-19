package collections.HashMap;
import java.util.HashMap;

// truy cập key từ HashMap
public class AccessKeysFromHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> cityById= new HashMap<>();

        // check if the HashMap is empty
        System.out.println("Is the NameMapping HashMap empty? " + cityById.isEmpty());
        cityById.put(1, "London");
        cityById.put(2, "Paris");
        cityById.put(3, "New York");
        cityById.put(4, "HaNoi");
        cityById.put(5, "New York");
        cityById.put(5, "LA");

        cityById.put(6, "Paris");
        cityById.put(6, "New York");



        System.out.println("cityById" + cityById);

        // find the size from the HashMap
        System.out.println("We have the city info" + cityById.size() + " ids");

        int id = 1;
        // check if a key exists in the HashMap
        if(cityById.containsKey(id)) {
            String city = cityById.get(id);
            System.out.println("The value for key " + id + " is: " + cityById.get(id));
        } else {
            System.out.println("Key " + id+ " not found ");
        }

        System.out.println("Contains value 'Hanoi' " + cityById.containsValue("Hanoi"));

        cityById.put(id, "Hue");
        cityById.remove(id,"");

        String remove = cityById.remove(4);
        System.out.println("Removed city: " + remove);
        System.out.println("cityById after removal: " + cityById);
    }
}

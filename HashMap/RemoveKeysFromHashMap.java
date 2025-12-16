package collections.HashMap;

import java.util.HashMap;


public class RemoveKeysFromHashMap {
    public static void main(String[] args) {
        HashMap<String, String> personMapping= new HashMap<>();
        personMapping.put("jame", "Alice");
        personMapping.put("john", "Bob");
        personMapping.put("Rose", "Charlie");
        personMapping.put("mike", "David");

        System.out.println("person" + personMapping);

        String key = "jame";
        String removedValue= personMapping.remove(key);

        System.out.println("couble key(" + key + "=>"  + removedValue);
        System.out.println("person after remove key " + personMapping);

        boolean isRemoved = personMapping.remove("John", "Bob");
        System.out.println("Removed pair (john,Bob)" + isRemoved);
        System.out.println(" after remove key " + personMapping);

        boolean removedDavid  = personMapping.values().remove("David");
        if (removedDavid){
            System.out.println("Removed entry having value 'David'");
        }else {
            System.out.println("Did not find entry having value 'David'");
        }
            System.out.println("after remove value " + personMapping);
        }

    }

package collections.HashSet;

import java.util.HashSet;

// thao tác đơn giản với HashSet
public class HashSetSimpleOperations {
    public static void main(String[] args) {
        HashSet<String> celebrity = new HashSet<>();
        // check empty
        System.out.println("Is HashSet empty? " + celebrity.isEmpty());
        // add elements
        celebrity.add("Justin Bieber");
        celebrity.add("Lady Gaga");
        celebrity.add("Chris Evans");
        celebrity.add("Leonardo DiCaprio");
        celebrity.add("Neymar Jr.");

        System.out.println("celebrity elements: " + celebrity.stream());

        String nameToCheck = "Neymar Jr.";
        if(celebrity.contains(nameToCheck)){
            System.out.println(nameToCheck + " is in the HashSet.");
        } else {
            System.out.println(nameToCheck + " is not in the HashSet.");
        }

    }
}

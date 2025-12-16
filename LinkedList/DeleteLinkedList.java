package collections.LinkedList;

import java.util.LinkedList;

public class DeleteLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ListFruit= new LinkedList<>();
        // create linked list
        ListFruit.add("Apple");
        ListFruit.add("Banana");
        ListFruit.add("Cherry");
        ListFruit.add("Lychee");
        ListFruit.add("Dragonfruit");
        ListFruit.add("Pear");

        System.out.println("intial listFruit: " + ListFruit);

        // Delete first element

        String element1= ListFruit.removeFirst();
        System.out.println("after removeFirst: " + element1 + ", listFruit: " + ListFruit);

        boolean isRemoved = ListFruit.remove("Cherry");
        if(isRemoved){
            System.out.println("after remove 'Cherry': listFruit: " + ListFruit);
        } else {
            System.out.println("'Cherry' not found in the list.");
        }

        ListFruit.removeIf(Fruit-> Fruit.startsWith("D"));
        System.out.println("after removeIf starwith D =>  " + ListFruit);


        ListFruit.clear();
        System.out.println("after cleared the linkedList => " + ListFruit);

    }
}

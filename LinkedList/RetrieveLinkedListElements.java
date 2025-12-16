package collections.LinkedList;

import java.util.LinkedList;


public class RetrieveLinkedListElements {
    public static void main(String[] args) {
        LinkedList<String> Color = new LinkedList();
        Color.add("Red");
        Color.add("Green");
        Color.add("Black");
        Color.add("White");
        Color.add("Pink");
        Color.add("Blue");

        String firstColor = Color.getFirst();
        System.out.println("First Color: " + firstColor);

        String lastColor = Color.getLast();
        System.out.println("Last Color: " + lastColor);

        String ThirdColor = Color.get(2);
        System.out.println("Third Color: " + ThirdColor);
    }
}

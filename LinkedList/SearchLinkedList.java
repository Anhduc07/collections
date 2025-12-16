package collections.LinkedList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class SearchLinkedList {
    public static void main(String[] args) {
        LinkedList<String> empolyees= new LinkedList();

        empolyees.add("Quan");
        empolyees.add("Nam");
        empolyees.add("Sam");
        empolyees.add("An");
        empolyees.add("Binh");
        empolyees.add("Hieu");

        // check có phần tử An hay không
        System.out.println("After add \"An\" ?: " + empolyees.contains("An"));

        System.out.println("IndexOf \"Binh\" ?: " + empolyees.indexOf("Binh"));
        System.out.println("IndexOf \"Pham Hieu\" ?: " + empolyees.indexOf("Pham Hieu"));


        System.out.println(" Last IndexOf \"Hieu\" ?: " + empolyees.lastIndexOf("Hieu)"));

        System.out.println(" Last IndexOf \"Tu\" ?: " + empolyees.lastIndexOf("Tu)"));
    }
}

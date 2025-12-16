package collections;
import java.util.ArrayList;
import java.util.List;


public class AccesElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompains = new ArrayList<>();

        System.out.println("Initial list of companies: " + topCompains.isEmpty());

        topCompains.add("Google");
        topCompains.add("Apple");
        topCompains.add("Microsoft");
        topCompains.add("Amazon");
        topCompains.add("Facebook");

        System.out.println("List trends " + topCompains.size()+"in the world");
        System.out.println(topCompains);

        String bestCompany = topCompains.get(0);
        String bestCompany2 = topCompains.get(1);
        String lastCompany = topCompains.get(topCompains.size() - 1);

        System.out.println("The best company is: " + bestCompany);
        System.out.println("The second best company is: " + bestCompany2);
        System.out.println("The last company in the list is: " + lastCompany);

        topCompains.set(4, "Meta");
        System.out.println("Updated list of companies: " + topCompains);
    }
}

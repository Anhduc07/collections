package collections.arraylist;
import java.util.*;

public class SearchElementsInArrayList {
    public static void main(String[] args) {
        List<String> footballclubs = new ArrayList<>();
        footballclubs.add("Manchester United");
        footballclubs.add("Real Madrid");
        footballclubs.add("Barcelona");
        footballclubs.add("Bayern Munich");
        footballclubs.add("Juventus");
        footballclubs.add("Roma");
        footballclubs.add("Liverpool");
        footballclubs.add("Chelsea");
        footballclubs.add("Barcelona");

        // check contains
        System.out.println("contain\"Liverpool\"? : "  + footballclubs.contains("Liverpool"));

        // find indexOf first and last
        System.out.println("indexOf \"Barcelona\": " + footballclubs.indexOf("Barcelona"));
        System.out.println("indexOf \"Chelsea\": " + footballclubs.indexOf("Chelsea"));

        System.out.println("indexOf \"Manchester United\": " + footballclubs.indexOf("Manchester United"));




    }
}

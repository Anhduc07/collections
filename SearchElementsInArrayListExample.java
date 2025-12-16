package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("PHP");
        languages.add("C#");

        System.out.println("Search languages:"+languages);

        System.out.println("indexOf \"Python\":"+languages.indexOf("Python"));
        System.out.println("indexOf \"Java\":"+languages.indexOf("Java"));
        System.out.println("indexOf \"Ruby\":"+languages.indexOf("Ruby"));
        System.out.println("indexOf \"C#\":"+languages.indexOf("C#"));
        System.out.println("indexOf \"C++\":"+languages.indexOf("C++"));
    }
}

package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C#");

        System.out.println("Original ArrayList: " + programmingLanguages);

        // Remove by value
        programmingLanguages.remove("Python");
        System.out.println("After removing 'Python': " + programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("Ruby");
        System.out.println("After removing 'Ruby': " + programmingLanguages);

        List<String> scriptLanguages = new ArrayList<>();
        scriptLanguages.add("JavaScript");
        scriptLanguages.add("Python");
        scriptLanguages.add("PHP");

        programmingLanguages.removeAll(scriptLanguages);
        System.out.println("After removing(scriptLanguages): " + programmingLanguages);

        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("PHP");
            }
        });

        System.out.println("After removing elements starting with 'PHP': " + programmingLanguages);

        programmingLanguages.clear();
        System.out.println("After clearing the ArrayList: " + programmingLanguages);
    }
}

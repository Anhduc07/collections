package collections.treeset;
import java.util.TreeSet;
import java.util.*;

public class CreateTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> number = new TreeSet<>();
        number.add(5);
        number.add(2);
        number.add(8);
        number.add(1);
        number.add(3);
        number.add(50);
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);

        System.out.println("TreeSet numeber elements: " + number);

        // Remove an element
        number.remove(3);
        System.out.println("After removing 3: " + number);

        boolean isRemoved = number.remove(25);
        if(isRemoved){
            System.out.println("After removing 25: " + number);
        }

        // removeAll elements divisible by 2
        number.removeIf(numbers -> numbers % 2 == 0);
        System.out.println("After removeIf() : " + number);

        // Retrieve and remove the first element from the TreeSet
        Integer num = number.pollFirst();
        System.out.println("Removed first element " + num + " from the TreeSet : " + number);


        // Check if an element exists
        boolean containsFive = number.contains(5);
        System.out.println("TreeSet contains 5: " + containsFive);

         // Duplicate elements
        number.add(5);
        System.out.println("After adding duplicate 5: " + number);

        // Iterate through the TreeSet
        System.out.print("Iterating through TreeSet: ");
        for (Integer n : number) {
            System.out.print(n+ " ");
        }
    }
}

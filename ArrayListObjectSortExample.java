package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class person {
   private String name;
   private Integer age;
   public person(String name, Integer age) {
      this.name = name;
      this.age = age;
   }
   public void setName(String name) {
      this.name = name;
   }
    public String getName() {
        return name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<person> personList = new ArrayList<>();
        personList.add(new person("Quan", 25));
        personList.add(new person("Nam", 30));
        personList.add(new person("Bob", 20));
        personList.add(new person("peter", 40));


        System.out.println("ListPerson:"+personList);
        personList.sort((p1,p2) -> {
            return p1.getAge() - p2.getAge();
        });

        personList.sort(Comparator.comparing(person::getAge));
        System.out.println("After Sort by age:"+personList);

        // Sort by name
        Collections.sort(personList, Comparator.comparing(person::getName));
        System.out.println("After Sort by name:"+personList);
    }
}

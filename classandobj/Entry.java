package collections.classandobj;

import java.util.Scanner;

class Student{
    String name;
    int age;

    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Entry {
    public void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Đức Anh";
        s1.age = 20;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}

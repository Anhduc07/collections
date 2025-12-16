package collections.arraylist;

import java.util.List;
import java.util.*;

class Student {
    private String name;
    private String StudentId;
    private int age;

    public Student(String name, int age, String StudentId) {
        this.name = name;
        this.age = age;
        this.StudentId = StudentId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return StudentId;
    }
    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ArrayListStudentDefinedObject {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Đức Anh", 22, "21021555"));
        student.add(new Student("Nam Anh", 22, "21021655"));
        student.add(new Student("Hieeu", 26, "21021576"));

        student.forEach(s -> {
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Student ID: " + s.getStudentId());
        });
    }
}

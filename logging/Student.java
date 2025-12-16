package collections.logging;

public class Student {
    private final String name;
    private final int age;
    private  final String studentID;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.studentID = id;
    }

    public String getStudentId() { return studentID; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Student{id='%s', name='%s', age=%d}".formatted(studentID, name, age);
    }
}

package collections.classandobj;

class SinhVien{
    private String name;
    private int age;

    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public  static void main(String[] args) {
        SinhVien sv = new SinhVien("Anh", 20);
        sv.display();
    }
}

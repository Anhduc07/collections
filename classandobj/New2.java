package collections.classandobj;


class MyClass{
    public static int x = 10;
}
public class New2 {

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();
        m1.x = 20;
        System.out.print(m1.x + " " + m2.x);
    }
}
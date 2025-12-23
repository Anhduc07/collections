package collections.abstraction;

public class Example1 {
    public  static void main(String[] args) {
        Shape s1=new Circle(4);
        Shape s2=new Rectangle(4,5);

        System.out.println("Area of Circle: "+s1.area());
        System.out.println("Area of Rectangle: "+s2.area());
    }
}

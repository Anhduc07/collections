package collections.wrapper;

public class Ex2 {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);

        System.out.println(c.equals(d));
    }
}


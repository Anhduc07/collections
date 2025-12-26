package collections.wrapper;

import java.util.ArrayList;

public class Ex1 {
    public  static void main(String[] args) {
        int a = 5;
        Integer A= a; //autoboxing

        Integer B = 10;
        int b = B; //unboxing

        System.out.println(A);
        System.out.println(B);

        Integer num = 100; // int -> Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(200); // int -> Integer

        // Unboxing
        int value = num; // Integer -> int
        int sum = numbers.get(0) + 50; // Integer -> int, sau đó thực hiện phép cộng

        System.out.println("Giá trị của num: " + value);
        System.out.println("Tổng: " + sum);
    }
}


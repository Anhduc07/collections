package collections.work;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien("Nhan", 20, 23, 1233);

        SinhVien sv2 = new SinhVien("An", 21, 22, 1234);

        SinhVien sv3 = new SinhVien("an", 21, 23, 1274);

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        sc.close();
        }
}
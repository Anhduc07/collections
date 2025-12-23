package collections.work;

import java.util.Scanner;

public class MainHcn {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double length = sc.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double width = sc.nextDouble();
        Hinhchunhat hcn = new Hinhchunhat(length, width);
        System.out.println("Chu vi hinh chu nhat: " + hcn.area());
        System.out.println("Dien tich hinh chu nhat: " + hcn.S());


    }
}

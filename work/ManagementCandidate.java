package collections.work;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementCandidate {

    private ArrayList<Candidate> cd = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // them ứng vien
    public void addCandidate() {
       System.out.println("Chọn khoi thi: ");
       System.out.println("1. Khoi A");
       System.out.println("2. Khoi B");
       System.out.println("3. Khoi C");

       int select = sc.nextInt();
       sc.nextLine();

       System.out.print("Tên thí sinh: ");
       String Hoten = sc.nextLine();

       System.out.print("số bao danh: ");
       String soBd = sc.nextLine();

       System.out.print("địa chir: ");
       String diaChi = sc.nextLine();

       System.out.print("ddiem cong: ");
       int Uutien = sc.nextInt();
       sc.nextLine();

        switch (select) {
            case 1 -> cd.add(new CandidateA(Hoten, diaChi, soBd, Uutien));
            case 2 -> cd.add(new CandidateB(Hoten, diaChi, soBd, Uutien));
            case 3 -> cd.add(new CandidateC(Hoten, diaChi, soBd, Uutien));
            default -> System.out.println("Lua chon khong hop le!");
        }
    }

    // display
    public void hienThi() {
        cd.forEach(System.out::println);
    }

    // search by SBD
    public void timTheoSBD(String sbd) {
        boolean found = false;
        for (Candidate number : cd) {
            if (number.getCode().equalsIgnoreCase(sbd)) {
                System.out.println(number);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay thi sinh!");
        }
    }
    //  MENU
    public void menu() {
        while (true) {
            System.out.println("\n1.Them  2.Hien thi  3.Tim theo SBD  0.Thoat");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1 -> addCandidate();
                case 2 -> hienThi();
                case 3 -> {
                    System.out.print("Nhap SBD can tim: ");
                    timTheoSBD(sc.nextLine());
                }
                case 0 -> System.exit(0);
            }
        }
    }
}


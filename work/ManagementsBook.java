package collections.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ManagementsBook {

    private ArrayList<Document> dc= new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // thêm tai lieu
    public void addDocument() {
        System.out.println("Select docunment type to add: ");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. Newspaper");

        int select = sc.nextInt();
        sc.nextLine();

        System.out.print("Ma tai lieu: ");
        String ma = sc.nextLine();

        System.out.print("Ten NXB: ");
        String nxb = sc.nextLine();

        System.out.print("So ban phat hanh: ");
        int soBan = sc.nextInt();
        sc.nextLine();

        switch (select) {
        case 1 ->  {
            System.out.print("Ten tac gia: ");
            String tg = sc.nextLine();

            System.out.print("So trang: ");
            int st = sc.nextInt();
            dc.add(new Book(ma, nxb, soBan, tg, st));
            System.out.print("Đa them sách moi!");

        }
        case 2 -> {
            System.out.print("So phat hanh: ");
            String issueNumber  = sc.next();

            System.out.print("Thang phat hanh: ");
            int monthofRelease  = sc.nextInt();

            dc.add(new Magazine(ma, nxb, soBan, issueNumber, monthofRelease));
            System.out.println("Da them tap chi moi!");
        }
        case 3 ->  {
            sc.nextLine();
            System.out.print("Ngay phat hanh: ");
            String ngay = sc.nextLine();
            dc.add(new Newspaper(ma, nxb, soBan, ngay));
            System.out.println("Da them tap chi moi!");
        }
            default -> System.out.println("Lua chon khong hop le!");
    }
    }

    // Xóa theo mã
    public void xoaTheoMa(String code) {
        Iterator<Document> it = dc.iterator();
        while (it.hasNext()) {
            if (it.next().getDocumentCode().equals(code)) {
                it.remove();
                System.out.println("Da xoa tai lieu!");
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    // Hiển thị
    public void hienThi() {
        dc.forEach(System.out::println);
    }

    // Tìm theo loại
    public void timTheoLoai(String type) {
        type = type.trim().toLowerCase();
        boolean found = false;

        for (Document d : dc) {
            if (type.equals("sach") && d instanceof Book) {
                System.out.println(d);
                found = true;
            } else if (type.equals("tapchi") && d instanceof Magazine) {
                System.out.println(d);
                found = true;
            } else if (type.equals("bao") && d instanceof Newspaper) {
                System.out.println(d);
                found = true;
            }
        }
        if (!found) {}
             System.out.println("Khong tim thay loai tai lieu nay!");
    }
    // Menu
    public void menu() {
        while (true) {
            System.out.println("\n1.Them  2.Xoa  3.Hien thi  4.Tim theo loai  0.Thoat");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1 -> addDocument();
                case 2 -> {
                    System.out.print("Nhap code can delete: ");
                    xoaTheoMa(sc.nextLine());
                }
                case 3 -> hienThi();
                case 4 -> {
                    System.out.print("Insert (Book/Magazine/Newspaper): ");
                    timTheoLoai(sc.nextLine());
                }
                case 0 -> System.exit(0);
            }
        }
    }
}


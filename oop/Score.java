package collections.oop;

public class Score {
    public static void main(String[] args) {

        SinhVien it1 = new SinhVienIT(8, 9);
        SinhVien it2 = new SinhVienIT(9.5, 8.4);

        System.out.printf("Score It1:" + it1.getScore());
        System.out.printf("Score It2:" + it2.getScore());

        SinhVien Car1 = new SinhVienCar(7, 8.9);
        System.out.printf("Score car1:" + Car1.getScore());
    }
}

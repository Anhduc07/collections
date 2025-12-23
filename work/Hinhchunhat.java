package collections.work;

public class Hinhchunhat {

    private double length;
    private double width;

    public Hinhchunhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double S() {
        return 2*(length * width);
    }

    @Override
    public String toString() {
        return "HinhChuNhat {" +
                "Chieu dai = " + length +
                ", Chieu rong = " + width +
                ", Dien tich = " + area() +
                ", Chu vi = " + S() +
                '}';
    }
}

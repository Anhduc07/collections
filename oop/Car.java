package collections.oop;

public class Car extends  Vehicle {
    private String modelName = "Ford Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

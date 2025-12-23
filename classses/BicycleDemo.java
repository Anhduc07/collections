package collections.classses;

public class BicycleDemo {
    public static void main(String[] args) {
        // khơởi tạo
         Bicycle b = new Bicycle(30,2,3);
         Bicycle b2 = new Bicycle(30,2,5);

        b.changeGear(10);
        b2.speedUp(10);
        b.changeGear(2);

        System.out.println("Bicycle 1 present state :"+b);

    }
}

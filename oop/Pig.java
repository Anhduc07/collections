package collections.oop;

public class Pig implements IAnimal{
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    public void run() {
        System.out.println("êc êc");
    }

}

package collections.lambda;

public class Main {

    public static void main(String[] args) {

        Merhaba merhaba = () -> "Anh Hoang Duc";

        System.out.println(merhaba.selam());

        Merhaba2 merhaba2 = (s) -> "Anh Hoang Duc  " + s ;
        System.out.println(merhaba2.selam("Can"));

        Topla topla = (x,y) -> x + y ;
        System.out.println(topla.topla(15, 2456));
    }
}


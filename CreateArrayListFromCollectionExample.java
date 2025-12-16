package collections;
import  java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Double> FirstSevenPrimeNumber = new ArrayList<>();
        FirstSevenPrimeNumber.add(2.0);
        FirstSevenPrimeNumber.add(3.0);
        FirstSevenPrimeNumber.add(5.0);
        FirstSevenPrimeNumber.add(7.0);
        FirstSevenPrimeNumber.add(11.0);
        FirstSevenPrimeNumber.add(13.0);
        FirstSevenPrimeNumber.add(17.0);

        List<Double> FirsFiftentPrimeNumber = new ArrayList<>(FirstSevenPrimeNumber);

        List<Double> nextEightPrimeNumber = new ArrayList<>(FirsFiftentPrimeNumber);
        nextEightPrimeNumber.add(19.0);
        nextEightPrimeNumber.add(23.0);
        nextEightPrimeNumber.add(29.0);
        nextEightPrimeNumber.add(31.0);
        nextEightPrimeNumber.add(37.0);
        nextEightPrimeNumber.add(41.0);
        nextEightPrimeNumber.add(43.0);
        nextEightPrimeNumber.add(47.0);

        FirsFiftentPrimeNumber.addAll(nextEightPrimeNumber);

        System.out.println("First SevenPrime Number: " + FirsFiftentPrimeNumber);

    }
}

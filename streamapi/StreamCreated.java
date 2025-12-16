package collections.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreated {
    public  static void main(String[] args) {
        streamOfCollection();
        streamOfSet();
        steamOfValues();
        streamOfArray();
        streamBuilder();
        streamIterate();
        lazyOperations();

    }
    private static void streamOfCollection() {
        Collection<String> stringCollection = Arrays.asList("One", "Two", "Three");
        Stream<String> streamOfCollection = stringCollection.stream();
        System.out.println("Stream Collection:");
        streamOfCollection.forEach(System.out::println);
    }

    private static void streamOfSet() {
        Set<String> stringSet = new HashSet<>(Arrays.asList("One", "Two", "Three"));
        Stream<String> streamOfSet = stringSet.stream();
        System.out.println("\nStream Set:");
        streamOfSet.forEach(System.out::println);
    }

    private static void steamOfValues() {
        Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3);
        System.out.println("\nStream Values:");
        streamOfIntegers.forEach(System.out::println);
    }

    private static void streamOfArray() {
        System.out.println("\nStream From Arrays:");
        example1[] personArray = {new example1("DucAnh", 18), new example1("Nam", 20)};
        Stream<example1> example1Stream = Arrays.stream(personArray);
        example1Stream.forEach(example1-> System.out.println("Person Name: " +example1.getName()));

        System.out.println("\nPremitive Stream From Arrays:");
        int[] intArray = {1,2,3,4,5,6};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(System.out::println);
    }

    private static void streamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamFromBuilder = builder.add("One").add("Two").add("Three").build();
        System.out.println("\nStream From Builder:");
        streamFromBuilder.forEach(System.out::println);
    }

    private static void streamIterate() {
        Stream<Integer> streamFromIterate = Stream.iterate(0, n -> n + 2).limit(10);
        System.out.println("\nStream From Iterate:");
        streamFromIterate.forEach(System.out::println);
    }

    private static void lazyOperations() {
        System.out.println("\nStream lazyOperations:");
        // nothing will be printed
        Stream.of("one", "two", "Three").map(s -> s.toUpperCase())
                .peek(System.out::println);

        System.out.println("\nAdding count:");
        Stream.of("one", "two", "Three").map(s -> s.toUpperCase())
                .peek(System.out::println).count();
    }
}


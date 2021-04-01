package example2;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        // Create empty stream instead of return null
        Stream<Integer> s1 = Stream.empty();
        System.out.println(s1);

        List<Integer> l1 = getNumbers();
        System.out.println(l1);

        // Create Finite Stream
        Stream<Integer> numbers = Stream.of(1,2,3,4);
        numbers.forEach(System.out::println);

        // create Infinite Stream
        Supplier<Integer> r = () -> new Random().nextInt();
        Stream<Integer> randomNumber = Stream.generate(r);

        randomNumber.limit(5)
                .forEach(System.out::println); // without limit the loop will execute cont.. so we should
                                                // add the limit to terminate the expression

        // Stream iterate using java 8
        Stream<Integer> s2 = Stream.iterate(1, x -> x + 1);
        s2.limit(5)
                .forEach(System.out::println);

        // Stream iterate using java 9 it will acts as for loops
        Stream<Integer> s3 = Stream.iterate(1,
                i -> i < 10, // Predicate
                i -> i +1); // UnaryOperator

        s3.forEach(System.out::println);
    }

    private static List<Integer> getNumbers() {
        return Collections.emptyList();
    }
}

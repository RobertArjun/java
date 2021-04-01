package example4;

import java.util.List;
import java.util.function.Function;

public class Example4 {

    public static void main(String[] args) {
        List<String> names = List.of("Robert", "Arjun", "Jenifer");
        // java.util.function  = Function<T,R>
        // Function<T,T> = UnaryOperator<T>
        // Function<T,Boolean> = Predicate<T>
        Integer totalSum = names.stream() // "Robert", "Arjun", "Jenifer"
                .map(x -> x.length()) // 6, 5, 7 - its transforming one type to another type i.e Functional interface
                .reduce(0, (a,b) -> a+b); // reduce first a = 0 (initial) b = 6 (first map values)
                // 0 + 6 = 6
                // 6 + 5 = 11
                // 11 + 7 = 18
        System.out.println(totalSum); // 18

        names.stream()
                .map(x -> new StringBuilder(x).reverse().toString()) // "treboR", "nujrA", "refineJ"
                .forEach(System.out::println);
    }
}

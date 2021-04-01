package example1;

import java.util.List;
import java.util.function.Predicate;

public class Example1 {

    public static void main(String[] args) {
        List<String> names = List.of("Robert", "Arjun","Jenifer","Vilbert");

        // before Java8
        for (String name : names) {
            if (name.endsWith("t")) {
                System.out.println(name);
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Using Java 8");
        System.out.println("-----------------------------------------");
        // using Lambda Java8
        Predicate<String> endWithStringPredicate = x -> x.endsWith("t");
        names.stream()
                .filter(endWithStringPredicate)
                .forEach(System.out::println); // equal to  x-> System.out.println(x) if the input parameter
                                                    // and expression parameter are same then we can use ::

    }
}

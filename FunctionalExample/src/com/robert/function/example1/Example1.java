package com.robert.function.example1;

import java.util.function.*;

public class Example1 {
    public static void main(String[] args) {
        // Most important functional interface basic
        /*
        1. Consumer
        2. BiConsumer
        3. Supplier
        4. Function
        5. BiFunction
        6. Unary Function
        7. Binary Function
        8. Predicate
        9. BiPredicate
         */
        // Consumer SHOULD NOT return any values

        Consumer<String> c1 = (s) -> System.out.println(s);
        c1.accept("Robert");

        BiConsumer<String, String> c2 = (k, v) -> System.out.println(k + " " + v);
        c2.accept("Robert", "Jenifer");

        // Consumer SHOULD NOT have any INPUT values but its returns a value not more than 1 return values
        Supplier<String> s1 = () ->  "10";
        System.out.println(s1.get());

        // Function can consume one type to supply another type or same type so function has input and return
        Function<String, Integer> f1 = (a) -> a.length();

        int lenghtSize = f1.apply("Robert");
        System.out.println("Total Size "+ lenghtSize);

        BiFunction<Integer,Integer,String> f2 = (a,b) -> a + "" + b;

        String contactString = f2.apply(10,20);
        System.out.println(contactString);

        // Predicate its kind of function but its SHOULD return only TRUE or FALSE means boolean
        Predicate<Integer> p1 = (x) -> x %2 == 0;
        boolean b = p1.test(10);
        System.out.println(b);

        BiPredicate<String, String> p2 = (x,y) -> x.equals(y);
        boolean b2 = p2.test("Robert", "Robert");
        System.out.println(b2);

        // Unary Operator has same input as a return type i.e input and output both are same parameter
        UnaryOperator<Integer> u1 = (a) -> a +1;
        int uu1 = u1.apply(10);
        System.out.println(uu1);

        // Binary Operator its kind of BiFunction single input parameter is same for two input type and out
        BinaryOperator<Integer> bb1 = (x,y) -> x + y;
        int binary = bb1.apply(10,20);
        System.out.println(binary);

    }
}

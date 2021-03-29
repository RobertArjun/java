package com.robert.function.example1;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {
    public static void main(String[] args) {
        System.out.println(" Consumer Example");
        List<Integer> numbers = List.of(10,20,30,40);

        Consumer<Integer> integerConsumer = x -> System.out.println(x);

        numbers.forEach(integerConsumer);
        System.out.println("-----------------------------------------------");
        System.out.println(" BiConsumer Example");
        Map<Integer, String> m1 = Map.of(
                1,"A",
                2,"B",
                3, "C");
        BiConsumer<Integer, String> c1 = (k, v) -> System.out.println(k + " " + v);
        m1.forEach(c1);
    }
}

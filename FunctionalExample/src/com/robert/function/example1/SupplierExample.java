package com.robert.function.example1;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Random r = new Random();

        Supplier<Integer> s = () -> r.nextInt(1000); // It will return the 0 to 999

        System.out.println("Generated Values " + s.get());
    }
}

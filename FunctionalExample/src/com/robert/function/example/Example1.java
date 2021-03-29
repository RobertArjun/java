package com.robert.function.example;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Hi");
        Editable e1 = () -> System.out.println("Hello");
        e1.eat();
    }
}

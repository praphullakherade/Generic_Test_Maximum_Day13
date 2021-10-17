package com.generictest;

public class TestMaximum {

    public static void main(String[] args) {
        System.out.println("Welcome Generics Maximum program");
        Integer[] a = { 5, 45, 4, 30, 40 };
        Float[] b = { 12.49f, 19.61f, 18.3f, 14.36f, 13.7f};
        String[] c = { "John", "Virat", "Rohit", "Sachin", "Prafull" };

        System.out.println(new Refactor<Integer>(a).findMaximum());
        System.out.println(new Refactor<Float>(b).findMaximum());
        System.out.println(new Refactor<String>(c).findMaximum());
    }
}

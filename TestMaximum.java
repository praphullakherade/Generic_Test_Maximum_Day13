package com.generictest;

public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome Generics Maximum program");
        Integer xInt = 15, yInt = 29, zInt = 3;
        Float xFloat = 6.2f, yFloat = 14.7f, zFloat = 17.6f;
        String xString = "Prafull", yString = "John", zString = "Buttler";

        new Refactor(xInt,yInt,zInt).findMaximum();
        new Refactor(xFloat,yFloat,zFloat).findMaximum();
        new Refactor(xString,yString,zString).findMaximum();
    }
}

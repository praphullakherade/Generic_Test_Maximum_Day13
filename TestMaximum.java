package com.generictest;

public class TestMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome Generics Maximum program");
        Integer xInt = 15, yInt = 29, zInt = 3;
        Float xFloat = 9.2f, yFloat = 14.7f, zFloat = 17.6f;
        String xString = "Prafull", yString = "John", zString = "Buttler";

        Refactor refactor = new Refactor<Integer>();

        System.out.println("Maximum Integer : "+ refactor.findMaximum(xInt,yInt,zInt));
        System.out.println("Maximum Float : "+ refactor.findMaximum(xFloat,yFloat,zFloat));
        System.out.println("Maximum String : "+ refactor.findMaximum(xString,yString,zString));
    }
}

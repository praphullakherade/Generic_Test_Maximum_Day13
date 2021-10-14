package com.generictest;

public class TestMaximum {
    public static Float findMaximum(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max)>0 && num2.compareTo(num3)>0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Test Maximum program");
        Float maxNum = TestMaximum.findMaximum(15.5f,9.5f,10.5f);
        System.out.print(maxNum);
    }
}

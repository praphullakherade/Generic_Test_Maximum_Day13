package com.generictest;

public class TestMaximum {

    public static String findMaximum(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max)>0 && str2.compareTo(str3)>0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Generics Test Maximum program");
        String xString = "Virat", yString = "John", zString = "Prafull";
        String getMax = TestMaximum.findMaximum(xString,yString,zString);
        System.out.print(getMax);
    }
}

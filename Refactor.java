package com.generictest;

public class Refactor<E extends Comparable> {

    E[] inputArray;
    public Refactor(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public E findMaximum() {
        return findMaximum(inputArray);
    }
    public static <E extends Comparable> E findMaximum(E[] inputArray) {
        E max = inputArray[0];
        for (E element : inputArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        printMax(max);
        return max;
    }
    public static <E> void printMax(E max){
        System.out.println("Maximum : "+max);
    }

}

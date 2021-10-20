package com.generictest;
public class Refactor <E extends Comparable<E>>{
    E a, b, c;

    public Refactor(E a, E b, E c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public E findMaximum(){
        return Refactor.findMaximum(a,b,c);
    }

    public static <E extends Comparable<E>>E findMaximum(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max)>0 && b.compareTo(c)>0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        printMax(max);
        return max;
    }

    public static <E> void printMax(E max){
        System.out.println("Maximum : "+max);
    }
}
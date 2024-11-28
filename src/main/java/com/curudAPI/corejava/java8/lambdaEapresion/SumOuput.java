package org.example.corejava.java8.lambdaEapresion;


import org.example.corejava.java8.functionalInterface.Sum;

public class SumOuput {
    public static void main(String[] args) {
        Sum sum=(a, b)->a+b;
        System.out.println(sum.sum(2,3));
    }
}

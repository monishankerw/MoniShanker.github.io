package org.example.corejava.java8.lambdaEapresion;


import org.example.corejava.java8.functionalInterface.A;

public class B {
    public static void main(String[] args) {
        A b=()->{
            System.out.println(122);
            System.out.println(111);

        };
b.test();
    }
}

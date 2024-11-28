package org.example.corejava.java8.lambdaEapresion;


import org.example.corejava.java8.functionalInterface.Test1;

public class TestOutput {
    public static void main(String[] args) {
        Test1 test1=(int x, int y)->{
            System.out.println(x);
            System.out.println(y);

        };
        test1.number(1,2);
    }
}

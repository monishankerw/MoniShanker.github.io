package org.example.corejava.exception;

public class A {
    public static void main(String[] args) {
        try{
            System.out.println(1);
            System.exit(5);
        } finally {
            System.out.println(2);
        }
        System.out.println(6);
    }
}

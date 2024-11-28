package org.example.corejava.exception.finallyBlock;
//we can write finally without catch block.
public class A {
    int i = 10;

    public static void main(String[] args) {
        try {
            // This line will throw a NumberFormatException
            Integer.parseInt("xyz");
        } finally {
            // This will always be executed
            System.out.println(1);
        }
        // This line will not be executed because the exception is not caught
        System.out.println(2);
    }
}


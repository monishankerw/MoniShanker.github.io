package org.example.corejava.exception.throwandThrows;

public class Test {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Custom message");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
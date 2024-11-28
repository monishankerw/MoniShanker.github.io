package org.example.corejava.exception.throwable;

public class Test {
    public static void main(String[] args) {
        try {
            throw new Exception("tttttt");

        } catch (Throwable e) {
            System.out.println("rr" + e.getMessage());
            e.getStackTrace();
        }
    }
}

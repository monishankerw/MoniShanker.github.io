package org.example.corejava.exception.termination;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.exit(0); // JVM will terminate here
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("This will not execute");
    }
}
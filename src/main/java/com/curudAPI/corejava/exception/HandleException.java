package org.example.corejava.exception;

public class HandleException {
    public static void main(String[] args) {
        try {
            int x = 10, y = 0, z;
            z = x / y; // This line will throw an ArithmeticException (division by zero)
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e);
        }
        System.out.println(1);
        System.out.println(2);
    }


}


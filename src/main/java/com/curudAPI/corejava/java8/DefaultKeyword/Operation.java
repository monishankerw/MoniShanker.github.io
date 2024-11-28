package org.example.corejava.java8.DefaultKeyword;

public class Operation {
    public static void main(String[] args) {
        // Lambda expression for the B interface's add method
        B b = (int x, int y) -> x + y;

        // Using the lambda expression and default methods
        System.out.println("Addition: " + b.add(12, 32));  // Calls the lambda function to add two numbers
        b.add(12, 32, 12);  // Calls the default method to add three numbers
        b.multiply(1, 2, 3);  // Calls the default method to multiply three numbers
    }
}

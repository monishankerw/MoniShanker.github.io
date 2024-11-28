package org.example.corejava.oops.constructor.privateConstructor;

//A private constructor cannot be used to initialize an object outside the class that it is defined within
//it is no longer visible to the external class.
public class Helper {
    private int data;

    // Default constructor
    public Helper() {
        data = 5;
    }

    // Copy constructor
    public Helper(Helper other) {
        this.data = other.data;
    }

    public static class Test {
        public static void main(String[] args) {
            Helper h1 = new Helper();       // Original instance
            Helper h2 = new Helper(h1);     // Copy using copy constructor
            System.out.println("Original data: " + h1.data);
            System.out.println("Copied data: " + h2.data);
        }
    }
}

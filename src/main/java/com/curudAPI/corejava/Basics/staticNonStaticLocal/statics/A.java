package org.example.corejava.Basics.staticNonStaticLocal.statics;

// can the static method be overload?
//Yes, static methods in Java can be overloaded just like instance methods.
//Method overloading occurs when multiple methods have the same name but differ in their parameter lists (number, type, or order of parameters).
    public class A {
    // Static method with one integer parameter
    public static void display(int num) {
        System.out.println("Integer: " + num);
    }

    // Overloaded static method with one double parameter
    public static void display(double num) {
        System.out.println("Double: " + num);
    }

    // Overloaded static method with one string parameter
    public static void display(String text) {
        System.out.println("String: " + text);
    }

    // Overloaded static method with two integer parameters
    public static void display(int num1, int num2) {
        System.out.println("Sum of integers: " + (num1 + num2));
    }

    public static void main(String[] args) {
        // Calling the overloaded static methods
        display(10);                  // Calls display(int num)
        display(10.5);                // Calls display(double num)
        display("Hello, World!");     // Calls display(String text)
        display(5, 10);               // Calls display(int num1, int num2)
    }
}

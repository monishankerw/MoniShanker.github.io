package org.example.corejava.exception.ExceptionTypes;

//when you access non-static member with null reference variable we get null pointer exception.
public class NullPointerExample {
    String x;

    public static void main(String[] args) {
        try {
            NullPointerExample a1 = null;
            System.out.println(a1.x); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(122);
    }
}


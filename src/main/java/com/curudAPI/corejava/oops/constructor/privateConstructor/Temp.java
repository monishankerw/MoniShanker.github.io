package org.example.corejava.oops.constructor.privateConstructor;
//When a constructor is marked as private, the only way to create a new object of that class from some external class is using a method that created a new object.
public class Temp {
    private Temp(int data) {
        System.out.println("Constructor called:");
    }

    protected static Temp create(int data) {
        Temp obj = new Temp(data);
        return obj;
    }

    public void myMethod() {
        System.out.println("Method called");
    }

    public static class Test {
        public static void main(String[] args) {
            Temp obj = Temp.create(20); // Corrected call to create an instance of Temp
            obj.myMethod();
        }
    }
}

package org.example.corejava.oops.Interface;

// Parent class
class Parent {
    public void display() {
        System.out.println("This is the Parent class.");
    }
}

// Child class extends Parent class
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("This is the Child class, extending Parent.");
    }
}

// Interface A
interface A1 {
    void methodA(); // Abstract method
}

// Interface B extends Interface A
interface B extends A1 {
    void methodB(); // Abstract method
}

// Class implements Interface B
class MyClass implements B {
    @Override
    public void methodA() {
        System.out.println("MethodA implementation from Interface A.");
    }

    @Override
    public void methodB() {
        System.out.println("MethodB implementation from Interface B.");
    }
}

// Class cannot directly inherit from an interface (not allowed)
class AnotherClass /* extends A */ { // This will throw a compilation error
    // Not possible: Classes do not extend interfaces directly.
}

public class RelationshipsDemo {
    public static void main(String[] args) {
        // Class to class: extends
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();

        // Interface to interface: extends
        MyClass myClass = new MyClass();
        myClass.methodA();
        myClass.methodB();
    }
}
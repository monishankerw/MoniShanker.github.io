         

   Single Level Inheritance
   -> Subclasses inherit the features of one superclass(parent class)
   -> class A serves as a base class for the derived class B.
   
  ```markdown
# Single-Level Inheritance in Java

## Overview
Single-level inheritance is a type of inheritance in Java where a subclass inherits the properties and methods of a single superclass (parent class). 
This allows the derived class to reuse the functionality of the parent class, extend it, or override it.

### Key Points:
- **Subclass**: The class that inherits from another class.
- **Superclass**: The class whose properties and methods are inherited by another class.
- In single-level inheritance, one class (subclass) extends another class (superclass).

## Example: Single-Level Inheritance

### Superclass: `A`
```java
public class A {
    public void display() {
        System.out.println("This is class A");
    }
}
```
- **Explanation**: Class `A` is a superclass that has a method `display()`.

### Subclass: `B`
```java
public class B extends A {
    public void show() {
        System.out.println("This is class B");
    }
}
```
- **Explanation**: Class `B` is a subclass that extends class `A`. It inherits the `display()` method from class `A` and also has its own method `show()`.

### Main Class: Demonstrating Single-Level Inheritance
```java
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // Calling superclass method
        obj.show();    // Calling subclass method
    }
}
```
- **Explanation**: In the `Main` class, an object of class `B` is created. The object can call both the inherited method `display()` from class `A` and the `show()` method from class `B`.

### Output:
```
This is class A
This is class B
```

## Summary
- In single-level inheritance, a subclass inherits the features of one superclass.
- Class `A` serves as a base class for the derived class `B`.
- The subclass can access the methods of the superclass as well as define its own additional methods.

This simple form of inheritance is the foundation of more complex inheritance structures in Java, like multi-level inheritance.
```


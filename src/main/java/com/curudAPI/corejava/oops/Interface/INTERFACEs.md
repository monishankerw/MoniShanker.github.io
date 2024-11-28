
# Interface in Java

## Overview
- Interfaces in Java are 100% abstract, meaning they cannot have method implementations.
- All variables in an interface are `static` and `final` by default.
- An interface consists solely of abstract methods (methods without a body).
- Java interfaces are a mechanism to achieve abstraction and multiple inheritance.
- An interface in Java cannot have concrete methods (methods with a body).
- Interfaces also represent the IS-A relationship in Java.

### Example: Comparator Interface
```java
public interface Comparator<T> {
    int compare(T o1, T o2);
}
```

## Relationships Involving Interfaces

- **class** --`extends`--> **class**
- **interface** --`implements`--> **class**
- **interface** --`extends`--> **interface**
- **class** --`not allowed`--> **interface**

## Why Use an Interface?
- **Total Abstraction**: Interfaces are used to achieve total abstraction. They ensure that the implementing classes provide their own behavior for all methods declared in the interface.

- **Multiple Inheritance**: Although Java does not support multiple inheritance for classes, it allows multiple inheritance for interfaces. This means a class can implement multiple interfaces.

- **Loose Coupling**: Interfaces are used to achieve loose coupling between components. By programming to an interface, you ensure that the code remains flexible and modular.

- **Abstraction Implementation**: Interfaces are a key tool to implement abstraction, allowing you to define methods that must be implemented by any class that implements the interface.

## Declaring and Implementing an Interface

### Declaring an Interface
To declare an interface, use the `interface` keyword. All methods declared in an interface are abstract and public by default, and all fields are public, static, and final.

```java
public interface Vehicle {
    void start();
    void stop();
}
```

### Implementing an Interface
A class that implements an interface must provide concrete implementations for all the methods declared in the interface. To implement an interface, use the `implements` keyword.

```java
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}
```

## Key Points
- An interface is a fully abstract class in Java.
- A class can implement multiple interfaces, enabling multiple inheritance.
- Interfaces help in designing systems that are more modular and maintainable by defining contracts for classes to follow.

By understanding and utilizing interfaces, you can write flexible, extensible, and maintainable Java applications.
```


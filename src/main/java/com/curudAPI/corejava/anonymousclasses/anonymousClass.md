 -> A nested class that does not have any name is known as an anonymous class.
 -> An anonymous class must be define inside another class is called anonymous inner class.
 Types
 1. A superclass that an anonymous class extends
2.  an interface that an anonymous class implements.



### 1. Anonymous Class Extending a Superclass

```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Anonymous class extending the Animal class
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dog barks");
            }
        };
        
        dog.sound(); // Output: Dog barks
    }
}
```
In this example:
- The `Animal` class is the superclass.
- The anonymous class overrides the `sound()` method to provide a specific behavior for a dog.

### 2. Anonymous Class Implementing an Interface

```java
interface Vehicle {
    void move();
}

public class AnonymousInterfaceExample {
    public static void main(String[] args) {
        // Anonymous class implementing the Vehicle interface
        Vehicle car = new Vehicle() {
            @Override
            public void move() {
                System.out.println("Car is moving");
            }
        };
        
        car.move(); // Output: Car is moving
    }
}
```

In this example:
- The `Vehicle` interface is implemented using an anonymous class.
- The `move()` method is defined within the anonymous class, which provides the implementation for the `Vehicle` interface.

### Summary:
- **Anonymous Class Extending Superclass**: You can override methods from the superclass.
- **Anonymous Class Implementing Interface**: You can provide implementations for all abstract methods of the interface.


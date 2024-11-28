class
1. class helps us to generate object.
2. class will generate object whenever we make a request to class using new keyword.


Here's a refined explanation of your points:

### 1. **Class Helps Us to Generate Objects**
- A **class** is a blueprint or template that defines the properties (fields/attributes) and behaviors (methods) that its objects will have.
- When you define a class, you are essentially describing how the objects created from it should behave and what attributes they will hold.

Example:
```java
class Car {
    String model;
    int year;

    // Constructor to initialize the object
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
```

Here, the `Car` class defines the structure (fields `model` and `year`) and behavior (`display()` method) for `Car` objects.

### 2. **Class Will Generate Objects When Requested Using the `new` Keyword**
- To create an instance (object) of a class, you use the `new` keyword, which allocates memory for the object and invokes the constructor to initialize it.
- The `new` keyword makes a request to the class to generate an object, as described in the class blueprint.

Example:
```java
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2022); // Creates a new object of class Car
        car.display();
    }
}
```
Here, the `new Car("Tesla", 2022)` creates an object of the `Car` class. The `new` keyword invokes the constructor and assigns memory to the object, which can then be used to access its fields and methods.
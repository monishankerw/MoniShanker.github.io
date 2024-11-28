
```markdown
# Java Abstraction 

## 1. What is Abstraction in Java?

**Abstraction** is the concept of hiding implementation details and showing only the essential features of an object. This allows the user to interact with an object without needing to know its internal workings.

### Achieving Abstraction:
- **Interfaces**: Can achieve 100% abstraction.
- **Abstract Classes**: Can achieve 0% to 100% abstraction.

## 2. The `abstract` Keyword

The `abstract` keyword is used to define incomplete methods (without a body) and incomplete classes (that cannot be instantiated).

### Example:

```java
public interface A {
    public abstract void test();
    public void example();  // implicitly abstract
}
```

- A method without a body is called an **abstract method**.
- Abstract methods are declared using the `abstract` keyword and must be implemented by subclasses.

## 3. Abstract Class

An **abstract class** is a class that cannot be instantiated directly. It can contain abstract methods (which must be implemented by subclasses) and non-abstract methods.

### Key Points:
- An abstract class can be **0% to 100% incomplete**.
- It can have constructors, static methods, and non-static methods.
- Abstract classes **do not support multiple inheritance**.
- You **cannot create an object** of an abstract class.

### Example:

```java
public abstract class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void makeSound();

    // Non-abstract method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
```

- **Abstract Class Constructor**: Abstract classes can have constructors, including parameterized ones. If you don't define your own, the compiler provides a default constructor.

## 4. Interface vs. Abstract Class

| Feature                  | Interface                              | Abstract Class                       |
|--------------------------|----------------------------------------|--------------------------------------|
| Abstraction Level        | 100% abstract                          | 0% to 100% abstract                  |
| Multiple Inheritance     | Supported                              | Not supported                        |
| Variable Types           | All variables are `static` and `final` | Can have static and non-static variables |
| Method Implementation    | No method body                         | Can have both abstract and concrete methods |
| Object Creation          | Cannot create objects                  | Cannot create objects                |

## 5. Abstraction vs. Encapsulation

### Abstraction:
- **Concept**: Hiding the implementation details while showing only the necessary functionality.
- **Achieved by**: Using interfaces and abstract classes.
- **Completion Level**: Can be 0% to 100% incomplete.
- **Multiple Inheritance**: Not supported.

### Encapsulation:
- **Concept**: Wrapping data and methods that operate on that data within a single unit (class).
- **Achieved by**: Using private variables and providing public getter and setter methods.
- **Focus**: Data hiding by restricting direct access to the data.

### Example of Encapsulation:

```java
public class Employee {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
```

In this example, the `name` and `age` variables are encapsulated within the `Employee` class. Access to these variables is controlled through the getter and setter methods.

## Summary

- **Abstraction** focuses on hiding the complexity of a system by exposing only what is necessary.
- **Encapsulation** focuses on bundling data with the methods that operate on it, restricting unauthorized access.

Here are some multiple-choice questions (MCQs) based on the provided content:

MCQ on Abstraction

1. What is abstraction in Java?
   A. Encapsulation of data
   B. Hiding implementation details and showing only functionality
   C. Making all methods private
   D. Making all variables public

Answer:
B. Hiding implementation details and showing only functionality

2. Which of the following can achieve 100% abstraction?
   A. Abstract class
   B. Concrete class
   C. Interface
   D. Static class

Answer:
C. Interface

3. Can an abstract class have a constructor in Java?
   A. Yes
   B. No

Answer:
A. Yes

4. What keyword is used to declare an abstract method in Java?
   A. abstract
   B. final
   C. static
   D. private

Answer:
A. abstract

5. What happens if a subclass does not implement all abstract methods of its superclass?
   A. Compilation error
   B. Runtime error
   C. No error; it works fine
   D. Abstract methods are automatically implemented

Answer:
A. Compilation error

MCQ on Encapsulation

6. What does encapsulation achieve?
   A. Hiding data from unauthorized access
   B. Exposing all variables to subclasses
   C. Removing all methods from the class
   D. None of the above

Answer:
A. Hiding data from unauthorized access

7. In encapsulation, how is access to private variables typically provided?
   A. By using static methods
   B. Through public getter and setter methods
   C. By declaring all methods as final
   D. By inheriting the variables

Answer:
B. Through public getter and setter methods

MCQ on Abstract Class vs Interface

8. Which of the following is TRUE about an interface in Java?
   A. It can have both static and non-static variables.
   B. All methods in an interface are abstract by default.
   C. An interface can be instantiated.
   D. An interface does not support multiple inheritance.

Answer:
B. All methods in an interface are abstract by default.

9. Which of the following is FALSE about abstract classes in Java?
   A. They can have concrete methods.
   B. They support multiple inheritance.
   C. They cannot be instantiated.
   D. They can have constructors.

Answer:
B. They support multiple inheritance.

10. What is the primary difference between abstraction and encapsulation?
    A. Abstraction focuses on hiding data, while encapsulation hides the implementation.
    B. Abstraction is achieved using access modifiers, while encapsulation uses interfaces.
    C. Abstraction hides implementation, while encapsulation hides data.
    D. Both achieve the same goal in Java.

Answer:
C. Abstraction hides implementation, while encapsulation hides data.

```


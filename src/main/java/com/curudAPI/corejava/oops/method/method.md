In Java, a **method** is a block of code that performs a specific task and is part of a class. Methods allow for code reusability and organization by encapsulating functionality. Methods can take parameters and return values, and they are invoked by calling them from another part of the program.

### Syntax of a method:
```java
returnType methodName(parameters) {
    // method body
}
```

### Example:
```java
public class Example {

    // A method that returns the sum of two integers
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example example = new Example();
        
        // Calling the addNumbers method
        int result = example.addNumbers(5, 10);
        System.out.println("The sum is: " + result);
    }
}
```

### Key components:
- **Return type**: Specifies the type of data the method will return. If the method doesn't return anything, use `void`.
- **Method name**: The name of the method, which is used to call it.
- **Parameters**: Input values that are passed to the method (optional).
- **Method body**: The block of code that defines what the method does.

### Types of Methods:
1. **Instance Methods**: Methods that belong to an instance of a class. They require an object of the class to be invoked.

2. **Static Methods**: Methods that belong to the class itself rather than an instance. They can be called without creating an object.
   ```java
   public static void myStaticMethod() {
       // code
   }
   ```

3. **Abstract Methods**: Declared without an implementation in an abstract class, to be implemented by subclasses.
   ```java
   abstract class Animal {
       abstract void sound();
   }
   ```

4. **Final Methods**: Cannot be overridden by subclasses.
   ```java
   public final void show() {
       // code
   }
   ```
Here's a complete Java program demonstrating different types of methods:

```java
// Class Example with instance methods, static methods, and final methods
public class Example {

    // Instance method: adds two numbers
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Static method: prints a message, can be called without an instance
    public static void printMessage() {
        System.out.println("This is a static method.");
    }

    // Final method: cannot be overridden by subclasses
    public final void showFinalMessage() {
        System.out.println("This is a final method.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object to call the instance method
        Example example = new Example();
        
        // Calling the instance method
        int result = example.addNumbers(5, 10);
        System.out.println("The sum is: " + result);
        
        // Calling the static method directly
        Example.printMessage();

        // Calling the final method
        example.showFinalMessage();
    }
}
```

### Output:
```
The sum is: 15
This is a static method.
This is a final method.
```

### Explanation:
1. **Instance Method** `addNumbers`: This requires creating an instance of the `Example` class to call it.
2. **Static Method** `printMessage`: This can be called directly using the class name without creating an instance.
3. **Final Method** `showFinalMessage`: Demonstrates a final method that can't be overridden in subclasses.

This example showcases multiple method types within a class, along with how to invoke them.

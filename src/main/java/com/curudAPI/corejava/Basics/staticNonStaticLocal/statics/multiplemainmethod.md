Q. What happens if there are multiple main methods inside one class in java?

In Java, you can have multiple methods named `main` within a single class as long as they have different parameter lists (method overloading). 
However, only the `main` method with the exact signature `public static void main(String[] args)` will serve as the entry point when the program is run.

Here’s what happens in different cases:

### Case 1: Multiple Overloaded `main` Methods
You can overload the `main` method, but only the `main(String[] args)` method will be invoked by the Java Virtual Machine (JVM) when the program starts.

```java
public class MultipleMainMethods {

    // Standard main method that JVM looks for as entry point
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(42);  // Calling overloaded main method
        main("Overloaded main method");
    }

    // Overloaded main method with an int parameter
    public static void main(int number) {
        System.out.println("Main method with int argument: " + number);
    }

    // Overloaded main method with a String parameter
    public static void main(String message) {
        System.out.println("Main method with String argument: " + message);
    }
}
```

### Output
When you run this program, the JVM starts by executing the `main(String[] args)` method:

```plaintext
Main method with String[] args
Main method with int argument: 42
Main method with String argument: Overloaded main method
```

### Explanation
1. **JVM Entry Point**: Only `public static void main(String[] args)` is recognized by the JVM as the starting point.
2. **Calling Overloaded Methods**: The `main(String[] args)` method can call other overloaded `main` methods as needed, just like any other method. However, these overloaded `main` methods won't be called by the JVM unless invoked explicitly.

### Case 2: Removing `main(String[] args)`
If there is no `public static void main(String[] args)` method, the JVM will throw an error, as it won’t find the required entry point.

```plaintext
Error: Main method not found in class MultipleMainMethods, please define the main method as:
   public static void main(String[] args)
```

### Summary
- **Only one entry point**: The JVM recognizes only `public static void main(String[] args)` as the starting point.
- **Overloading is allowed**: You can define other `main` methods with different parameters, but they won’t be used as the entry point. Instead, they act like any other overloaded method, available to be called within the code.
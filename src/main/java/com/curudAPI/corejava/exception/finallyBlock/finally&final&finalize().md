Here’s a clear explanation of the concepts and sample Java code related to `finally`, `final`, and `finalize()`:

### 1. `finally` Block Execution
The `finally` block is generally executed after the try-catch block regardless of whether an exception occurred or not. However, it will **not** execute in certain cases, like:
- A call to `System.exit()`.
- JVM crashes.
- The program is killed.
- Power failure or forced shutdown.

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            // Uncomment the line below to test with System.exit(0)
            // System.exit(0);
            int result = 10 / 0;  // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block is always executed unless the JVM terminates abnormally.");
        }
    }
}
```

### 2. Difference Between `final`, `finally`, and `finalize()`

#### a. `final`
- A **`final` variable** can't be changed once initialized.
- A **`final` method** cannot be overridden by subclasses.
- A **`final` class** cannot be subclassed or inherited.

Example:
```java
final class FinalClass {
    final int value = 42;

    // A final method cannot be overridden
    final void displayValue() {
        System.out.println("Final value: " + value);
    }
}

public class FinalExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.displayValue();
        // obj.value = 50;  // This will give an error as final variables can't be changed
    }
}
```

#### b. `finally`
A **`finally` block** is used to execute important code such as closing files or releasing resources, even if an exception occurs.

Example:
```java
public class FinallyExample2 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Caught an exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
```

#### c. `finalize()`
The **`finalize()` method** is called by the garbage collector before an object is destroyed. It is used to perform cleanup actions before an object is collected by the garbage collector.

Example:
```java
public class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null;  // Dereference the object so it becomes eligible for GC
        
        // Suggest garbage collection
        System.gc();

        System.out.println("End of the program");
    }
}
```

### Summary of Key Differences:
| **Feature**  | **final**                    | **finally**                   | **finalize()**                           |
|--------------|------------------------------|-------------------------------|------------------------------------------|
| **Definition**| Keyword for constants, methods, and classes. | Block for cleanup code in exception handling. | Method used for object cleanup before garbage collection. |
| **Purpose**  | Prevents modification, inheritance, and overriding. | Always executed after try-catch (unless abnormal termination). | Called by JVM before garbage collection to free resources. |

These examples demonstrate the key differences between `final`, `finally`, and `finalize()`.

```markdown
# Throwable Class in Java

The `Throwable` class in Java is the superclass of all errors and exceptions. It serves as the root class for both exceptions that can be caught and handled by the program and errors that are often beyond the program’s control.

1. Throwable class is the build in base class used to handle all the exception in Java.
2. Throwable class is the super class of all errors and exceptions in java language.
3. The class at the top of exception class hierarchy is Throwable.
4. Should be assignable to throwable type.
## Subclasses of Throwable

`Throwable` has two direct subclasses:

1. **Error**: Represents serious problems that a reasonable application should not try to catch. Examples include `OutOfMemoryError`, `StackOverflowError`. These are conditions that generally cannot be handled and often signal that the application cannot continue running.

2. **Exception**: Represents conditions that a reasonable application might want to catch and recover from. Examples include `IOException`, `NullPointerException`, etc. Exceptions can be further categorized into:
   - Checked exceptions: Exceptions that the compiler forces you to handle (e.g., `IOException`).
   - Unchecked exceptions: Runtime exceptions that don’t need explicit handling (e.g., `NullPointerException`).

## Key Methods of Throwable

The `Throwable` class provides several important methods to work with exceptions and errors:

- **getMessage()**:  
  Returns a detailed message about the cause of the throwable.

- **printStackTrace()**:  
  Prints the stack trace of the throwable, which shows the chain of method calls that led to the exception. Useful for debugging.

- **getCause()**:  
  Returns the cause of the throwable, which is another throwable that caused the current one. It helps in tracking the chain of exceptions.

## Example Code

Below is an example of using the `Throwable` class to catch an exception and retrieve information from it:

```java
public class Test {
    public static void main(String[] args) {
        try {
            throw new Exception("Custom exception message");
        } catch (Throwable t) {  // Catching using Throwable
            System.out.println("Caught Throwable: " + t.getMessage());
            t.printStackTrace();
        }
    }
}
```

### Output:

```
Caught Throwable: Custom exception message
java.lang.Exception: Custom exception message
    at Test.main(Test.java:4)
```

In this example:
- An exception is thrown with a custom message (`"Custom exception message"`).
- The `Throwable` class is used to catch the exception.
- The `getMessage()` method retrieves the message of the exception.
- The `printStackTrace()` method provides the stack trace, which helps in debugging by showing where the exception was thrown.

## Conclusion

The `Throwable` class serves as the backbone for error and exception handling in Java. Its subclasses, `Error` and `Exception`, allow you to differentiate between serious problems and recoverable issues in your code. The methods provided by `Throwable`, such as `getMessage()`, `printStackTrace()`, and `getCause()`, are essential for diagnosing and handling errors and exceptions.
```


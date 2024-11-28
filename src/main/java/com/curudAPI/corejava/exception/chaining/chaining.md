### Exception Chaining in Java

**Exception Chaining** is a technique in Java where one exception is caused by another exception. This helps in debugging by showing the root cause of the error, especially when multiple layers of methods are involved.

When an exception is thrown as a result of another exception, Java allows us to chain the exceptions together using the `Throwable.initCause()` or through constructors that accept a **cause** parameter.

### Key Concepts:
- **Primary Exception**: The main exception that occurred.
- **Cause Exception**: The underlying exception that caused the primary exception.

#### Why Use Exception Chaining?
1. To propagate a more specific exception that provides higher-level context while preserving the original exception's cause.
2. To help developers trace the sequence of events leading to the exception by showing a complete chain of causes.

### Example of Exception Chaining

#### Without Exception Chaining
```java
public class ExceptionChainingWithout {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Exception in method1");
        }
    }

    static void method2() throws Exception {
        throw new Exception("Exception in method2");
    }
}
```
In this case, the exception in `method1` hides the actual cause (which originated in `method2`), making debugging difficult. The output doesn't reflect the real cause of the error.

#### With Exception Chaining
We can use exception chaining to keep track of the original exception and the subsequent exceptions caused by it.

```java
public class ExceptionChainingWith {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Exception in method1", e);  // Chaining the exception
        }
    }

    static void method2() throws Exception {
        throw new Exception("Exception in method2");  // Root cause
    }
}
```

### Output:
```java
java.lang.Exception: Exception in method1
    at ExceptionChainingWith.method1(ExceptionChainingWith.java:12)
    at ExceptionChainingWith.main(ExceptionChainingWith.java:6)
Caused by: java.lang.Exception: Exception in method2
    at ExceptionChainingWith.method2(ExceptionChainingWith.java:16)
    at ExceptionChainingWith.method1(ExceptionChainingWith.java:10)
    ... 1 more
```

#### How to Chain Exceptions:
1. **Using Constructor**:
    - Most exceptions in Java provide constructors that accept a **cause** (another `Throwable` object).
   ```java
   public Exception(String message, Throwable cause)
   ```
   This constructor allows chaining of the current exception with the cause.

2. **Using `initCause()` method**:
    - Another way to set the cause of an exception is using the `initCause()` method.
   ```java
   Exception e = new Exception("Exception in method1");
   e.initCause(new Exception("Root cause"));
   throw e;
   ```

### Exception Chaining with Custom Exceptions

You can also chain exceptions in custom exception classes.

```java
class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChainingCustom {
    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    static void method1() throws CustomException {
        try {
            method2();
        } catch (Exception e) {
            throw new CustomException("CustomException in method1", e);
        }
    }

    static void method2() throws Exception {
        throw new Exception("Exception in method2");
    }
}
```

### Summary
- **Exception chaining** in Java allows you to preserve the original exception (the "cause") when throwing a new exception, making debugging easier.
- It is commonly used in multi-layered applications where a higher-level exception provides more context but needs to retain the underlying cause.

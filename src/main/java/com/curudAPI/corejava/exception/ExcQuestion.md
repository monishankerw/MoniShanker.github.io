Here are some common **exception-related interview questions** for candidates with 3 years of experience in Java:

### 1. **What is an exception in Java?**
- Explain what an exception is and how Java handles errors using the exception mechanism.
- **Answer:** An exception is an event that disrupts the normal flow of a program. It can occur during runtime and can be handled using try-catch blocks to avoid program termination.

### 2. **What is the difference between `Exception` and `Error` in Java?**
- Describe the distinction between exceptions and errors.
- **Answer:** `Exception` is related to conditions that a program can recover from, like invalid user input. `Error` represents serious problems that are not expected to be caught by the application, such as memory overflow.

### 3. **What is the difference between `checked` and `unchecked` exceptions?**
- Compare these two types of exceptions and provide examples.
- **Answer:** Checked exceptions are checked at compile time (e.g., `IOException`, `SQLException`), whereas unchecked exceptions are not checked at compile time and typically derive from `RuntimeException` (e.g., `NullPointerException`, `ArrayIndexOutOfBoundsException`).

### 4. **Can you explain the hierarchy of exceptions in Java?**
- Discuss the structure and classes in the exception hierarchy.
- **Answer:** The `Throwable` class is the parent of all error and exception classes. It has two subclasses: `Error` and `Exception`. `Exception` has two further subclasses: `RuntimeException` (unchecked exceptions) and other exceptions (checked).

### 5. **How does a `try-catch-finally` block work?**
- Explain how exception handling is performed with this block.
- **Answer:** The `try` block contains the code that might throw an exception. The `catch` block catches and handles the exception. The `finally` block executes regardless of whether an exception occurred, often used for resource cleanup.

### 6. **What happens if an exception is not caught in a program?**
- Discuss the consequences of unhandled exceptions.
- **Answer:** If an exception is not caught, the program will terminate, and the JVM will handle the exception by printing a stack trace.

### 7. **What is the `throw` keyword used for?**
- Explain when and why you would use `throw`.
- **Answer:** The `throw` keyword is used to explicitly throw an exception. It can be used to throw both checked and unchecked exceptions from a method or a block of code.

### 8. **What is the `throws` keyword used for?**
- Discuss the purpose of `throws` in method signatures.
- **Answer:** The `throws` keyword is used in a method declaration to indicate that the method might throw exceptions that need to be handled by the calling method.

### 9. **What are some best practices for exception handling in Java?**
- Discuss how to write clean and efficient exception-handling code.
- **Answer:**
    - Catch specific exceptions instead of using a generic `Exception` class.
    - Use `finally` for resource cleanup.
    - Avoid using exceptions for control flow.
    - Always log exceptions with meaningful messages.

### 10. **What is a custom exception? How do you create one?**
- Explain the concept of custom exceptions and how to create them.
- **Answer:** A custom exception is a user-defined exception class that extends `Exception` or `RuntimeException`. You create one by extending these classes and providing constructors.

   ```java
   public class MyCustomException extends Exception {
       public MyCustomException(String message) {
           super(message);
       }
   }
   ```

### 11. **What is exception chaining in Java?**
- Discuss how one exception can cause another exception and how to link them.
- **Answer:** Exception chaining allows you to associate an exception (cause) with another exception. This is done using the constructor of `Throwable` or `Exception` that accepts a cause.
   ```java
   public Exception(String message, Throwable cause) {
       super(message, cause);
   }
   ```

### 12. **What is `finally` used for? Can a `finally` block be skipped?**
- Explain the purpose of the `finally` block and whether it can be skipped.
- **Answer:** The `finally` block is used for resource cleanup, like closing files or database connections. It is executed whether an exception occurs or not, except in cases where the JVM exits (e.g., `System.exit()`).

### 13. **What is `try-with-resources` in Java?**
- Explain the concept and benefits of the `try-with-resources` statement.
- **Answer:** Introduced in Java 7, `try-with-resources` is a try statement that automatically closes resources such as files, network connections, etc., that implement the `AutoCloseable` interface. It ensures that resources are closed even if an exception is thrown.
   ```java
   try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
       // Code
   }
   ```

### 14. **What is the difference between `final`, `finally`, and `finalize`?**
- Explain the differences between these three keywords.
- **Answer:**
    - `final`: Used to define constants, prevent inheritance, or prevent method overriding.
    - `finally`: Used in exception handling to execute code after a try-catch block.
    - `finalize`: A method used by the garbage collector before an object is removed from memory (deprecated in recent Java versions).

### 15. **Can we have multiple `catch` blocks for a single `try` block?**
- Discuss if multiple `catch` blocks can be used and why.
- **Answer:** Yes, multiple `catch` blocks can be used to handle different types of exceptions thrown by the `try` block. Java 7 introduced multi-catch blocks, allowing you to catch multiple exceptions in a single `catch` block using a pipe (`|`).

### 16. **What happens if an exception is thrown in the `finally` block?**
- Explain the behavior if an exception occurs in the `finally` block.
- **Answer:** If an exception is thrown in the `finally` block, it will override any exception thrown in the `try` or `catch` block. The new exception will be propagated.

### 17. **What is `OutOfMemoryError` in Java?**
- Describe this error and when it occurs.
- **Answer:** `OutOfMemoryError` is thrown when the JVM runs out of memory and cannot allocate more space for objects. It typically occurs in memory-intensive applications or due to memory leaks.

### 18. **Can you explain `NullPointerException` and how to avoid it?**
- Discuss what causes a `NullPointerException` and how to handle it.
- **Answer:** `NullPointerException` occurs when you attempt to use an object reference that points to `null`. To avoid it, check if objects are `null` before calling methods on them, or use Optional (introduced in Java 8) to handle possible null values.

---

Here are the **top 50 exception-related interview questions** in Java:

1. What is an exception in Java?
2. What is the difference between `Exception` and `Error`?
3. What are checked and unchecked exceptions?
4. Can you explain the exception hierarchy in Java?
5. What are some examples of checked exceptions in Java?
6. What are some examples of unchecked exceptions in Java?
7. How does the `try-catch-finally` block work in Java?
8. What is the `throw` keyword used for?
9. What is the `throws` keyword used for in a method signature?
10. What happens if an exception is not caught in Java?
11. Can you have multiple `catch` blocks for a single `try` block?
12. Can a `try` block be used without a `catch` block?
13. What is the purpose of the `finally` block?
14. Can a `finally` block be skipped?
15. What is `try-with-resources` and how is it used in Java?
16. What is a custom exception and how do you create one?
17. What is exception chaining in Java?
18. What is the difference between `final`, `finally`, and `finalize`?
19. What happens if an exception is thrown in the `finally` block?
20. Can you explain `NullPointerException` and how to avoid it?
21. What is `OutOfMemoryError` in Java and when does it occur?
22. What is the difference between `RuntimeException` and `Exception`?
23. What is the difference between `throw` and `throws`?
24. Can you catch `Error` in Java?
25. What are best practices for exception handling in Java?
26. What are the disadvantages of using exceptions for control flow?
27. How do you log exceptions in Java?
28. What is the `StackTrace` in Java?
29. Can you rethrow an exception in Java?
30. Can we use multiple exceptions in a single `catch` block?
31. Can a method declare multiple exceptions in the `throws` clause?
32. Can you catch exceptions of multiple types in Java?
33. What is the difference between `Throwable`, `Exception`, and `RuntimeException`?
34. Can you explain the difference between `catch` and `catch(Exception e)`?
35. How do you create and use a `catch` block for multiple exceptions in Java?
36. Can you explain how exception handling works with inheritance?
37. What is the `getMessage()` method in exceptions used for?
38. What is the `getCause()` method in exceptions?
39. Can a constructor throw an exception?
40. How do you create a custom runtime exception in Java?
41. How does the JVM handle uncaught exceptions?
42. Can exceptions be used for debugging?
43. Can we throw an exception from a static block?
44. How does the `Throwable` class work?
45. Can we throw an exception from a constructor?
46. What happens if `System.exit()` is called in a `try` block?
47. What is the difference between a `checked` and a `runtime` exception?
48. How are exceptions propagated in Java?
49. What is the purpose of the `assert` statement in Java?
50. Can we create exceptions with custom error messages?

For **coding questions**, focus on scenarios such as custom exceptions, `try-with-resources`, multiple `catch` blocks, exception chaining, and practical use cases of exception handling in real-world applications.
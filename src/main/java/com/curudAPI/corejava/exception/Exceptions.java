package org.example.corejava.exception;

public class Exceptions {
    /*
        1. What is an exception in Java?
        invalid user input given in program it will be hold the program execution abruptly is called exception
        check(Compile Time) and unchecked Exception(Run time)

     */
    private String x;

    public static void main(String[] args) {
        int x = 1, y = 0, z;
        z = x / y;
        System.out.println(z);
    }

    /*
    2. What is the difference between Exception and Error?
    Exception:
    a. invalid user input given program it will be hold the program execution abruptly
    b. Exception can be recovered
    c. check(Compile Time) and unchecked Exception(Run time)
    d. In case of checked Exception compiler will have knowledge of check exception and force to keep try and catch exception.

    Error:
    a. Error can not be recovered.
    b. Error not such classified, error always checked exception.
    OutOfMemoryError, StackOverflowError.
    c.In case Error compiler would not have knowledge of error.
     */

    /*
   3. How does the Throwable class work?
   The `Throwable` class in Java is the superclass of all errors and exceptions.
   It serves as the root class for both exceptions that can be caught and handled by the program and errors that are often beyond the program’s control.

1. Throwable class is the build in base class used to handle all the exception in Java.
2. Throwable class is the super class of all errors and exceptions in java language.
3. The class at the top of exception class hierarchy is Throwable.
4. Should be assignable to throwable type.


   4.  What is the difference between Throwable, Exception, and RuntimeException?

5.What is the getMessage() method in exceptions used for?
getMessage(): Returns a detailed message about the exception or error.

6. What is the getCause() method in exceptions?
getCause(): Retrieves the underlying cause of the Throwable, if any.
     */
    public static class Throwables {
        public static void main(String[] args) {
            try {
                throw new java.lang.Exception("eee");
            } catch (Throwable throwable) {
                System.out.println("Throwable::" + throwable.getMessage());
            }
        }
    }

    /*
   7.  What are checked and unchecked exceptions?
    1. Checked (Compile Time Exception):When u run .java file compile to .class file is called exception.
    IOException,SQL Exception,Class Cast Exception
    2. Unchecked Exception:When you Run .class file
    Arithmetic Exception,Null Pointer Exception, Number Format Exception,ArrayOutOf Bound Exception

    8. Can you explain the exception hierarchy in Java?
                          Throwable
                          |
         -----------------------------------
         |                                 |
     Exception                           Error
         |                                 |
 ---------------------------       ------------------------
 |                         |       |                      |
Compile Time Exception        RuntimeException  StackOverflowError  OutOfMemoryError
     |                      |
FileNotFoundException   NullPointerException
SQLException            ArrayIndexOutOfBoundsException
IOException             Arithmetic Exception
Class Cast Exception    Number Format Exception,ArrayOutOf Bound Exception
     */



    /*


  9.What are some examples of checked exceptions in Java?

1. **IOException**
   Thrown when there is an input/output failure, such as when reading from a file or network resource.

   try {
       FileReader file = new FileReader("example.txt");
   } catch (IOException e) {
       e.printStackTrace();
   }

2. **SQLException**
   Thrown when there is a database access error or other issues related to SQL operations.
   ```java
   try {
       Connection conn = DriverManager.getConnection(url, user, password);
   } catch (SQLException e) {
       e.printStackTrace();
   }

3. **ClassNotFoundException**
   Thrown when an application tries to load a class through its name but the class cannot be found.
   ```java
   try {
       Class.forName("com.example.MyClass");
   } catch (ClassNotFoundException e) {
       e.printStackTrace();
   }

4. **FileNotFoundException**
   A subclass of `IOException`, thrown when a file with the specified pathname does not exist.
   ```java
   try {
       FileInputStream file = new FileInputStream("notfound.txt");
   } catch (FileNotFoundException e) {
       e.printStackTrace();
   }

5. **InterruptedException**
   Thrown when a thread is interrupted while it's waiting, sleeping, or performing another blocking operation.
   ```java
   try {
       Thread.sleep(1000);
   } catch (InterruptedException e) {
       e.printStackTrace();
   }

6. **NoSuchMethodException**
   Thrown when a particular method cannot be found in a class.
   ```java
   try {
       Method method = MyClass.class.getMethod("nonExistentMethod");
   } catch (NoSuchMethodException e) {
       e.printStackTrace();
   }
   */

    //10. What are some examples of unchecked exceptions in Java?
    public static class ArthmiticssExp {
        //number divided by zero
        public static void main(String[] args) {


            try {
                System.out.println(1);
                int x = 1, y = 0, z;
                z = x / y;
                System.out.println(z);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            System.out.println(2);

        }
    }

    public static class NullPointerexp {
        //when you access non-static member with null reference variable
        private String x;

        public static void main(String[] args) {


            try {
                Exceptions e1 = null;
                int x = Integer.parseInt("abl");
                System.out.println(e1.x);

            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public static class NumberFormatExp {
        //When an invalid string to number conversion is done we get number format in the exception.
        public static void main(String[] args) {
            try {
                String x = "aa";
                int s = Integer.parseInt("qqq");
                System.out.println(s);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println("wwwww");
        }


    }
    /*
    Q11. Can exceptions be used for debugging?
    Yes, exceptions can be used for debugging purposes.
    When an exception is thrown, it provides useful information in the form of a stack trace,
    which helps in identifying where the error occurred.
    This can be helpful during development and debugging to trace the exact point of failure in the code.


*/

    public static class Test {
        public static void main(String[] args) {
            try {
                int[] arr = new int[3];
                arr[5] = 10;  // This will cause ArrayIndexOutOfBoundsException
            } catch (java.lang.Exception e) {
                e.printStackTrace();  // Prints stack trace for debugging
            }
        }
    }

    /*
    Q12. Can we throw an exception from a constructor?
     Yes, we can throw an exception from a constructor.
      When an exception is thrown from a constructor, object creation fails, and control passes to the calling code.
     */

    public static class Constructorss {
        public Constructorss() throws java.lang.Exception {
            System.out.println("Inside Constructor:");
            throw new java.lang.Exception("Exception in Constructor::");
        }

        public static void main(String[] args) {
            try {
                Constructorss test = new Constructorss();
            } catch (java.lang.Exception e) {
                System.out.println("Caught in Exception:" + e.getMessage());
            }
        }
    }

    /*.
    14. How does the try-catch-finally block work in Java?
    The try block contains the code that might throw an exception.
     The catch block catches and handles the exception.
    The finally block executes regardless of whether an exception occurred, often used for resource cleanup.
     */
    public static class Finally {
        int x = 10;

        public static void main(String[] args) {
            try {
                System.out.println(2);
                Integer.parseInt("eee");
                System.out.println("wwwwwwwwww");
            } finally {
                System.out.println(1);
            }
            System.out.println(3);
        }
    }

    /*
    16. What is the purpose of the finally block?
    Finally block is extension of try-catch block ,if extension occurs or not finally block continuous execute
     */
    public static class FinallyWithCatch {
        int x = 10;

        public static void main(String[] args) {
            try {
                System.out.println(2);
                Integer.parseInt("eee");
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                System.out.println("EEEE" + e.getMessage());
            } finally {
                System.out.println(1);
            }
            System.out.println(3);
        }
    }

    /*
 17. Can a finally block be skipped?
yes, some case finally block not execute
a. In try and catch block used system.exist() method finally block not execute.
b. Jvm crash, out of memory.
c. forced fully killed java program.
d. deadlock condition not used finally.
e. shutdown system due to power failure.

18.What happens if an exception is thrown in the finally block?
Explain the behavior if an exception occurs in the finally block.
Answer: If an exception is thrown in the finally block,
it will override any exception thrown in the try or catch block.
The new exception will be propagated.

19.What happens if System.exit() is called in a try block?
When System.exit() is called inside a try block,
the program terminates immediately, bypassing any remaining code in the current method, including:

The rest of the try block.
The catch and finally blocks, even if they are present.
Any remaining code in the call stack.


The finally block will not be executed, even though it usually runs whether an exception occurs or not.
In summary, when System.exit() is called, the JVM shuts down immediately, and no further blocks (catch, finally, or subsequent code) are executed
     */
    public class TestExit {
        public static void main(String[] args) {
            try {
                System.out.println("In try block");
                System.exit(0);  // Terminates the program here
            } catch (java.lang.Exception e) {
                System.out.println("In catch block");
            } finally {
                System.out.println("In finally block");
            }
        }
    }

    public static class FinallyBlockSkip {


        public static void main(String[] args) {
            try {
                System.out.println(2);

                System.exit(0);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                System.out.println("EEEE" + e.getMessage());
            } finally {
                System.out.println(1);
            }
            System.out.println(3);
        }
    }
    /*
 20.   Difference Between final, finally, and finalize()
    final
A final variable can't be changed once initialized.
A final method cannot be overridden by subclasses.
A final class cannot be subclassed or inherited.
   */

    public final static class Finals {
        private final int x = 10;

        public final void test() {
            System.out.println("eeeee");
        }

        public final static class Main {

            Finals finals = new Finals();
            //  finals.test();

        }
    }

    /*
    finalize()
    The finalize() method is called by the garbage collector before an object is destroyed.
    It is used to perform cleanup actions before an object is collected by the garbage collector.


    public static class FinalizeExample {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalize method called");
        }

        public void main(String[] args) {
            FinalizeExample obj = new FinalizeExample();
            obj = null;  // Dereference the object so it becomes eligible for GC

            // Suggest garbage collection
            System.gc();

            System.out.println("End of the program");
        }
    }
*/

/*
21. What is try-with-resources in Java?
Introduced in Java 7, try-with-resources is a try statement that automatically closes resources such as files, network connections, etc.,
that implement the AutoCloseable interface.
 It ensures that resources are closed even if an exception is thrown.

 try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    // Code
}

Here’s a set of **10 MCQs** based on the concept of **try-with-resources** in Java:

---

### 1. What is the primary purpose of the try-with-resources feature in Java?
**A)** To reduce the number of catch blocks.
**B)** To automatically close resources that implement the `AutoCloseable` interface.
**C)** To handle multiple exceptions in a single catch block.
**D)** To manage threads in a multi-threaded environment.
**Answer:** **B**

---

### 2. Which of the following interfaces must a resource implement to be used in try-with-resources?
**A)** `Serializable`
**B)** `Closeable` or `AutoCloseable`
**C)** `Runnable`
**D)** `Comparable`
**Answer:** **B**

---

### 3. What happens if an exception is thrown inside a try-with-resources block?
**A)** The exception is ignored, and resources are closed.
**B)** The resource is not closed automatically.
**C)** The exception is handled, and the resource is closed.
**D)** The resource is closed automatically, and the exception propagates if unhandled.
**Answer:** **D**

---

### 4. Can multiple resources be declared in a single try-with-resources statement?
**A)** Yes, but only one resource is closed automatically.
**B)** No, only one resource can be used per try block.
**C)** Yes, and all resources are closed automatically in reverse order.
**D)** Yes, but only if they are of the same type.
**Answer:** **C**

---

### 5. Which Java version introduced try-with-resources?
**A)** Java 6
**B)** Java 7
**C)** Java 8
**D)** Java 9
**Answer:** **B**

---

### 6. What happens if a resource fails to close in try-with-resources?
**A)** The program terminates immediately.
**B)** The exception is suppressed, and the next resource is closed.
**C)** An exception is thrown, and the program continues.
**D)** It causes a compile-time error.
**Answer:** **B**

---

### 7. In the following code, which exception is thrown if both the `read` and `close` methods fail?
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    br.readLine();
} catch (IOException e) {
    e.printStackTrace();
}
```
**A)** Only the exception from `readLine` is thrown.
**B)** Only the exception from `close` is thrown.
**C)** The exception from `readLine` is thrown, and the one from `close` is suppressed.
**D)** Both exceptions are thrown in sequence.
**Answer:** **C**

---

### 8. What is the scope of a resource declared in a try-with-resources statement?
**A)** Global
**B)** Local to the try block
**C)** Local to the class
**D)** Shared across multiple threads
**Answer:** **B**

---

### 9. Which of the following classes cannot be used in a try-with-resources block?
**A)** `BufferedReader`
**B)** `FileInputStream`
**C)** `PrintWriter`
**D)** `String`
**Answer:** **D**

---

### 10. Is it mandatory to handle or declare exceptions thrown by a resource in try-with-resources?
**A)** No, because the exceptions are suppressed automatically.
**B)** Yes, if the resource's methods declare checked exceptions.
**C)** No, it depends on the type of exception.
**D)** Yes, always.
**Answer:** **B**

---

### Summary:
 */

    /*
        Q22. Can we throw an exception from a static block?
        Yes, exceptions can be thrown from a static block.
                However, only unchecked exceptions can be thrown directly from a static block
        because checked exceptions must be either caught or declared in a method signature.
                Since static blocks are not methods, checked exceptions must be handled within the block.


    public static class StaticsBlock {
        static {
            System.out.println("Inside static block");
            throw new RuntimeException("Unchecked exception from static block");
        }

        public static void main(String[] args) {
            System.out.println("This will not execute");
        }
    }
  Q.  23 What happens if System.exit() is called in a try block?
  When System.exit() is called, the JVM will terminate the program, and
  no further code (including catch and finally blocks) will be executed.
     */
    public static class TerminateProgram {
        public static void main(String[] args) {
            try {
                System.out.println("Inside try block");
                System.exit(0); // JVM will terminate here
            } catch (java.lang.Exception e) {
                System.out.println("Inside catch block");
            } finally {
                System.out.println("Inside finally block");
            }
            System.out.println("This will not execute");
        }
    }

    // Q.24 Can you write multi catch block?
    // Can we have multiple catch blocks for a single try block?
//
    // Ans: Yes, We can create more than one catch block in try block.
    // We can create child-specific exceptions followed by parent exceptions.
    public static class MultiCatchBlock {
        public static void main(String[] args) {
            try {
                int z = 10 / 0; // This will throw an ArithmeticException
                Integer.parseInt("xyz"); // This will throw a NumberFormatException
                int a1 = (Integer) null; // This will throw a NullPointerException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException: " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException: " + e.getMessage());
            }
        }
    }

    /*
    Q.25 What is the purpose of the assert statement in Java?
     The assert statement is used to create assertions,
     which are conditions that must be true at a certain point in the program.
     If the condition is false, the program will throw an AssertionError.
     Assertions are generally used for testing and debugging purposes.
     */
    public static class Assert {
        public static void main(String[] args) {
            int age = 15;
            assert age >= 18 : "Age must be at least 18";
            System.out.println("Age is " + age);
        }
    }

    //Output when assertions are enabled (-ea flag):

    // Exception in thread "main" java.lang.AssertionError: Age must be at least 18 If assertions are enabled using the -ea flag, this will throw an AssertionError. If assertions are disabled, the program will execute normally.


/*

 Q.26 How are exceptions propagated in Java?
     Exception propagation refers to the process of passing an exception from the method where it occurs to its caller,
    and this continues until it is caught or until it reaches the main method. If not caught, it causes the program to terminate.



    public class  Test { public static void method1() { int data = 10 / 0; // This will cause an ArithmeticException }

        public static void method2() {
            method1();  // method1 is called here
        }

        public static void main(String[] args) {
            try {
                method2();  // method2 is called here
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in main: " + e.getMessage());
            }
        }

 */

     /*
    CUSTOM EXCEPTION
   27.  What is a custom exception and ?
1.In java, we can create our own exceptions that are derived classes of the exception class.
2. Creating our own Exception is known as custom exception or user-defined exception.
3. Basically, java custom exceptions are used to customize the exception according to a user need.

//how do you create one
 public class static InvalidAgeException extends Exception{
        private static Error e;
        private Message message;
        public InvalidAgeException(String message){
            super(message);
        }


        public static void main(String[] args) {
            try{
                int age=-5;
                if(age<0){
                    throw new InvalidAgeException("Age can not be negative!!");
                }
            }catch (InvalidAgeException e){
                System.out.println(e.getMessage());
            }
        }
    }


     */
//28 Can we create exceptions with custom error messages?

    class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
 /*29.What is the StackTrace in Java?
    If you want to eject line number where exception will occurs the uses or printStackTrace in catch block.

  */
    public static class A{
     public static void main(String[] args) {
         try{
             System.out.println("1");
             int x=10,y=0,z;
             z=x/y;
             System.out.println("2");
         }catch (java.lang.Exception e){
             e.printStackTrace();

         }
         System.out.println(3);
         System.out.println(4);
     }
 }
 /*
 30.What is the throw keyword used for?
1. throw keyword is used to throw an exception explicitly.
2.we can throw either checked or unchacked exception in java by throw keyword.
3. throw keyword used inside a function.
4. throw keyword used only one exception and can not multiple exception.
5. throw keywords help us to take the memory address of exception object give to the catch block.
6. We only to throw but can not propagate exception to calling method.

throw instance i.e:
throw new exception_class("errormanage")
ex:
throw new IOException("error");
Example
 */
 public static class A1 {
     public static void main(String[] args) {
         try{
             checkAge(15);
         }catch (java.lang.Exception e){
             System.out.println("Caught Exception::"+e.getMessage());
         }
     }

     private static void checkAge(int age) throws java.lang.Exception {

         if(age<18){
             throw new java.lang.Exception("Age much be greate than 18 or 23");
         }else {
             System.out.println("Age is Valid");
         }
     }

 }
 /*
31.What is the throws keyword used for in a method signature?
1. Throws keyword written down in the front of method.
2. Throws keyword cannot write down in the front of variable and class.
3. Throws keyword, Throws Exception to the calling statement of the method.
4. Whether Exception happens in method or not surrounding
   a calling statement in try catch become mandatory if throws keyword is used.
*/
 public class C {
     public static void test() throws java.lang.Exception {
         int i=10/0;
     }

     public static void main(String[] args) {
         org.example.corejava.exception.throwandThrows.throwsEx.C c=new org.example.corejava.exception.throwandThrows.throwsEx.C();
         try {
             c.test();
         }catch (java.lang.Exception e){
             System.out.println(e);
         }
         System.out.println("From Main::");
     }
 }

    /*

32.What is the difference between throw and throws?
throw
1. throw keyword is used to throw an exception explicitly.
2.we can throw either checked or unchacked exception in java by throw keyword.
3. throw keyword used inside a function.
4. throw keyword used only one exception and can not multiple exception.
5. throw keywords help us to take the memory address of exception object give to the catch block.
6. We only to throw but can not propagate exception to calling method.

throw instance i.e:
throw new exception_class("errormanage")
ex:
throw new IOException("error");

throws
1. Throws keyword written down in the front of method.
2. Throws keyword can not written down in the front of variable and class.
3. Throws keyword, Throws Exception to the calling statement of the method.
4. Whether Exception happen in method or not surrounding
   calling statement in try catch become mandatory if throws keyword is used.
  */
    /*
      33.Can you rethrow an exception in Java?
    Yes, you can rethrow an exception in Java.
      When you catch an exception in a catch block, you can throw it again (rethrow),
       either as the same exception or as a different one.
     This is useful when you want the calling method to handle the exception or provide additional context.
     There are two ways to rethrow an exception:

1. Rethrow the same exception:

You can catch an exception and throw it again to be handled by another part of the program.
public void someMethod() throws Exception {
    try {
        // Some code that throws an exception
    } catch (Exception e) {
        // Perform some action (like logging)
        throw e; // Rethrow the same exception
    }
}
2. Rethrow a new exception:

You can catch one exception and throw a new one, possibly adding more context.
public void someMethod() throws CustomException {
    try {
        // Some code that throws an exception
    } catch (Exception e) {
        // Rethrow a different exception
        throw new CustomException("Additional info", e);
    }
}
  */

    /*
    34.Can a method declare multiple exceptions in the throws clause?
Yes, a method in Java can declare multiple exceptions in its throws clause.
This means the method may throw more than one type of checked exception,
and each exception needs to be handled or declared in the method that calls it.
     */

    /*
   35. What happens if an exception is not caught in a program?
Answer: If an exception is not caught, the program will terminate,
 and the JVM will handle the exception by printing a stack trace.
*/
    /*
   36. What are some best practices for exception handling in Java?

1.Catch specific exceptions instead of using a generic Exception class.
2.Use finally for resource cleanup.
3.Avoid using exceptions for control flow.
4.Always log exceptions with meaningful messages.
     */
    /*
    37. How does the JVM handle uncaught exceptions?
When an exception is thrown and not caught within the program,
 it becomes an uncaught exception.
 The JVM handles such exceptions by printing a stack trace and terminating the program.
  The stack trace provides details about the exception, such as its type, message, and the line where it occurred.

Example:

public class Test {
    public static void main(String[] args) {
        int a = 10 / 0;  // This will throw ArithmeticException
        System.out.println("This line will not execute");
    }
}
Output:

Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Test.main(Test.java:3)
In this case, the JVM prints the stack trace showing the exception and where it occurred, then terminates the program. The line after the exception is never executed.
     */

    /*
    38. Can a `try` block be used without a `catch` block?

Yes, a `try` block can be used without a `catch` block in Java,
but it must be followed by a **`finally` block** or a **`throws` clause**.

There are two valid scenarios where this is possible:

1. **`try` with `finally`**:
   - The `finally` block is used to execute code that must run regardless of whether an exception occurs or not (e.g., closing resources like files or database connections).
   - If an exception occurs, the `finally` block will still execute, even if there is no `catch` block.

   Example:
   ```java
   public void someMethod() {
       try {
           // Code that might throw an exception
       } finally {
           // Code that will always execute, even if an exception occurs
           System.out.println("This will always execute");
       }
   }
   ```

2. **`try` with `throws` clause**:
   - You can throw exceptions from the `try` block without catching them if the method declares that it throws those exceptions using a `throws` clause.
   - In this case, the method that calls this one must handle the exception or declare it as well.

   Example:
   ```java
   public void someMethod() throws IOException {
       try {
           // Code that might throw an IOException
       } finally {
           // Code that always runs
       }
   }
      */
    /*
    38. Can you explain `NullPointerException` and how to avoid it?

### **What is a `NullPointerException`?**
A **`NullPointerException` (NPE)** is a **runtime exception** in Java that occurs when your program attempts to use an object reference that has not been initialized (i.e., it is `null`). This typically happens when you try to:

- Call a method on a `null` object.
- Access or modify a field of a `null` object.
- Attempt to index or access elements in an array that is `null`.
- Use `null` where an object is expected.

#### **Common Scenarios for `NullPointerException`**:
1. **Calling a method on a null object**:
   ```java
   String str = null;
   str.length();  // Throws NullPointerException
   ```

2. **Accessing a field of a null object**:
   ```java
   MyClass obj = null;
   obj.someField = 10;  // Throws NullPointerException
   ```

3. **Accessing an element in a null array**:
   ```java
   int[] array = null;
   int value = array[0];  // Throws NullPointerException
   ```

4. **Autoboxing with null**:
   ```java
   Integer num = null;
   int result = num;  // Throws NullPointerException (auto-unboxing null)
   ```

### **How to Avoid `NullPointerException`**

1. **Check for null explicitly**:
   Before performing any operations on an object, check if it is null to avoid `NullPointerException`.

   Example:
   ```java
   if (str != null) {
       System.out.println(str.length());
   } else {
       System.out.println("String is null");
   }
   ```

2. **Use Optional (Java 8 and later)**:
   Java provides the `Optional` class to represent values that can either be present or absent. It helps avoid null checks by providing a cleaner API.

   Example:
   ```java
   Optional<String> optionalStr = Optional.ofNullable(str);
   System.out.println(optionalStr.orElse("Default value").length());
   ```

3. **Initialize variables properly**:
   Ensure that objects are properly initialized before using them.

   Example:
   ```java
   String str = "";  // Initialize with an empty string instead of null
   ```

4. **Use `Objects.requireNonNull()`**:
   This method throws an `IllegalArgumentException` if the argument is null, helping you catch issues early in the code.

   Example:
   ```java
   Objects.requireNonNull(str, "String cannot be null");
   ```

5. **Use try-catch blocks**:
   Although not a best practice for avoiding `NullPointerException`, you can catch and handle it to prevent the program from crashing.

   Example:
   ```java
   try {
       str.length();
   } catch (NullPointerException e) {
       System.out.println("Caught NullPointerException: " + e.getMessage());
   }
   ```

6. **Use default values**:
   When null values are possible, provide default values to avoid `NullPointerException`.

   Example:
   ```java
   String str = null;
   int length = (str != null) ? str.length() : 0;
   ```

7. **Use the `@NonNull` or `@NotNull` annotations**:
   If you're using libraries like **Lombok** or **Eclipse**, you can use `@NonNull` or `@NotNull` to explicitly specify that a method argument or return value should not be null. The IDE may give you warnings during development.

   Example:
   ```java
   public void processData(@NonNull String data) {
       // Method will ensure that data is never null
   }
   ```

### **Conclusion**:
- **`NullPointerException`** occurs when trying to use an uninitialized (null) object.
- To avoid it, ensure objects are properly initialized, use null checks, Java's `Optional` class, and enforce non-null policies with annotations.
     */
/*
39.Can you catch exceptions of multiple types in Java?
Yes, you can catch **multiple types of exceptions** in Java using a **multi-catch block**. This feature was introduced in **Java 7** and allows you to handle multiple exception types in a single `catch` block, thereby reducing code duplication and improving readability.

### **How to Catch Multiple Exceptions**
You can specify multiple exception types in a single `catch` block by separating them with a **pipe (`|`)** symbol. The exception handling logic in the block will apply to all the specified exceptions.

### **Syntax Example**:
```java
try {
    // Code that may throw exceptions
} catch (IOException | SQLException e) {
    // Handle both IOException and SQLException here
    System.out.println("Exception caught: " + e.getMessage());
}
```

### **Key Points**:
1. **Shared Handling**: The `catch` block will handle all the specified exceptions in the same way.
2. **Common Superclass**: If two exception types share a common superclass, you can catch the superclass instead of listing multiple exceptions. For example, you can catch `Exception` to handle all checked exceptions.
3. **Final or Effectively Final Variable**: The exception variable (`e` in the example) is implicitly considered **final** in a multi-catch block, meaning you can't reassign it within the `catch` block.

### **Example**:
```java
try {
    // Code that may throw either IOException or SQLException
    FileInputStream file = new FileInputStream("somefile.txt");
    Connection connection = DriverManager.getConnection("database_url");
} catch (IOException | SQLException e) {
    // Handle both exceptions in the same block
    System.out.println("Error: " + e.getMessage());
}
```

In this example, both `IOException` and `SQLException` are handled by the same `catch` block, making the code cleaner and more efficient.

### **Catching Multiple Exceptions Separately**
If you need different handling for different exception types, you can still use multiple `catch` blocks:

```java
try {
    // Code that may throw exceptions
} catch (IOException e) {
    // Handle IOException
} catch (SQLException e) {
    // Handle SQLException
}
```

### **Summary**:
- You can catch multiple types of exceptions in a single `catch` block using the **pipe (`|`)** symbol.
- This feature simplifies code by allowing shared exception handling.
- The caught exception variable in a multi-catch block is **implicitly final**.
 */

    /*
    40.How do you create and use a `catch` block for multiple exceptions in Java?
    To create and use a `catch` block for handling **multiple exceptions** in Java, you can take advantage of the **multi-catch block** feature, introduced in **Java 7**. This allows you to catch multiple exception types in a single `catch` block, making the code cleaner and reducing redundancy.

### **Steps to Create and Use a Multi-Catch Block:**

1. **Use a `try` block** to enclose the code that might throw exceptions.
2. **Declare multiple exception types** in a single `catch` block by separating them with the **pipe (`|`)** symbol.
3. **Handle the exceptions** in the shared `catch` block, since the code will be executed for any of the specified exceptions.

### **Example:**
In the following example, the `try` block might throw either an `IOException` or a `SQLException`. Both exceptions are caught in the same `catch` block.

```java
import java.io.*;
import java.sql.*;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            FileInputStream file = new FileInputStream("somefile.txt");  // Could throw IOException
            Connection connection = DriverManager.getConnection("database_url");  // Could throw SQLException
        } catch (IOException | SQLException e) {
            // Handle both IOException and SQLException in this block
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```

### **Explanation:**

- **`try` block**: Contains the code that may throw multiple exceptions (`IOException` from file operations and `SQLException` from database operations).
- **`catch` block**: Catches both exceptions using the `|` symbol and handles them in a unified manner. The exception variable `e` is shared between the exception types.
- **Common behavior**: Since both exceptions are handled the same way, this approach avoids duplicating `catch` blocks.

### **Points to Remember:**

1. **Single `catch` block for multiple exceptions**: The `catch` block will handle any of the exceptions listed after the `|` symbol.

2. **Exception variable (`e`) is implicitly `final`**: Inside the multi-catch block, you cannot modify or reassign the caught exception variable (`e` in this case).

3. **Separate `catch` blocks if necessary**: If you need different handling for different exceptions, you can use multiple `catch` blocks, one for each exception type.

   ```java
   try {
       // Code that may throw exceptions
   } catch (IOException e) {
       // Handle IOException
       System.out.println("IOException occurred: " + e.getMessage());
   } catch (SQLException e) {
       // Handle SQLException
       System.out.println("SQLException occurred: " + e.getMessage());
   }
   ```

### **Example with Different Exception Handling**:

```java
try {
    FileInputStream file = new FileInputStream("somefile.txt");  // Could throw IOException
    Connection connection = DriverManager.getConnection("database_url");  // Could throw SQLException
} catch (IOException e) {
    System.out.println("File handling error: " + e.getMessage());
} catch (SQLException e) {
    System.out.println("Database error: " + e.getMessage());
}
```

### **Summary**:
- In Java, you can catch multiple exceptions in a single `catch` block using the **pipe (`|`)** symbol.
- This feature simplifies exception handling when you want to handle multiple exceptions in the same way.
- If different handling is required for different exceptions, you should use multiple `catch` blocks.
     */
}

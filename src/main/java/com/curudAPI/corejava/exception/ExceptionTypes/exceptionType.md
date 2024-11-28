
### Text-based explanation:

1. **Compile Time (Checked) Exception:**
   This exception will occur when .java file is compiling .class file.

   Example:
   ```java
   class A {
       public static void main(String[] args) {
           try {
               FileReader fr = new FileReader("D://test.txt"); // Checked Exception
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           }
       }
   }
   ```

2. **Run Time (Unchecked) Exception:**
   These exceptions occur when running the `.class` file. They are not checked during compilation and typically result from programming errors (like dividing by zero).

   Example:
   ```java
   class A {
       public static void main(String[] args) {
           int x = 20 / 0; // Unchecked Exception (ArithmeticException)
       }
   }
   ```

---

### **ER Diagram Representation of the Exception Hierarchy**

```
```
Here's a complete representation of the **Java Exception Hierarchy** with both **checked exceptions (compile-time)** and **unchecked exceptions (run-time)**:

```
```
``
                                 Throwable
                                     |
                ----------------------------------------------------
                |                                                      |
              Error                                             Exception
                |                                                      |
    |-------------------------|                          |--------------------------------------------|
    |                         |                          |                                            |
VirtualMachineError    LinkageError         ( Unchecked or RuntimeException)                       (Checked Exception or Compile Time)
    |                         |                          |                                            |
    |                         |                          |                                            |
OutOfMemoryError    ClassFormatError           ArithmeticException                           IOException
StackOverflowError  NoClassDefFoundError       NullPointerException                          SQLException
InternalError       UnsatisfiedLinkError       ArrayIndexOutOfBoundsException                FileNotFoundException
                   VerifyError                StringIndexOutOfBoundsException               ClassNotFoundException
                                              IllegalArgumentException                      EOFException
                                              IllegalStateException                         CloneNotSupportedException
                                              NumberFormatException                         InterruptedException
                                              UnsupportedOperationException                 MalformedURLException
                                                                                           InstantiationException
```
```
### Explanation:
#### 1. **Throwable**
- The root class of all errors and exceptions in Java.

#### 2. **Error**
- Represents serious problems that applications should not try to catch.
    - **VirtualMachineError**: Represents errors related to the JVM.
        - **OutOfMemoryError**: Thrown when the JVM runs out of memory.
        - **StackOverflowError**: Thrown when the stack overflows due to recursion or deep call chains.
        - **InternalError**: Represents a JVM internal error.
    - **LinkageError**: Problems related to class linking or class definition.
        - **ClassFormatError**
        - **NoClassDefFoundError**: Thrown when the JVM cannot find a required class.
        - **UnsatisfiedLinkError**: Issues with native libraries.
        - **VerifyError**: Class file verification error.

#### 3. **Exception**
- Represents conditions that a reasonable application might want to catch.
    - **RuntimeException (Unchecked)**
        - **ArithmeticException**: Thrown when an exceptional arithmetic condition occurs (e.g., division by zero).
        - **NullPointerException**: Thrown when trying to access an object reference that is null.
        - **ArrayIndexOutOfBoundsException**: Thrown when trying to access an array index that is out of bounds.
        - **StringIndexOutOfBoundsException**: Thrown when trying to access a string index that is out of bounds.
        - **IllegalArgumentException**: Thrown when a method receives an argument that is inappropriate.
        - **IllegalStateException**: Thrown when a method has been invoked at an illegal or inappropriate time.
        - **NumberFormatException**: Thrown when an application tries to convert a string to a numeric type, but the string does not have the appropriate format.
        - **UnsupportedOperationException**: Thrown to indicate that the requested operation is not supported.

    - **Checked Exceptions (Compile-Time)**
        - **IOException**: General I/O failure.
            - **FileNotFoundException**: Thrown when a file is not found.
            - **EOFException**: Thrown when the end of a file is unexpectedly reached.
            - **MalformedURLException**: Thrown when an invalid URL is passed.
        - **SQLException**: Issues related to database access.
        - **ClassNotFoundException**: Thrown when the JVM cannot find a required class.
        - **CloneNotSupportedException**: Thrown when a clone method in a class does not support cloning.
        - **InterruptedException**: Thrown when a thread is interrupted.
        - **InstantiationException**: Thrown when trying to instantiate an abstract class or an interface.

---

### Summary of Exception Types:
1. **Unchecked Exceptions (RuntimeException)**
    - Arithmetic issues (e.g., division by zero)
    - Null pointer access
    - Illegal arguments and states
    - Array and string index out of bounds
    - Number format issues

2. **Checked Exceptions**
    - I/O issues (e.g., file not found)
    - SQL-related issues
    - Class not found or unsupported cloning
    - Interrupted threads


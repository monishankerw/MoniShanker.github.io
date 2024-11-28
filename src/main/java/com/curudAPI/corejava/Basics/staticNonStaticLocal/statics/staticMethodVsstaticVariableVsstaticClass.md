Q. Difference between static methods ,static variable and static classes in Java?

In Java, `static` can be applied to methods, variables, and nested classes, each serving a different purpose. Here’s a breakdown of the differences between **static methods**, **static variables**, and **static nested classes**:

---

### 1. **Static Methods**
- **Definition**: A static method is associated with the class itself, not with any specific instance of the class.
- **Characteristics**:
    - Can be called using the class name (e.g., `ClassName.methodName()`).
    - Can access only static variables and other static methods within the class directly; it cannot access instance (non-static) variables or methods without an object reference.
    - Often used for utility or helper functions, such as `Math.pow()` in Java's `Math` class.
- **Example**:
  ```java
  public class Example {
      public static void displayMessage() {
          System.out.println("This is a static method.");
      }
  }

  // Usage
  Example.displayMessage();
  ```

---

### 2. **Static Variables**
- **Definition**: A static variable is shared among all instances of a class, meaning there’s only one copy of the variable, regardless of the number of instances.
- **Characteristics**:
    - Initialized only once, when the class is loaded into memory.
    - Can be accessed by all instances of the class and can be modified, but the changes are reflected across all instances.
    - Often used for constants or values that should be shared across all instances, like a counter to track the number of instances.
- **Example**:
  ```java
  public class Example {
      public static int count = 0; // Static variable

      public Example() {
          count++;
      }
  }

  // Usage
  Example obj1 = new Example();
  Example obj2 = new Example();
  System.out.println(Example.count); // Output: 2
  ```

---

### 3. **Static Nested Classes**
- **Definition**: A static nested class is a class defined within another class but declared `static`. It doesn’t require an instance of the outer class to be instantiated.
- **Characteristics**:
    - Can access the `static` members (methods and variables) of the outer class but cannot directly access instance (non-static) members of the outer class.
    - Useful when a nested class doesn’t need a reference to its outer class or when its functionality is closely associated with the outer class.
- **Example**:
  ```java
  public class OuterClass {
      static String outerStaticVariable = "Outer static variable";

      // Static nested class
      public static class StaticNestedClass {
          public void display() {
              System.out.println(outerStaticVariable); // Access outer class's static variable
          }
      }
  }

  // Usage
  OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
  nestedObject.display(); // Output: Outer static variable
  ```

---

### Summary Table

| Feature                | Static Method                                 | Static Variable                                   | Static Nested Class                                |
|------------------------|-----------------------------------------------|---------------------------------------------------|---------------------------------------------------|
| **Belongs To**         | Class                                         | Class                                             | Class                                             |
| **Access**             | Can be called directly with the class name    | Accessible through the class name, or instances   | Instantiated without an outer class instance      |
| **Access to Outer Class Members** | Only static members directly            | Only static members                               | Only static members of the outer class            |
| **Purpose**            | Utility functions, no instance needed         | Shared data across all instances                  | Nested class functionality without outer instance |

### Key Differences
- **Static Methods**: Associated with the class and do not require an instance; cannot access instance variables directly.
- **Static Variables**: Shared across all instances of a class; useful for constants or shared resources.
- **Static Nested Classes**: Defined inside another class, doesn’t need an instance of the outer class to be created, and can be used to logically group related classes.
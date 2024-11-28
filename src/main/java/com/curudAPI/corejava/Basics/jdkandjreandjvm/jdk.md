
```markdown
# Java Interview Questions and Answers

---

### Q. Explain JDK, JRE, and JVM?
- **JDK (Java Development Kit)**: JDK = JRE + Development Kit. It is used to write, compile, and run Java programs. It consists of the development tools along with the JRE.
- **JRE (Java Runtime Environment)**: JRE = JVM + Library Set. It provides the runtime environment to execute Java applications.
- **JVM (Java Virtual Machine)**: Reads `.class` files (bytecode) and executes the code.

---

### Q. Why is Java a platform-independent language?
- When a `.java` file is compiled, it converts into a `.class` file (bytecode) by the JIT (Just-In-Time) compiler. This bytecode can run on any platform that has a JVM, making Java platform-independent.

---

### Q. What is the JIT Compiler in Java?
- **Just-In-Time (JIT) Compiler**: A component of the JRE that improves performance by compiling bytecode into native machine code at runtime, allowing Java applications to run faster.

---

### Q. What do we get in the JDK file in Java?
In a Java JDK file, you get:
1. **Compiler (`javac`)** – Compiles Java code into bytecode.
2. **Java Runtime Environment (JRE)** – Includes the JVM and core libraries to run Java apps.
3. **Development Tools** – Debugger (`jdb`), archiver (`jar`), documentation generator (`javadoc`).
4. **Libraries** – Core and optional libraries for various APIs.
5. **Utilities** – Tools for profiling, monitoring, and management (e.g., `jconsole`, `jstack`).

The JDK is a complete toolkit for developing and running Java applications.

---

### Q. Is Java Pass-by-Value or Pass-by-Reference?
- Java is **pass-by-value**.
  - For **primitive types** (e.g., `int`, `double`): A copy of the value is passed, so changes inside a method don’t affect the original variable.
  - For **objects**: A copy of the reference (not the object itself) is passed, meaning you can modify the object's data, but not the reference itself.

---

### Q. Is Java Call-by-Value or Call-by-Reference?
- Java is **call-by-value** for both primitive types and objects:
  - For **primitives**: A copy of the value is passed.
  - For **objects**: A copy of the reference is passed. You can modify the object's internal state, but reassigning it won’t change the original reference outside the method.

---

### Q. Shallow Copy and Deep Copy
- **Shallow Copy**: Copies only the top-level object. Nested objects are shared, so changes to them affect both the original and the copy. Example: `Object.clone()`.
- **Deep Copy**: Copies the entire object graph, including nested objects. Changes to the copy do not affect the original. Requires custom code or serialization.

---

### Q. Object Cloning and How to Achieve it in Java
**Object Cloning** in Java is creating a copy of an object with the same properties and state. It is mainly achieved using the `clone()` method from the `Cloneable` interface.

#### How to Achieve Cloning
1. **Implement `Cloneable` Interface**: Marks the class as "cloneable."
2. **Override `clone()` Method**: Make it `public`.
3. **Call `super.clone()`**: Performs a shallow copy.

```java
class MyClass implements Cloneable {
    int a;
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```
Q. Cloning?
The Process of creating the replicable of a particular object by coping the context of one object completly into another object.

#### Types of Cloning
- **Shallow Copy**: Default behavior of `super.clone()`; copies only the object's immediate properties.
- **Deep Copy**: Manually clone nested objects within `clone()`.

> **Note**: Deep cloning can also be achieved using serialization libraries like Apache Commons or custom code.

---

### Q. What is a ClassLoader?
- **ClassLoader** is an abstract class in `java.lang` package. It is a subsystem of the JVM that loads `.class` files into memory whenever a Java program runs.

There are three main types of ClassLoaders:
1. **Bootstrap Class Loader**
2. **Extension Class Loader**
3. **System/Application Class Loader**
```


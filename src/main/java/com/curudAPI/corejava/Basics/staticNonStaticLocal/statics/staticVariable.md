## 2. Static Variables
- **Definition**: Static variables are also known as class variables. They are declared using the `static` keyword within a class but outside any method or constructor.
- **Scope**: Static variables belong to the class, not to any specific instance, and thus are shared among all instances of the class.
- **Lifetime**: Static variables are created when the class is loaded and destroyed when the class is unloaded.

**Example**:
```java
public class StaticVariableExample {
    static int staticVar = 100; // static variable

    public void display() {
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        StaticVariableExample example1 = new StaticVariableExample();
        StaticVariableExample example2 = new StaticVariableExample();

        example1.display(); // Outputs 100
        example2.display(); // Outputs 100

        StaticVariableExample.staticVar = 200; // Modify static variable

        example1.display(); // Outputs 200
        example2.display(); // Outputs 200
    }
}
```
In Java, a **static variable** (also known as a class variable) is a variable that belongs to the class itself rather than to instances of the class. Static variables are shared across all instances of the class, and they retain their values across method calls and instances. Here are different scenarios with examples to demonstrate how static variables work:

---

### 1. **Basic Static Variable Example**
A static variable is declared with the `static` keyword and is shared by all instances of the class.

```java
public class StaticExample {
    static int counter = 0; // Static variable

    public StaticExample() {
        counter++; // Increment static counter each time an object is created
    }

    public void displayCounter() {
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        
        obj1.displayCounter(); // Outputs: Counter: 2
        obj2.displayCounter(); // Outputs: Counter: 2
    }
}
```

- **Explanation**: `counter` is a static variable, so its value is shared among all instances. Both `obj1` and `obj2` see the same counter value, which increases with each new object creation.

---

### 2. **Static Variable Used for Constants**
Static variables are often used for constants, which are values that do not change. In such cases, they are typically declared as `final`.

```java
public class MathConstants {
    public static final double PI = 3.14159; // Static constant

    public static void main(String[] args) {
        System.out.println("PI value: " + MathConstants.PI); // Accessed directly without an instance
    }
}
```

- **Explanation**: `PI` is a static constant that represents a mathematical constant. Since it's `final`, it cannot be modified and is accessed using the class name without creating an object.

---

### 3. **Accessing Static Variables in Static Methods**
Static methods can directly access static variables since they both belong to the class rather than an instance.

```java
public class StaticMethodExample {
    static int count = 0; // Static variable

    public static void incrementCount() { // Static method
        count++; // Accessing static variable directly
    }

    public static void main(String[] args) {
        incrementCount();
        incrementCount();
        System.out.println("Count: " + count); // Outputs: Count: 2
    }
}
```

- **Explanation**: The `incrementCount` method is static and can access the static variable `count` directly. Static variables and methods can be accessed without creating an instance of the class.

---

### 4. **Static Variables with Multiple Instances**
All instances of a class share the same static variable, and changes made by one instance reflect in all instances.

```java
public class SharedCounter {
    static int counter = 0; // Shared across instances

    public void increment() {
        counter++;
    }

    public static void main(String[] args) {
        SharedCounter obj1 = new SharedCounter();
        SharedCounter obj2 = new SharedCounter();

        obj1.increment();
        System.out.println("Counter after obj1 increment: " + counter); // Outputs: 1

        obj2.increment();
        System.out.println("Counter after obj2 increment: " + counter); // Outputs: 2
    }
}
```

- **Explanation**: The static variable `counter` is shared by both `obj1` and `obj2`. When one object modifies it, the change is reflected across all instances.

---

### 5. **Static Variables in Inheritance**
Static variables are shared across instances of subclasses as well.

```java
class Parent {
    static int staticVar = 5; // Static variable in parent class
}

class Child extends Parent {
    public void modifyStaticVar() {
        staticVar = 10; // Modifies static variable from parent class
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        
        System.out.println("Parent staticVar: " + p.staticVar); // Outputs: 5
        c.modifyStaticVar();
        System.out.println("Parent staticVar after modification: " + p.staticVar); // Outputs: 10
    }
}
```

- **Explanation**: `staticVar` is a static variable in the `Parent` class. When modified by the `Child` class, the change reflects across all references, including `Parent` class references.

---

### 6. **Static Block for Static Variable Initialization**
Static variables can be initialized in a static block, which is executed once when the class is loaded.

```java
public class StaticBlockExample {
    static int value;

    static {
        value = 42; // Static initialization block
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {
        System.out.println("Value: " + value); // Outputs: Value: 42
    }
}
```

- **Explanation**: The static block is executed once when the class is first loaded, initializing `value` to 42. This is useful for complex initialization of static variables.

---

### 7. **Static Variables in Singleton Pattern**
Static variables help maintain a single instance in the Singleton pattern.

```java
public class Singleton {
    private static Singleton instance = null; // Static variable for single instance

    private Singleton() {} // Private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // Outputs: true, both refer to the same instance
    }
}
```

- **Explanation**: `instance` is a static variable that stores a single instance of the `Singleton` class, ensuring only one instance exists in the program.

---

### 8. **Static Variables in a Counter Across All Objects**
Static variables can act as counters to keep track of the number of instances of a class.

```java
public class InstanceCounter {
    static int instanceCount = 0; // Static counter

    public InstanceCounter() {
        instanceCount++;
    }

    public static void main(String[] args) {
        new InstanceCounter();
        new InstanceCounter();
        System.out.println("Instance count: " + InstanceCounter.instanceCount); // Outputs: 2
    }
}
```

- **Explanation**: `instanceCount` increments each time an object is created. The counter is static, so it tracks the total number of instances created across all objects.

---

### 9. **Static Variables in Utility Classes**
Static variables are often used in utility classes to hold default values or configurations.

```java
public class Config {
    public static String DEFAULT_PATH = "/usr/local/data"; // Static default configuration
}

public class UtilityExample {
    public static void main(String[] args) {
        System.out.println("Default Path: " + Config.DEFAULT_PATH); // Outputs: /usr/local/data
    }
}
```

- **Explanation**: `DEFAULT_PATH` is a static variable holding a default configuration value. It can be accessed directly using the class name without creating an instance.

---

These scenarios show how static variables work in different contexts, helping share values across instances, initialize constants, and facilitate the Singleton pattern, among other uses.
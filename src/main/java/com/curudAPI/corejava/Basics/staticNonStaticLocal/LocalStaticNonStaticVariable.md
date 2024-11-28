In Java, variables can be categorized based on their declaration and usage into **local**, **static**, and **non-static (instance)** variables. Here's an explanation of each type along with examples:

### 1. Local Variables
- **Definition**: Local variables are declared within a method, constructor, or block. They are created when the method or block is entered and destroyed once the method or block exits.
- **Scope**: Local variables are only accessible within the method or block in which they are declared.
- **Initialization**: Local variables must be initialized before they are used.

**Example**:
```java
public class LocalVariableExample {
    public void display() {
        int localVar = 10; // local variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.display();
    }
}
```

### 2. Static Variables
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

### 3. Non-Static (Instance) Variables
- **Definition**: Non-static variables are also known as instance variables. They are declared within a class but outside any method or constructor, and they do not have the `static` keyword.
- **Scope**: Non-static variables are tied to a specific instance of a class. Each instance has its own copy of these variables.
- **Lifetime**: Non-static variables are created when an instance of the class is created and destroyed when the instance is destroyed.

**Example**:
```java
public class InstanceVariableExample {
    int instanceVar = 50; // non-static (instance) variable

    public void display() {
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        InstanceVariableExample example1 = new InstanceVariableExample();
        InstanceVariableExample example2 = new InstanceVariableExample();

        example1.display(); // Outputs 50
        example2.display(); // Outputs 50

        example1.instanceVar = 75; // Modify instance variable for example1

        example1.display(); // Outputs 75
        example2.display(); // Outputs 50
    }
}
```

### Summary
- **Local Variable**: Exists only within a method or block. Example: `int localVar = 10;`
- **Static Variable**: Belongs to the class and is shared among all instances. Example: `static int staticVar = 100;`
- **Non-Static (Instance) Variable**: Belongs to an instance of the class. Each object has its own copy. Example: `int instanceVar = 50;`
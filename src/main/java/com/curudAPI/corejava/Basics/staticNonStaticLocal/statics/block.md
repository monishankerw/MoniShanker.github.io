Here is a complete example that includes:

1. **Static Block**: For initializing static variables.
2. **Local Variables**: Within a method.
3. **Non-Static Block**: For initializing non-static variables before the constructor is called.
4. **Main Method**: To execute the code and observe the order of initialization.

This example will show how each block works and in what order they are executed.

```java
public class BlockExample {

    // Static variable
    static int staticVar;

    // Non-static variable
    int nonStaticVar;

    // Static block
    static {
        staticVar = 10;
        System.out.println("Static Block: Static variable initialized to " + staticVar);
    }

    // Non-static block
    {
        nonStaticVar = 20;
        System.out.println("Non-Static Block: Non-static variable initialized to " + nonStaticVar);
    }

    // Constructor
    public BlockExample() {
        System.out.println("Constructor: Creating instance of BlockExample");
    }

    // Method with local variable
    public void methodWithLocalVariable() {
        int localVar = 30; // Local variable
        System.out.println("Method: Local variable initialized to " + localVar);
    }

    public static void main(String[] args) {
        System.out.println("Main Method: Start");

        // Creating the first instance of BlockExample
        BlockExample example1 = new BlockExample();
        example1.methodWithLocalVariable();

        // Creating the second instance of BlockExample
        BlockExample example2 = new BlockExample();
        example2.methodWithLocalVariable();

        System.out.println("Main Method: End");
    }
}
```

### Explanation and Output Order

1. **Static Block**: Executed first when the class is loaded. Static variables are initialized here.
2. **Non-Static Block**: Runs each time an instance is created, before the constructor.
3. **Constructor**: Initializes any remaining instance-specific settings.
4. **Method with Local Variable**: Shows how a local variable is initialized and used only within this method's scope.
5. **Main Method**: Executes and shows how the class components interact.

### Expected Output

```plaintext
Static Block: Static variable initialized to 10
Main Method: Start
Non-Static Block: Non-static variable initialized to 20
Constructor: Creating instance of BlockExample
Method: Local variable initialized to 30
Non-Static Block: Non-static variable initialized to 20
Constructor: Creating instance of BlockExample
Method: Local variable initialized to 30
Main Method: End
```

### Explanation of Output

1. **Static Block** initializes `staticVar` when the class is loaded.
2. **Main Method** begins execution.
3. **Non-Static Block** runs each time an instance is created, initializing `nonStaticVar`.
4. **Constructor** is called after the non-static block for instance-specific initialization.
5. **Method** demonstrates local variable scope within the method.

This example clearly shows the order of execution and demonstrates the use of each type of variable and block.
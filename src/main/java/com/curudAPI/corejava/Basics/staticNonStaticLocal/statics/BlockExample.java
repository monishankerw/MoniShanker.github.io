package org.example.corejava.Basics.staticNonStaticLocal.statics;

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

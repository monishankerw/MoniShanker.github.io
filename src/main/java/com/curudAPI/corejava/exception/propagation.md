How are exceptions propagated in Java?
Exception propagation refers to the process of passing an exception from the method where it occurs to its caller, and this continues until it is caught or until it reaches the main method. If not caught, it causes the program to terminate.

Example:


public class Test {
public static void method1() {
int data = 10 / 0; // This will cause an ArithmeticException
}

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
}
Output:


Exception caught in main: / by zero
Here, the exception is propagated from method1 to method2 to main where it is finally caught.
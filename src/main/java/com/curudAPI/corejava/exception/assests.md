What is the purpose of the assert statement in Java?
The assert statement is used to create assertions, which are conditions that must be true at a certain point in the program. If the condition is false, the program will throw an AssertionError. Assertions are generally used for testing and debugging purposes.

Example:


public class Test {
public static void main(String[] args) {
int age = 15;
assert age >= 18 : "Age must be at least 18";
System.out.println("Age is " + age);
}
}
Output when assertions are enabled (-ea flag):


Exception in thread "main" java.lang.AssertionError: Age must be at least 18
If assertions are enabled using the -ea flag, this will throw an AssertionError. If assertions are disabled, the program will execute normally.
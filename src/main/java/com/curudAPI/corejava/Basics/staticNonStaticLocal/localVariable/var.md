Here's a correction and explanation of the `var` type in Java:

1. The `var` type was introduced in **Java 10**, not in Java 1.1.
2. It is used for **local variable type inference**. The compiler infers the type of the variable based on the value assigned to it. It **cannot store any type of variable** explicitly; the type is inferred at compile time.
3. `var` can only be used for **local variables**, not for static or non-static fields. It can also be used in **loops** and **lambda expressions**.
4. The memory size of `var` is determined by the type inferred by the compiler, and does not change dynamically. It's like other variable types in Java, with memory allocation based on the inferred type.
5. `var` **is a reserved type name in Java 10** and onward, so it **cannot** be used as a variable name.
6. **`var` cannot be used as a method argument**.

### Example Code

```java
public class VarExample {

    public static void main(String[] args) {
        var message = "Hello, World!"; // The compiler infers this as a String
        var number = 10;               // The compiler infers this as an int
        var list = List.of(1, 2, 3);   // The compiler infers this as List<Integer>

        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("List: " + list);
        
        // var cannot be used as a method argument
        // public void someMethod(var argument) { } // This would cause a compile error
    }
}
```

### Key Points:
- `var` is used only for local variables.
- It allows the compiler to infer the type of the variable based on the assigned value.
- It **cannot be used for class fields, method arguments, or return types**.


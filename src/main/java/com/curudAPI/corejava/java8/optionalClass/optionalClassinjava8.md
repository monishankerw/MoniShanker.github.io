```markdown
# Optional Class in Java 8

The `Optional` class is a container object introduced in Java 8 to handle `null` values and avoid `NullPointerException`. It provides methods to work with values that might be `null` in a clean and readable manner.

## Key Methods of `Optional`
1. **`empty()`**  
   Returns an empty `Optional` instance.

2. **`of(T value)`**  
   Returns an `Optional` with the specified present non-null value.

3. **`ofNullable(T value)`**  
   Returns an `Optional` describing the specified value if non-null, otherwise returns an empty `Optional`.

---

### Examples

#### Example 1: Without Optional  
```java
public class A {
    int x = 10;
    static A a1;

    public static void main(String[] args) {
        try {
            System.out.println(a1.x); // Causes NullPointerException
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(100); // Will execute even after exception
    }
}
```

#### Example 2: Using `Optional.ofNullable()`
```java
import java.util.Optional;

public class B {
    int x = 10;
    static B b1;

    public static void main(String[] args) {
        Optional<B> b = Optional.ofNullable(b1);
        System.out.println(b.isPresent()); // Returns false because b1 is null
        System.out.println(100);          // Continues execution
    }
}
```

#### Example 3: Handling Null Values with Optional
```java
import java.util.Optional;

public class C {
    int c = 100;

    public static void main(String[] args) {
        C c1 = null;
        Optional<C> c2 = Optional.ofNullable(c1);
        System.out.println(c2.isPresent()); // Returns false because c1 is null
        System.out.println(122);           // Continues execution
    }
}
```
 
---

## Common Questions on `Optional`

### **1. What is Optional in Java 8?**
`Optional` is a container object that may or may not contain a non-null value.
- If a value is present, `isPresent()` returns `true`.
- You can use the `get()` method to retrieve the value, or handle the absence of a value gracefully.

### **2. What are the uses of Optional?**
- Avoid `NullPointerException` in an application.
- Performs null-checks at compile-time, preventing runtime exceptions for `null` values.
- Reduces boilerplate code by removing unnecessary null checks.
- Handles default cases for `null` values.

### **3. Which method in Optional provides a fallback mechanism for null values?**
- Use **`orElseGet()`** to provide a fallback mechanism when the `Optional` contains a `null` value.  
  Example:
  ```java
  String result = Optional.ofNullable(null).orElseGet(() -> "Fallback value");
  System.out.println(result); // Output: Fallback value
  ```
```markdown
# MCQs on `Optional` Class in Java 8

### **1. What is the purpose of the `Optional` class in Java?**  
a) To create immutable classes  
b) To avoid `NullPointerException`  
c) To replace all null values in Java  
d) To improve performance  

**Answer:** b) To avoid `NullPointerException`

---

### **2. Which method creates an empty `Optional` instance?**  
a) `Optional.of()`  
b) `Optional.empty()`  
c) `Optional.ofNullable()`  
d) `Optional.isEmpty()`  

**Answer:** b) `Optional.empty()`

---

### **3. What does the `Optional.ofNullable()` method do?**  
a) Throws an exception if the value is null  
b) Returns an empty `Optional` if the value is null  
c) Always returns a non-empty `Optional`  
d) Does not check for null values  

**Answer:** b) Returns an empty `Optional` if the value is null

---

### **4. Which method in the `Optional` class provides a fallback mechanism in case of a null value?**  
a) `orElse()`  
b) `get()`  
c) `orElseGet()`  
d) `isPresent()`  

**Answer:** c) `orElseGet()`

---

### **5. What will be the output of the following code?**  
```java
Optional<String> opt = Optional.ofNullable(null);
System.out.println(opt.isPresent());
```  
a) `true`  
b) `false`  
c) `null`  
d) Compilation error

**Answer:** b) `false`

---

### **6. What does the `isPresent()` method do?**
a) Returns the value if present  
b) Checks if the `Optional` contains a value  
c) Returns `null` if the value is not present  
d) Throws an exception for null values

**Answer:** b) Checks if the `Optional` contains a value

---

### **7. What happens if you call `get()` on an empty `Optional`?**
a) Returns `null`  
b) Throws a `NullPointerException`  
c) Throws a `NoSuchElementException`  
d) Returns a default value

**Answer:** c) Throws a `NoSuchElementException`

---

### **8. Which of the following is a correct way to handle an optional value?**
a) `opt.get()`  
b) `opt.orElse("default")`  
c) `if(opt.isEmpty()) { ... }`  
d) Both b and c

**Answer:** d) Both b and c

---

### **9. Which statement is true about `Optional` in Java 8?**
a) `Optional` is a replacement for `null` values.  
b) `Optional` forces the programmer to handle potential `null` values explicitly.  
c) `Optional` improves the runtime performance of Java applications.  
d) `Optional` always contains a non-null value.

**Answer:** b) `Optional` forces the programmer to handle potential `null` values explicitly.

---

### **10. What does the `orElse()` method do?**
a) Throws an exception if the `Optional` is empty  
b) Provides a default value if the `Optional` is empty  
c) Returns the wrapped value without checking  
d) Converts an empty `Optional` to `null`

**Answer:** b) Provides a default value if the `Optional` is empty
```
--- 


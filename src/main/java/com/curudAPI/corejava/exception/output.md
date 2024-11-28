
---

### 1. **Basic Exception Handling**
```java
public class Test {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("After division");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 2. **Multiple Catch Blocks**
```java
public class Test {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 30;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 3. **Finally Block Execution**
```java
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
        } finally {
            System.out.println("Finally block");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 4. **Exception in Finally Block**
```java
public class Test {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("In try block");
            return;
        } finally {
            System.out.println("In finally block");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 5. **Throwing an Exception**
```java
public class Test {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Custom message");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 6. **Multiple Exceptions**
```java
public class Test {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("General Exception");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 7. **Catch Block Without Exception**
```java
public class Test {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Division successful");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 8. **NullPointerException Handling**
```java
public class Test {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 9. **Checked vs Unchecked Exception**
```java
import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
```
- **Question:** What will be the output of the above code?

---

### 10. **Finally Block With Return**
```java
public class Test {
    public static void main(String[] args) {
        System.out.println(getValue());
    }

    public static int getValue() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
}
```
- **Question:** What will be the output of the above code?

---


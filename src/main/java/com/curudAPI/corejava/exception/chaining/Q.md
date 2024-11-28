### 11. **What is exception chaining in Java?**
- Discuss how one exception can cause another exception and how to link them.
- **Answer:** Exception chaining allows you to associate an exception (cause) with another exception. 
- This is done using the constructor of `Throwable` or `Exception` that accepts a cause.
   ```java
   public Exception(String message, Throwable cause) {
       super(message, cause);
   }
   ```

```java
class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChainingCustom {
    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    static void method1() throws CustomException {
        try {
            method2();
        } catch (Exception e) {
            throw new CustomException("CustomException in method1", e);
        }
    }

    static void method2() throws Exception {
        throw new Exception("Exception in method2");
    }
}
```
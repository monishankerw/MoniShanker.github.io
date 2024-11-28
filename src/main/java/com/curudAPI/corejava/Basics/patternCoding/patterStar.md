Here are different types of pattern programs in Java with code examples:

### 1. **Simple Pyramid Pattern**

```java
public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### 2. **Inverted Pyramid Pattern**

```java
public class InvertedPyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### 3. **Right-Angle Triangle Pattern**

```java
public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### 4. **Inverted Right-Angle Triangle Pattern**

```java
public class InvertedRightAngleTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### 5. **Diamond Pattern**

```java
public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5;
        
        // Upper triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower triangle
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

### 6. **Number Pyramid Pattern**

```java
public class NumberPyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
```

### 7. **Floyd’s Triangle**

```java
public class FloydTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
```

### 8. **Pascal's Triangle**

```java
public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
```

### 9. **Right Triangle Alphabet Pattern**

```java
public class RightTriangleAlphabetPattern {
    public static void main(String[] args) {
        char last = 'E', alphabet = 'A';
        for (int i = 1; i <= (last - 'A' + 1); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}
```

### 10. **Reverse Number Pattern**

```java
public class ReverseNumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```


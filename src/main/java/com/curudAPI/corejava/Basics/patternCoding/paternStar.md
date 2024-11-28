
### 1. **Simple Star Pattern (Easy)**

#### Code:
```java
public class SimpleStarPattern {
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

#### Output:
```
* 
* * 
* * * 
* * * * 
* * * * * 
```

---

### 2. **Inverted Star Pattern (Easy)**

#### Code:
```java
public class InvertedStarPattern {
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

#### Output:
```
* * * * * 
* * * * 
* * * 
* * 
* 
```

---

### 3. **Right-Angle Triangle of Numbers (Medium)**

#### Code:
```java
public class NumberTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

#### Output:
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

---

### 4. **Pyramid Star Pattern (Medium)**

#### Code:
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

#### Output:
```
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
```

---

### 5. **Inverted Pyramid Pattern (Medium)**

#### Code:
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

#### Output:
```
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
```

---

### 6. **Floyd’s Triangle (Medium-Hard)**

#### Code:
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

#### Output:
```
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
```

---

### 7. **Diamond Star Pattern (Hard)**

#### Code:
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

#### Output:
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

---

### 8. **Pascal's Triangle (Hard)**

#### Code:
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

#### Output:
```
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
```

---

### 9. **Hollow Diamond Pattern (Hard)**

#### Code:
```java
public class HollowDiamondPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Upper half of diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half of diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
```

#### Output:
```
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
```

---

### 10. **Number Pyramid Pattern (Hard)**

#### Code:
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

#### Output:
```
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
```

---


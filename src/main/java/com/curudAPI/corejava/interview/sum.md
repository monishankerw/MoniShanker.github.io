Here is a detailed explanation in Markdown format, explaining each line of the Java code:

---

### Sum of Non-Duplicate Elements in an Array

#### Introduction:
This Java program is designed to find the sum of all elements in an array that do not have duplicates. It achieves this by using a `HashMap` to track the frequency of each element and then summing the elements that appear only once.

---

### Code Explanation:

```java
package com.crudExample.corejava.interview;
```
- **Line 1:** Declares the package name where the class resides. This helps in organizing the classes within a project.

```java
import java.util.HashMap;
import java.util.Map;
```
- **Line 2-3:** Imports the `HashMap` and `Map` classes from the `java.util` package. These are necessary for creating and manipulating the map that will store the frequency of each element in the array.

```java
public class SumOfNotDuplicateElements {
```
- **Line 4:** Declares a public class named `SumOfNotDuplicateElements`. This class contains the main logic of the program.

```java
    public static void main(String[] args) {
```
- **Line 5:** Defines the `main` method, which is the entry point of the Java application.

```java
        int arr[] = {1, 2, 1, 2, 3, 4, 5, 5};
```
- **Line 6:** Declares and initializes an integer array `arr` with elements. This array contains some duplicate values, and the program will calculate the sum of the non-duplicate elements.

```java
        sumOfWithOutReapetedElements(arr);
```
- **Line 7:** Calls the method `sumOfWithOutReapetedElements`, passing the array `arr` as an argument. This method will perform the logic to calculate the sum of non-duplicate elements.

```java
    }
```
- **Line 8:** Closes the `main` method.

```java
    private static void sumOfWithOutReapetedElements(int[] arr) {
```
- **Line 9:** Defines a private static method `sumOfWithOutReapetedElements` that takes an integer array `arr` as a parameter. This method contains the logic to find the sum of non-duplicate elements.

```java
        int sum = 0;
```
- **Line 10:** Initializes an integer variable `sum` to `0`. This variable will hold the sum of the non-duplicate elements.

```java
        Map<Integer, Integer> map = new HashMap<>();
```
- **Line 11:** Creates a `HashMap` named `map`. The keys in this map will be the elements of the array, and the values will be the count of how many times each element appears.

```java
        for (int i = 0; i < arr.length; i++) {
```
- **Line 12:** Starts a `for` loop that iterates over each element in the array `arr`. The loop runs from `0` to `arr.length - 1`.

```java
            if (map.containsKey(arr[i])) {
```
- **Line 13:** Checks if the current element `arr[i]` is already present in the `map` as a key.

```java
                map.put(arr[i], map.get(arr[i]) + 1);
```
- **Line 14:** If the element is already a key in the map, it increments the value associated with that key by `1`, indicating that this element has been encountered again.

```java
            } else {
                map.put(arr[i], 1);
```
- **Line 15-16:** If the element is not already a key in the map, it adds the element as a key with a value of `1`, indicating that this element has been encountered for the first time.

```java
        }
```
- **Line 17:** Closes the `for` loop after iterating through all elements in the array.

```java
        for (int key : map.keySet()) {
```
- **Line 18:** Starts another `for` loop that iterates over each key in the map. `map.keySet()` returns a set of all keys in the map.

```java
            if (map.get(key) == 1) {
```
- **Line 19:** Checks if the value associated with the current key is `1`. If true, it means the element appears only once in the array.

```java
                sum += key;
```
- **Line 20:** Adds the key (the element from the array) to the `sum` if it appears only once.

```java
            }
        }
```
- **Line 21-22:** Closes the `if` statement and the `for` loop after iterating through all keys in the map.

```java
        System.out.println("Sum of non-duplicate elements: " + sum);
```
- **Line 23:** Prints the final sum of the non-duplicate elements.

```java
    }
```
- **Line 24:** Closes the `sumOfWithOutReapetedElements` method.

```java
}
```
- **Line 25:** Closes the `SumOfNotDuplicateElements` class.

---

#### Example Output:
For the array `{1, 2, 1, 2, 3, 4, 5, 5}`, the program will output:

```
Sum of non-duplicate elements: 7
```
This is because `3` and `4` are the only elements that do not repeat, and their sum is `7`.

---

This Markdown file provides a line-by-line explanation of the `SumOfNotDuplicateElements` program, detailing the logic and functionality of each part of the code.
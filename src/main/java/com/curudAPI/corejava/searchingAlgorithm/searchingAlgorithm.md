### Binary Search in Java

**Binary Search** is an efficient algorithm to search for a key in a **sorted array** by repeatedly dividing the search interval in half. The basic idea behind binary search is to compare the target value to the middle element of the array. If the target value matches the middle element, the search is complete. Otherwise, the algorithm eliminates half of the array from consideration, and the search continues on the remaining half.

### Steps Involved:
1. **Start with the middle element** of the array.
2. If the middle element is equal to the target value, return its index.
3. If the target value is **less than the middle element**, repeat the search on the left half.
4. If the target value is **greater than the middle element**, repeat the search on the right half.
5. Repeat until the target is found or the search interval is empty (indicating the target is not in the array).

### Example Diagram

Let's say we have the following sorted array:
```
Array = [10, 20, 30, 40, 50, 60, 70]
Target = 40
```

**Step-by-step Process**:

1. **Step 1**: Initial search range is the entire array.
    - Mid = (0 + 6) / 2 = 3 → Array[3] = 40.
    - Since the middle element (40) equals the target, return the index `3`.

### Visual Representation of Binary Search

```
Array = [10, 20, 30, 40, 50, 60, 70]
Indices =  [0,  1,  2,  3,  4,  5,  6]

Initial range: 0 to 6
Mid element (index 3) = 40, Target = 40 (Match Found)
```

### Binary Search Code in Java

```java
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If target is smaller, ignore the right half
            if (arr[mid] > target) {
                high = mid - 1;
            }
            // If target is larger, ignore the left half
            else {
                low = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
```

### Key Points:

- **Time Complexity**: O(log n), where `n` is the number of elements in the array. The reason for this is that in each step, the array is divided into two halves, reducing the problem size by half.

- **Space Complexity**: O(1), as the algorithm works in-place (no additional data structures are required).

### Summary:
Binary Search is an efficient algorithm used to find the position of a target value in a **sorted array**. It works by repeatedly dividing the search range in half, drastically reducing the number of comparisons compared to linear search. It has a time complexity of O(log n), making it much faster than linear search for large datasets.

Would you like me to further explain or clarify any part?
Here is the complete code for the "Two Sum" problem:

```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the nums array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // The number we need to find
            
            // Check if the complement is in the map
            if (map.containsKey(complement)) {
                // If we find it, return the indices of the current number and the complement
                return new int[] { map.get(complement), i };
            }
            
            // If complement not found, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found (though the problem guarantees there is one)
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

### How it works:
1. A `HashMap` is used to store each number and its index as we iterate through the array.
2. For each number `nums[i]`, we calculate the `complement` as `target - nums[i]`.
3. If the `complement` exists in the map, we return the indices of the current number and the complement.
4. Otherwise, we store the current number and its index in the map and continue checking the next number.
5. The problem guarantees exactly one valid solution, so it will always find the answer before finishing the loop.

### Example 1:
```java
nums = [2, 7, 11, 15], target = 9
Output: [0, 1] // Because nums[0] + nums[1] == 9
```
```
```


You can solve this problem by maintaining two pointers. One pointer (`i`) will traverse the array, and the other pointer (`j`) will point to the location where the next unique element should be placed. As you traverse the array, whenever you find a new unique element (i.e., an element different from the one before it), you move that element to the position pointed by `j`.

Here's how you can implement this in Java:

```java
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) return 0;

        // Start j at 1 since the first element is always unique
        int j = 1;

        // Traverse the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];  // Move it to the position j
                j++;  // Increment j for the next unique element
            }
        }

        // Return the number of unique elements
        return j;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int result1 = removeDuplicates(nums1);
        System.out.println("Output: " + result1 + ", nums = " + java.util.Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result2 = removeDuplicates(nums2);
        System.out.println("Output: " + result2 + ", nums = " + java.util.Arrays.toString(nums2));
    }
}
```

### Explanation:

1. **Base Case**: If the array is empty, return 0.
2. **Two-pointer approach**:
    - Pointer `i` is used to traverse the array starting from the second element.
    - Pointer `j` keeps track of where the next unique element should go.
3. If the current element is different from the previous one (`nums[i] != nums[i - 1]`), it is unique, so place it at position `j` and increment `j`.
4. At the end of the traversal, `j` will be the count of unique elements.

### Example Walkthrough:

For the input array `nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]`:

- After processing, the first five elements will be `[0, 1, 2, 3, 4]`, and `j = 5`, indicating that there are 5 unique elements.

### Output:
```
Output: 2, nums = [1, 2, 2]
Output: 5, nums = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
```

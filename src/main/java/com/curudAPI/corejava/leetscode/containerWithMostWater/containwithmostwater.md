It looks like you've provided code for finding the maximum area of water a container can store, but there are a few issues. Here's a corrected version of the code with explanations for each part:

### Key points to fix:
1. The right pointer should be initialized as `height.length - 1` (not `height-length-1`).
2. The length of the container is `right - left` (not `right - 1`).
3. There is a minor typo where you're using `min-h` instead of `min_h`.

Here's the corrected version of your code:

```java
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        // Use two-pointer technique
        while (left < right) {
            int lh = height[left];
            int rh = height[right];
            
            // Calculate the current height (minimum of two heights)
            int min_h = Math.min(lh, rh);
            
            // Calculate the current width (distance between left and right)
            int width = right - left;
            
            // Calculate the area and update max if it's larger
            max = Math.max(max, min_h * width);
            
            // Move the pointer with the smaller height
            if (lh < rh) {
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}
```

### Explanation:
- **Two-pointer technique**: We initialize two pointers, `left` at the start of the array and `right` at the end. We compute the area formed between the two lines at `left` and `right` and try to maximize it by moving the pointer that has the shorter height (since moving the larger height will not give a better result).
- **Time complexity**: This approach runs in O(n), where n is the length of the array.

### Example:
For the input `height = [1, 8, 6, 2, 5, 4, 8, 3, 7]`, this code will return `49`, which is the maximum area.
package org.example.corejava.leetscode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicsPrograming {
    public static class ClimbingStairs {
        public static void main(String[] args) {
            int n = 3;
            int output = climbingStairs(n);
            System.out.println("output:" + output);
        }

        private static int climbingStairs(int n) {
            if (n <= 1)
                return 1;
            int f = 1, s = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = f + s;
                f = s;
                s = c;
            }
            return c;
        }
    }

    public static class HouseRobber {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1};
            int output = houseRobber(nums);
            System.out.println("Output:" + output);
        }

        private static int houseRobber(int[] nums) {
            if (nums.length == 0)
                return 0;
            if (nums.length == 1)
                return nums[0];
            int p1 = 0, p2 = 0;
            for (int num : nums) {
                int temp = p1;
                p1 = Math.max(p1, p2 + num);
                p2 = temp;
            }
            return p1;
        }
    }

    public static class MinCostClimbingStairs {
        public static void main(String[] args) {
            int[] costs = {10, 15, 20};
            int output = minCostClimbingStairs(costs);
            System.out.println("Output:" + output);
        }

        private static int minCostClimbingStairs(int[] costs) {
            int n = costs.length;
            if (n == 2) {
                return Math.min(costs[0], costs[1]);
            }
            int first = costs[0];
            int second = costs[1];
            for (int i = 2; i < n; i++) {

                int current = costs[i] + Math.min(first, second);
                first = second;
                second = current;
            }
            return Math.min(first, second);
        }
    }

    public static class HouseRobberII {
        public static void main(String[] args) {
            int[] arr = {2, 3, 2};
            int output = houseRobberII(arr);
            System.out.println("Output:" + output);
        }

        private static int houseRobberII(int[] arr) {
            int n = arr.length;
            if (n == 1) {
                return arr[0];

            }
            int maxProfit1 = robLinear(arr, 0, n - 2);
            int maxProfit2 = robLinear(arr, 1, n - 1);

            return Math.max(maxProfit1, maxProfit2);
        }


        private static int robLinear(int[] arr, int start, int end) {
            int prevTwo = 0;
            int prevOne = 0;
            for (int i = start; i <= end; i++) {
                int current = Math.max(prevOne, prevTwo + arr[i]);
                prevTwo = prevOne;
                prevOne = current;
            }
            return prevOne;
        }
    }

    public static class CoinChangesII {
        public static void main(String[] args) {
            int amount = 5;
            int[] coins = {1, 2, 5};
            int output = coinChangesII(amount, coins);
            System.out.println("Output:" + output);
        }

        private static int coinChangesII(int amount, int[] coins) {
            int[] dp = new int[amount + 1];
            dp[0] = 1;

            for (int coin : coins) {
                for (int j = coin; j <= amount; j++) {
                    dp[j] += dp[j - coin];
                }
            }
            return dp[amount];
        }
    }

    public static class MaximumLengthOfRepatedSubarray {
        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3, 2, 1};
            int[] nums2 = {3, 2, 1, 4, 7};
            int output = maximumLengthOfRepatedSubarray(nums1, nums2);
            System.out.println("output:" + output);
        }

        private static int maximumLengthOfRepatedSubarray(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int[][] dp = new int[m + 1][n + 1];
            int maxLength = 0;
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (nums1[i - 1] == nums2[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        maxLength = Math.max(maxLength, dp[i][j]);
                    }
                }
            }
            return maxLength;

        }
    }

    public static class LongestValidParentheses {
        public int longestValidParentheses(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }

            int n = s.length();
            int[] dp = new int[n];
            int maxLength = 0;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == ')') {
                    if (s.charAt(i - 1) == '(') {
                        dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                    } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = dp[i - 1] + ((i - dp[i - 1] >= 2) ? dp[i - dp[i - 1] - 2] : 0) + 2;
                    }
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            LongestValidParentheses solution = new LongestValidParentheses();

            // Example 1
            System.out.println(solution.longestValidParentheses("(()")); // Output: 2

            // Example 2
            System.out.println(solution.longestValidParentheses(")()())")); // Output: 4

            // Example 3
            System.out.println(solution.longestValidParentheses("")); // Output: 0
        }
    }

    public static class OneAndZeroes {
        public static void main(String[] args) {
            // Input strings and constraints
            String[] str = {"10", "0001", "111001", "1", "0"};
            int m = 5, n = 3;

            // Creating an instance and invoking the function
            OneAndZeroes oneAndZeroes = new OneAndZeroes();
            String output = String.valueOf(oneAndZeroes.oneAndZeroess(str, m, n));
            System.out.println("Output: " + output); // Final output
        }

        private int oneAndZeroess(String[] str, int m, int n) {
            // Initialize a DP table with dimensions (m+1) x (n+1)
            int[][] dp = new int[m + 1][n + 1];

            // Process each string in the input array
            for (String strs : str) {
                // Count 0's and 1's in the current string
                int count0 = 0, count1 = 0;
                for (char c : strs.toCharArray()) {
                    if (c == '0') count0++;
                    else if (c == '1') count1++;
                }

                // Print counts for current string
                System.out.println("Processing string: " + strs);
                System.out.println("Count of 0's: " + count0 + ", Count of 1's: " + count1);

                // Update the DP table from bottom-right to top-left
                for (int i = m; i >= count0; i--) {
                    for (int j = n; j >= count1; j--) {
                        dp[i][j] = Math.max(dp[i][j], 1 + dp[i - count0][j - count1]);
                        System.out.println(
                                "Updated dp[" + i + "][" + j + "] = " + dp[i][j] +
                                        " using dp[" + (i - count0) + "][" + (j - count1) + "]");
                    }
                }

                // Print DP table after processing the string
                System.out.println("DP table after processing " + strs + ":");
                for (int[] row : dp) {
                    for (int val : row) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                }
            }

            // The final result is stored in dp[m][n]
            return dp[m][n];
        }
    }


    public static class Triangle {
        public static int minimumTotal(List<List<Integer>> triangle) {
            for (int i = triangle.size() - 2; i >= 0; i--) {
                for (int j = 0; j < triangle.get(i).size(); j++) {
                    int minPath = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                    triangle.get(i).set(j, triangle.get(i).get(j) + minPath);
                }
            }
            return triangle.get(0).get(0);
        }

        public static void main(String[] args) {
            List<List<Integer>> triangle = new ArrayList<>();
            triangle.add(Arrays.asList(2));
            triangle.add(Arrays.asList(3, 4));
            triangle.add(Arrays.asList(6, 5, 7));
            triangle.add(Arrays.asList(4, 1, 8, 3));

            int result = minimumTotal(triangle);
            System.out.println("Minimum Path Sum: " + result);
        }
    }
    public static class JumpGameII{
        public static void main(String[] args) {

        int input[]={2,3,1,1,4};
        JumpGameII jumpGameII=new JumpGameII();
     int output;
            output = jumpGameII.jumpGamesII(input);
            System.out.println("Output::"+output);
    }

        private int jumpGamesII(int[] input) {
            int n=input.length;
            if(n==1)
                return 0;
            int jumps=0;
            int farthest=0;
            int currentEnd=0;
            for (int i=0;i<n-1;i++){
                farthest=Math.max(farthest,i+input[i]);
                if(i==currentEnd){
                    jumps++;
                    currentEnd=farthest;
                    if(currentEnd>=n-1)
                        break;
                }
            }
            return jumps;
        }
        }
   public static class UniquePaths {
        // Method to calculate unique paths with debug statements
        public int uniquePaths(int m, int n) {
            // Use a 1D array to save space
            int[] dp = new int[n];

            // Initialize all columns in the first row to 1
            for (int j = 0; j < n; j++) {
                dp[j] = 1; // Only one way to move right in the first row
            }
            System.out.println("Initial dp array: " + java.util.Arrays.toString(dp));

            // Update the DP array row by row
            for (int i = 1; i < m; i++) { // Start from the second row
                System.out.println("Processing row: " + (i + 1)); // Row is 1-based index
                for (int j = 1; j < n; j++) { // Start from the second column
                    dp[j] += dp[j - 1]; // Add the value from the left cell
                    System.out.println("Updated dp[" + j + "] = " + dp[j] +
                            " (from dp[" + (j - 1) + "] and previous dp[" + j + "])");
                }
                System.out.println("dp array after processing row " + (i + 1) + ": " + java.util.Arrays.toString(dp));
            }

            // The result is in the last cell of the DP array
            System.out.println("Final dp array: " + java.util.Arrays.toString(dp));
            return dp[n - 1];
        }

        public static void main(String[] args) {
            // Create an instance of the Solution class
            UniquePaths solution = new UniquePaths();

            // Test Case 1: m = 3, n = 7
            int m1 = 3, n1 = 7;
            System.out.println("Unique paths for grid 3x7: " + solution.uniquePaths(m1, n1)); // Expected: 28

            // Test Case 2: m = 3, n = 2
            int m2 = 3, n2 = 2;
            System.out.println("Unique paths for grid 3x2: " + solution.uniquePaths(m2, n2)); // Expected: 3

            // Test Case 3: m = 7, n = 3
            int m3 = 7, n3 = 3;
            System.out.println("Unique paths for grid 7x3: " + solution.uniquePaths(m3, n3)); // Expected: 28
        }
    }
   public static class UniquePathsWithObstacles {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;

            System.out.println("Input obstacle grid:");
            for (int[] row : obstacleGrid) {
                System.out.println(java.util.Arrays.toString(row));
            }

            // Edge case: If the starting cell or ending cell is an obstacle, return 0
            if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
                System.out.println("Either the start or end cell is blocked. Returning 0.");
                return 0;
            }

            // Initialize a 1D DP array
            int[] dp = new int[n];
            dp[0] = 1; // Starting point

            System.out.println("Initial dp array: " + java.util.Arrays.toString(dp));

            // Fill the DP array row by row
            for (int i = 0; i < m; i++) {
                System.out.println("Processing row: " + i);
                for (int j = 0; j < n; j++) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[j] = 0; // No path through an obstacle
                        System.out.println("Obstacle at (" + i + ", " + j + "). Setting dp[" + j + "] = 0");
                    } else if (j > 0) {
                        dp[j] += dp[j - 1];
                        System.out.println("Updating dp[" + j + "] = dp[" + j + "] + dp[" + (j - 1) + "] = " + dp[j]);
                    }
                }
                System.out.println("dp array after processing row " + i + ": " + java.util.Arrays.toString(dp));
            }

            System.out.println("Final dp array: " + java.util.Arrays.toString(dp));
            return dp[n - 1];
        }

        public static void main(String[] args) {
            UniquePathsWithObstacles solution = new UniquePathsWithObstacles();

            // Test Case 1
            int[][] obstacleGrid1 = {
                    {0, 0, 0},
                    {0, 1, 0},
                    {0, 0, 0}
            };
            System.out.println("Unique paths for grid 1: " + solution.uniquePathsWithObstacles(obstacleGrid1) + "\n");

            // Test Case 2
            int[][] obstacleGrid2 = {
                    {0, 1},
                    {0, 0}
            };
            System.out.println("Unique paths for grid 2: " + solution.uniquePathsWithObstacles(obstacleGrid2) + "\n");

            // Test Case 3: Edge case with obstacle at start
            int[][] obstacleGrid3 = {
                    {1}
            };
            System.out.println("Unique paths for grid 3: " + solution.uniquePathsWithObstacles(obstacleGrid3) + "\n");

            // Test Case 4: Edge case with 1x1 grid with no obstacles
            int[][] obstacleGrid4 = {
                    {0}
            };
            System.out.println("Unique paths for grid 4: " + solution.uniquePathsWithObstacles(obstacleGrid4) + "\n");

            // Test Case 5: Larger grid with obstacles
            int[][] obstacleGrid5 = {
                    {0, 0, 0, 0},
                    {0, 1, 0, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 0}
            };
            System.out.println("Unique paths for grid 5: " + solution.uniquePathsWithObstacles(obstacleGrid5) + "\n");
        }
    }
    public static class MinPathSum {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            // Initialize a DP array with the same size as the grid
            int[][] dp = new int[m][n];

            // Base case: Starting point
            dp[0][0] = grid[0][0];

            // Fill the first row
            for (int j = 1; j < n; j++) {
                dp[0][j] = dp[0][j - 1] + grid[0][j];
            }

            // Fill the first column
            for (int i = 1; i < m; i++) {
                dp[i][0] = dp[i - 1][0] + grid[i][0];
            }

            // Fill the rest of the DP table
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }

            // The result is in the bottom-right corner of the DP table
            return dp[m - 1][n - 1];
        }

        public static void main(String[] args) {
            MinPathSum solution = new MinPathSum();

            // Test Case 1
            int[][] grid1 = {
                    {1, 3, 1},
                    {1, 5, 1},
                    {4, 2, 1}
            };
            System.out.println("Minimum path sum for grid 1: " + solution.minPathSum(grid1)); // Expected: 7

            // Test Case 2
            int[][] grid2 = {
                    {1, 2, 3},
                    {4, 5, 6}
            };
            System.out.println("Minimum path sum for grid 2: " + solution.minPathSum(grid2)); // Expected: 12
        }
    }
    public static class MinDistance {
        public int minDistance(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();

            // Use a 1D DP array
            int[] dp = new int[n + 1];

            // Initialize for the base case
            for (int j = 0; j <= n; j++) {
                dp[j] = j;
            }

            for (int i = 1; i <= m; i++) {
                int prev = dp[0]; // Store the previous row's dp[j-1]
                dp[0] = i; // Update dp[0] for the current row
                for (int j = 1; j <= n; j++) {
                    int temp = dp[j];
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[j] = prev;
                    } else {
                        dp[j] = 1 + Math.min(dp[j], Math.min(dp[j - 1], prev));
                    }
                    prev = temp;
                }
            }

            return dp[n];
        }
    }

    public class Main {
        public static void main(String[] args) {
            MinDistance solution = new MinDistance();

            // Test Case 1
            String word1 = "horse";
            String word2 = "ros";
            System.out.println("Minimum operations to convert '" + word1 + "' to '" + word2 + "': "
                    + solution.minDistance(word1, word2)); // Expected: 3

            // Test Case 2
            word1 = "intention";
            word2 = "execution";
            System.out.println("Minimum operations to convert '" + word1 + "' to '" + word2 + "': "
                    + solution.minDistance(word1, word2)); // Expected: 5

            // Test Case 3 (Edge Case)
            word1 = "abc";
            word2 = "";
            System.out.println("Minimum operations to convert '" + word1 + "' to an empty string: "
                    + solution.minDistance(word1, word2)); // Expected: 3

            // Test Case 4 (Edge Case)
            word1 = "abc";
            word2 = "abc";
            System.out.println("Minimum operations to convert '" + word1 + "' to '" + word2 + "': "
                    + solution.minDistance(word1, word2)); // Expected: 0

            // Test Case 5 (Empty Strings)
            word1 = "";
            word2 = "";
            System.out.println("Minimum operations to convert an empty string to another empty string: "
                    + solution.minDistance(word1, word2)); // Expected: 0
        }
    }

   public static class NumDecodings {
        public int numDecodings(String s) {
            if (s == null || s.length() == 0) {
                System.out.println("Input string is empty or null.");
                return 0;
            }

            int n = s.length();
            int prev2 = 1; // Represents dp[i-2]
            int prev1 = s.charAt(0) != '0' ? 1 : 0; // Represents dp[i-1]

            System.out.println("Initial dp values: prev2 = " + prev2 + ", prev1 = " + prev1);

            for (int i = 2; i <= n; i++) {
                int current = 0;

                // Single-digit decoding
                if (s.charAt(i - 1) != '0') {
                    current += prev1;
                    System.out.println("Single-digit decoding possible for '" + s.charAt(i - 1) + "', adding prev1 = " + prev1);
                }

                // Two-digit decoding
                int twoDigit = Integer.parseInt(s.substring(i - 2, i));
                if (twoDigit >= 10 && twoDigit <= 26) {
                    current += prev2;
                    System.out.println("Two-digit decoding possible for '" + s.substring(i - 2, i) + "', adding prev2 = " + prev2);
                }

                // Update prev2 and prev1
                prev2 = prev1;
                prev1 = current;

                System.out.println("After index " + i + ": prev2 = " + prev2 + ", prev1 = " + prev1 + ", current = " + current);
            }

            System.out.println("Final number of ways to decode: " + prev1);
            return prev1;
        }



        public static void main(String[] args) {
            NumDecodings solution = new NumDecodings();

            // Test Case 1
            String s1 = "12";
            System.out.println("\nInput: " + s1);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s1));

            // Test Case 2
            String s2 = "226";
            System.out.println("\nInput: " + s2);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s2));

            // Test Case 3
            String s3 = "06";
            System.out.println("\nInput: " + s3);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s3));

            // Test Case 4
            String s4 = "10";
            System.out.println("\nInput: " + s4);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s4));

            // Test Case 5
            String s5 = "2101";
            System.out.println("\nInput: " + s5);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s5));

            // Test Case 6
            String s6 = "11106";
            System.out.println("\nInput: " + s6);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s6));

            // Edge Case: Empty string
            String s7 = "";
            System.out.println("\nInput: " + s7);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s7));

            // Edge Case: Single character '0'
            String s8 = "0";
            System.out.println("\nInput: " + s8);
            System.out.println("Number of ways to decode: " + solution.numDecodings(s8));
        }
    }

}


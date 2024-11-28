Pascal's Triangle is a triangular array of numbers where each number is the sum of the two directly above it. It has applications in algebra, probability, and combinatorics.

### Structure of Pascal's Triangle:

1. **First Row**: The topmost row is a single `1`.
2. **Subsequent Rows**: Each row starts and ends with `1`. The other numbers are obtained by adding the two numbers directly above.

### Example of Pascal's Triangle:

```
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 1 5 10 10 5 1
```

### How It Works:
- **First Row**: Just the number `1`.
- **Second Row**: Two `1`s.
- **Third Row**: The middle number is `1+1 = 2`.
- **Fourth Row**: The second number is `1+2 = 3`, and the third is `2+1 = 3`.
- This pattern continues indefinitely.

### Mathematical Representation:
The value at row `n` and position `k` (starting from 0) in Pascal's Triangle is given by the binomial coefficient:

\[
\text{Value} = \binom{n}{k} = \frac{n!}{k!(n-k)!}
\]

Where:
- \( n! \) is the factorial of `n`.
- \( k! \) is the factorial of `k`.

### Applications of Pascal's Triangle:

1. **Binomial Expansion**:
    - The coefficients of the terms in the expansion of \((a + b)^n\) are the numbers in the `n`th row of Pascal's Triangle.
    - For example, \((a + b)^2 = a^2 + 2ab + b^2\) corresponds to row 2 of Pascal's Triangle: `1 2 1`.

2. **Combinatorics**:
    - Pascal's Triangle is used to calculate combinations, such as selecting `k` elements from a set of `n` elements (\(\binom{n}{k}\)).

3. **Probability**:
    - In probability theory, Pascal's Triangle helps in calculating the probabilities of different outcomes in binomial distributions.

### Java Implementation:
Here's how you might generate Pascal's Triangle in Java:

```java
public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print
        int[][] triangle = new int[rows][rows];

        // Generate Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1; // The first and last elements are always 1
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
```

### Explanation:
- The code generates `rows` number of rows in Pascal's Triangle.
- The `triangle` array stores the values, and each value is calculated based on the sum of the two directly above it.
- The outer loop iterates over rows, while the inner loop fills in each row's values.

### Output:
For `rows = 5`, the output will be:
```
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
```


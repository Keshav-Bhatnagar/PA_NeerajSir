## 01. Sum Nodes on Longest Path

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1)

### Problem Description

**Task:** Given a binary tree root[], you need to find the sum of the nodes on the longest path from the root to any leaf node. If two or more paths have the same length, the path with the maximum sum of node values should be considered.Examples:Input: root[] = [4, 2, 5, 7, 1, 2, 3, N, N, 6, N]

#### Examples

##### Example 1

- **Output:**
```text
13 The highlighted nodes (4, 2, 1, 6) above are part of the longest root to leaf path having sum = (4 + 2 + 1 + 6) = 13Input: root[] = [1, 2, 3, 4, 5, 6, 7]Output: 11Explanation: The longest root-to-leaf path is 1 - > 3 - > 7, with sum 11.Input: root[] = [10, 5, 15, 3, 7, N, 20, 1]Output: 19Explanation: The longest root-to-leaf path is 10 - > 5 - > 3 - > 1 with a sum of 10 + 5 + 3 + 1 = 19.
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-26 16:30:37
- **Status:** Correct
- **Marks:** 4

```java
/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;

    }
} */
class Solution {
    int maxLen = 0;
    int maxSum = 0;

    public int sumOfLongRootToLeafPath(Node root) {
        solve(root, 0, 0);
        return maxSum;
    }

    void solve(Node root, int len, int sum) {
        if (root == null) {
            return;
        }

        len++;
        sum += root.data;

        if (root.left == null && root.right == null) {
            if (len > maxLen) {
                maxLen = len;
                maxSum = sum;
            } else if (len == maxLen) {
                maxSum = Math.max(maxSum, sum);
            }
            return;
        }

        solve(root.left, len, sum);
        solve(root.right, len, sum);
    }
}
```

*Generated on: 10/26/2026, 4:35:43 PM*
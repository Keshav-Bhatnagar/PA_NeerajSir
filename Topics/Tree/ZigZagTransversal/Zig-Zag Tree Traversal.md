## 01. Zig-Zag Tree Traversal

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/zigzag-tree-traversal/1)

### Problem Description

**Task:** Given the root of a binary tree. Find the zig-zag level order traversal of the binary tree. Note: In zig zag traversal we traverse the nodes from left to right for odd-numbered levels, and from right to left for even-numbered levels.

#### Examples

##### Example 1

- **Input:**
```text
root = [1, 2, 3, 4, 5, 6, 7]
```
- **Output:**
```text
[1, 3, 2, 4, 5, 6, 7]Explanation:Level 1 (left to right): [1]Level 2 (right to left): [3, 2]Level 3 (left to right): [4, 5, 6, 7]Final result: [1, 3, 2, 4, 5, 6, 7]
```

##### Example 2

- **Input:**
```text
root = [7, 9, 7, 8, 8, 6, N, 10, 9]
```
- **Output:**
```text
[7, 7, 9, 8, 8, 6, 9, 10] Explanation:Level 1 (left to right): [7]Level 2 (right to left): [7, 9]Level 3 (left to right): [8, 8, 6]Level 4 (right to left): [9, 10]Final result: [7, 7, 9, 8, 8, 6, 9, 10]
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-26 16:57:52
- **Status:** Correct
- **Marks:** 4

```java
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                level.add(curr.data);

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }

            ans.addAll(level);
            leftToRight = !leftToRight;
        }

        return ans;
    }
}
```

*Generated on: 10/26/2026, 4:59:24 PM*
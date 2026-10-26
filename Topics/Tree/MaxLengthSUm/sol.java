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
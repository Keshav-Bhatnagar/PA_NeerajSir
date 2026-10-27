/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        int sum = 0;
        sum += dfs(root, null, null);
        return sum;
    }

    public int dfs(TreeNode node, TreeNode parent, TreeNode grandparent ) {
        int sum=0;
        if (node == null) {
            return 0;
        }
        if (grandparent != null && grandparent.val % 2 == 0) {
            sum += node.val;
            IO.println(sum);
        }
        sum+=dfs(node.left, node, parent);
        sum+=dfs(node.right, node, parent);
        return sum;
    }
}
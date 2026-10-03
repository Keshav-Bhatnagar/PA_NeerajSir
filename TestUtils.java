import java.util.*;

public class TestUtils {
    
    // Print 1D Array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Print 2D Array
    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    // Print List
    public static <T> void printList(List<T> list) {
        System.out.println(list);
    }
    
    // ListNode definition commonly used in LeetCode
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Print Linked List
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        List<Integer> result = new ArrayList<>();
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        System.out.println(String.join(" -> ", result.stream().map(String::valueOf).toArray(String[]::new)));
    }

    // Build Linked List from Array
    public static ListNode buildLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // TreeNode definition commonly used in LeetCode
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

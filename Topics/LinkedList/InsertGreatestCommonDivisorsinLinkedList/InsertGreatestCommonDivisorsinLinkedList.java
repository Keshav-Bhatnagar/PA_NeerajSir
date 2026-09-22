/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode nextN = head.next;
        while (nextN != null){
            int g = gcd(curr.val, nextN.val);
            ListNode newN = new ListNode(g);
            newN.next = nextN;
            curr.next = newN;
            curr = newN.next;
            nextN = nextN.next;
        }
        return head;
    }
    public int gcd(int a, int b) {
        while (b != 0){
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
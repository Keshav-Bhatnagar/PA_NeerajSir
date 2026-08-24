import java.util.*;

public class CircularLL {
  static class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
    }
  }
  
  static Node head = null;

  static void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode; // FIX: Use the newNode we created
      head.next = head;
      return;
    }
    
    Node temp = head;
    // FIX: Check against head instead of null to prevent an infinite loop
    while (temp.next != head) {
      temp = temp.next;
    }
    
    temp.next = newNode; // Connect the old last node to the new node
    newNode.next = head; // FIX: Complete the circle by pointing new node to head
  }

  // Your recursion logic is great! Changed println to print for better tracking
  static void printReverse(Node curr, Node start) {
    // Base case: We reached the last node
    if (curr.next == start) {
      System.out.print(curr.data + " ");
      return;
    }

    printReverse(curr.next, start);
    System.out.print(curr.data + " ");
  }

  public static void main(String[] args) {
    insert(10);
    insert(20);
    insert(30);
    insert(40);
    insert(50);

    System.out.print("Reverse Circular List: ");
    printReverse(head, head);
    System.out.println();
  }
}

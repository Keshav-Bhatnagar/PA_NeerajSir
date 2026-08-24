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
      head = newNode; 
      head.next = head;
      return;
    }
    Node temp = head;
    while (temp.next != head) {
      temp = temp.next;
    }
    temp.next = newNode; 
    newNode.next = head; 
  }

  // Method to find the middle node of the Circular Linked List
  static Node findMiddle(Node head) {
    // Edge case: If list is empty, return null
    if (head == null) return null;

    Node slow = head;
    Node fast = head;

    // Fast moves 2 steps, slow moves 1 step
    // Loop stops when fast or fast.next reaches back to head
    while (fast.next != head && fast.next.next != head) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // slow is now pointing to the middle node
    return slow;
  }

  public static void main(String[] args) {
    insert(10);
    insert(20);
    insert(30);
    insert(40);
    insert(50);

    Node middle = findMiddle(head);
    if (middle != null) {
      System.out.println("The middle node data is: " + middle.data);
    } else {
      System.out.println("The list is empty.");
    }
  }
}

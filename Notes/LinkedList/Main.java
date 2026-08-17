// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
class Main {
   
    public static int Middle(Node root) {
        if(root == null ) return 0;
        Node slow=root;
        Node fast=root;
        while(fast!=null && fast.next!=null) {
           slow=slow.next;
           fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        Node temp = head;
        for(int i=8;i>=0;i--) {
            temp.next = new Node(i);
            temp=temp.next;
        }
        System.out.print(Middle(head));


    }
}
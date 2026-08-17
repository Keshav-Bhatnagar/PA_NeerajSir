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
    public static void Print(Node root) {
        if(root == null ) return ;
        while(root!=null) {
            System.out.print(root.data +" ");
            root = root.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        Node temp = head;
        for(int i=4;i>=0;i--) {
            temp.next = new Node(i);
            temp=temp.next;
        }
        Print(head);


    }
}
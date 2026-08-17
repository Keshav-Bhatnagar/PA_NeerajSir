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
   
    public static boolean SearchTarget(Node root ,int target) {
        int count =0;
        if(root == null ) return false;
        while(root!=null) {
           if(root.data==target)return true;
            root = root.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        Node temp = head;
        for(int i=8;i>=0;i--) {
            temp.next = new Node(i);
            temp=temp.next;
        }
        System.out.print(SearchTarget(head,20));


    }
}
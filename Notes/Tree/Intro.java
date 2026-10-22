// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        
    }
}
class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        this.data = d;
    }
}
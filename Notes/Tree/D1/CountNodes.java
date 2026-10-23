// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {

    public static void levelOrder(Node root) {
        if(root == null) return ;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if(curr.left != null) {
                q.add(curr.left);
            }
            if(curr.right != null) {
                q.add(curr.right);
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        levelOrder(root);
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
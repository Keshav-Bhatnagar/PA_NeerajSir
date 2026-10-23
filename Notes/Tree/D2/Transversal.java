class Node{
   int data;
   Node leftNode, rightNode;
   
   Node() {
      leftNode = null;
      rightNode = null;     
      this.data = data;
   }
   Node(int data) {
      leftNode = null;
      rightNode = null;     
      this.data = data;
   }
   int getData() {
      return this.data;	   
   }
   Node getleftNode() {
      return this.leftNode;      
   }
   Node getRightNode() {
      return this.leftNode;      
   }
   void setData(int data) {
      this.data = data; 
   }
   void setleftNode(Node leftNode) {
      this.leftNode = leftNode;      
   }
   void setRightNode(Node rightNode) {
      this.leftNode = rightNode;         
   }
}
public class Main {
   public static void main(String[] args) {
      Node node = new Node(1);
      node.leftNode = new Node(2);
      node.leftNode.leftNode = new Node(4);
      node.leftNode.rightNode = new Node(5);

      node.rightNode = new Node(3);
      node.rightNode.leftNode = new Node(6);
      node.rightNode.rightNode = new Node(7);
      System.out.println("inorder arrangement of given elements: ");
      inOrder(node);
      IO.println("");
      System.out.println("preorder arrangement of given elements: ");
      preorder(node);
      IO.println("");
      System.out.println("postorder arrangement of given elements: ");
      postorder(node);
   }
   public static void inOrder(Node root) {
      if(root !=null) {
         inOrder(root.leftNode);
         System.out.print(root.data+" ");
         inOrder(root.rightNode);         
      }
   }
   public static void preorder(Node root) {
      if(root !=null) {
         System.out.print(root.data+" ");
         preorder(root.leftNode);
         preorder(root.rightNode);         
      }
   }
   public static void postorder(Node root) {
      if(root !=null) {
         postorder(root.leftNode);
         postorder(root.rightNode);         
         System.out.print(root.data+" ");
      }
   }
}
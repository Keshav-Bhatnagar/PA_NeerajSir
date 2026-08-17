class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Main {

    public static Node Reverse(Node root) {
        if (root == null) return null;

        Node prev = null;
        Node curr = root;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void Print(Node root) {
        if (root == null) return;

        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        Node temp = head;

        for (int i = 8; i >= 0; i--) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        Print(head);
        System.out.println();
        Print(Reverse(head));
    }
}
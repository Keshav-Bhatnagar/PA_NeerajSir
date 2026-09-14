class ImplementationOfStackUsingLL {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }    
    }

    static class Stack {
        Node top;
        void push(int val) {
            Node newNode = new Node(val);
            newNode.next = top;
            top = newNode;
        }

        int pop() {
            if(top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        int peek() {
            if(top == null) {
                return -1;
            }

            return top.data;
        }
        
        void display() {
            Node temp = top;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Popped: " + st.pop());
        System.out.println("Top element: " + st.peek());
    }
}
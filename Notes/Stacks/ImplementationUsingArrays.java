class ImplementationOfStackUsingArray {
    static class Stack {
        int[] arr;
        int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        void push(int value) {
            if(top == arr.length-1) {
                System.out.println("Stack Overflow");
                return;
            }

            arr[++top] = value;
        }

        int pop() {
            if(top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        int peek() {
            if(top == -1) {
                return -1;
            }

            return arr[top];
        }

        void display() {
            for(int i=top; i>=0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
    }
}
class QueueUsingArray{

    int[] arr;
    int front, rear, size;

    QueueUsingArray(int size) {
        this.size = size;
        this.arr = new int[size];
        front = rear = -1;
    }

    public void enqueue(int val) {
        if(rear == size-1) {
            System.out.println("Queue Overflow");
            return;
        }

        if(front == -1) {
            front = 0;
        }

        arr[++rear] = val;
        System.out.println(val + " Inserted");
    }

    public void dequeue() {
        if(front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " Removed");
        front++;
    }

    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element: " + arr[front]);
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        for(int i=front; i<=rear; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        q.peek();

    }
}
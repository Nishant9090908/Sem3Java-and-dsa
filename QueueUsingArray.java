class Queue {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;

    void initialization(int n){
        arr = new int[n];
        size = n;
    }

    // Checking if the Queue is empty
    boolean isEmpty(){
        return front == -1;
    }

    // Checking if the Queue is full
    boolean isFull(){
        return rear == size - 1;
    }

    // Enqueue
    void enqueue(int x){
        if (isFull()){
            System.out.println("The queue is full.");
            return;
        }
        // If queue was empty, set front to 0
        if (isEmpty()){
            front = 0;
        }
        arr[++rear] = x; // add element
    }

    // Dequeue
    int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty.");
            return -1;
        }
        int val = arr[front];
        if(front == rear){
            // queue becomes empty after removing the only element
            front = rear = -1;
        } else {
            front++;
        }
        return val;
    }

    // peek
    int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return -1;
        }
        return arr[front];
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.initialization(5);

        q.enqueue(12);
        q.enqueue(23);
        q.enqueue(45);

        System.out.println("Front: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    }
}

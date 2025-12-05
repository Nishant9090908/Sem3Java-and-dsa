// Node class for Linked List
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using LinkedList
class StackLL {

    Node top; // top of the stack

    StackLL() {
        top = null;
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Push operation
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        int value = top.data;
        top = top.next;  // move top pointer
        return value;
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return top.data;
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.peek());
        System.out.println("Popped: " + st.pop());
        System.out.println("Top element after pop: " + st.peek());
    }
}

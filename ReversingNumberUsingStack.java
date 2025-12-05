class Stack {
    int top;
    int[] arr;
    int size;

    // Constructor
    Stack(int n) {
        size = n;
        arr = new int[n];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top--];
    }
}

public class ReversingNumberUsingStack {
    public static void main(String[] args) {
        int num = 12345;

        // Maximum digits = 10 (int limit), so stack size 10
        Stack st = new Stack(10);

        // Push digits into stack
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            st.push(digit);
            temp /= 10;
        }

        // Pop digits to form reversed number
        int reversed = 0;
        int place = 1;

        while (!st.isEmpty()) {
            reversed += st.pop() * place;
            place *= 10;
        }

        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reversed);
    }
}

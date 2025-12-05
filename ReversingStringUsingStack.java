class CharStack1 {
    int top;
    char[] arr;
    int size;

    CharStack1(int n) {
        size = n;
        arr = new char[n];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(char x) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        arr[++top] = x;
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '\0';  // null character
        }
        return arr[top--];
    }
}

public class ReversingStringUsingStack {
    public static void main(String[] args) {

        String str = "Nishant";

        // Create stack of size = string length
        CharStack st = new CharStack(str.length());

        // Push all characters
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!st.isEmpty()) {
            reversed += st.pop();
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}

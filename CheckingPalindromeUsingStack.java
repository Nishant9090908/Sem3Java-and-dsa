class CharStack {
    int top;
    char[] arr;
    int size;

    CharStack(int n) {
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
            return '\0';
        }
        return arr[top--];
    }
}

public class CheckingPalindromeUsingStack {
    public static void main(String[] args) {

        String str = "madam";   // Try other strings also!

        // Create stack
        CharStack st = new CharStack(str.length());

        // Push all characters to stack
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        // Build reversed string
        String reversed = "";
        while (!st.isEmpty()) {
            reversed += st.pop();
        }

        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}

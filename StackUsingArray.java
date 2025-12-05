public class StackUsingArray {
    // keep top as a single static variable so methods can update it
    static int top = -1;

    // push value x onto the provided array-backed stack
    static void push(int x, int[] stack) {
        if (!isFull(stack)) {
            stack[++top] = x; // increment top then store
        } else {
            System.out.println("Stack is full.");
        }
    }

    // check full
    private static boolean isFull(int[] stack) {
        return top == stack.length - 1;
    }

    // pop and return the popped value
    static int pop(int[] stack) {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        }
        return stack[top--]; // return then decrement top
    }

    // check empty
    private static boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        int[] stack = new int[10];
        int n = stack.length; // unused but kept as in your original
        // top is already initialized to -1

        // quick test
        push(5, stack);
        push(10, stack);
        push(15, stack);

        System.out.println("Popped: " + pop(stack)); // should print 15
        System.out.println("Popped: " + pop(stack)); // should print 10

        System.out.println("Is empty? " + isEmpty()); // false
        pop(stack); // pops 5
        System.out.println("Is empty after popping all? " + isEmpty()); // true

    }
}

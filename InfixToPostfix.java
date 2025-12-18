import java.util.*;
import java.util.Stack;

public class InfixToPostfix {

    // Function to return precedence of operators
    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // If operand (letter or digit), add to result
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }

            // If '(', push to stack
            else if (ch == '(') {
                stack.push(ch);
            }

            // If ')', pop until '(' and add to result
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop(); // remove '('
            }

            // If operator
            else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators from stack to result
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String infix = sc.nextLine();
        System.out.println("Postfix: " + infixToPostfix(infix));
    }
}

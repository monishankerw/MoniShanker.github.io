package org.example.corejava.string;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String expression = "{[()]}";
        boolean isValid = isBalanced(expression);
        System.out.println("The expression \"" + expression + "\" is " + (isValid ? "balanced" : "not balanced"));
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // If the current character is an opening bracket, push it to the stack.
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // If the current character is a closing bracket, check for balance.
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }
        // If the stack is empty, all brackets were matched.
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

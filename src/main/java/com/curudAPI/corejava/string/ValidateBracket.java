package org.example.corejava.string;

import java.util.Stack;

public class ValidateBracket {
    public static void main(String[] args) {
        String s = "{([])}";
        boolean status = validateBracket(s);
        System.out.println(s);
        System.out.println(status);
    }

    private static boolean validateBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{')
                        return false;
                    stack.pop();
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(')
                        return false;
                    stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[')
                        return false;
                    stack.pop();
                    break;
                default:
                    stack.push(ch);
                    break;
            }
        }
        return stack.isEmpty();
    }
    }


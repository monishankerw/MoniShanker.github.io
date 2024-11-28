package org.example.corejava.collection.map.HashMap.logicQuestion;


/*

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the
same type.
Given a string s containing just the characters '('
,
')'
,
'{'
,
'}'
,
'[' and ']'
,
determine if the input string is valid.
An input string is valid if:
1.
2.
3.
Input: s = "()"
Output: true
Input: s = "()[]{}"
Output: true
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        ValidBrackets vb = new ValidBrackets();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";
        
        System.out.println(vb.isValid(s1)); // Output: true
        System.out.println(vb.isValid(s2)); // Output: true
        System.out.println(vb.isValid(s3)); // Output: false
        System.out.println(vb.isValid(s4)); // Output: false
        System.out.println(vb.isValid(s5)); // Output: true
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // Map to store matching pairs

        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');

        for (char c : s.toCharArray()) {
            if (matchingBrackets.containsValue(c)) {
                // If it's an opening bracket, push onto stack
                stack.push(c);
            } else if (matchingBrackets.containsKey(c)) {
                // If it's a closing bracket, check the stack
                if (stack.isEmpty() || stack.pop() != matchingBrackets.get(c)) {
                    return false;
                }
            }
        }

        // Check if stack is empty
        return stack.isEmpty();
    }
}

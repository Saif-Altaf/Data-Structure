package Stack;

import java.util.Stack;

public class Expression {
    public boolean isBalanced(String inp) {
        Stack<Character> stack = new Stack<>();
        for (char ch : inp.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}


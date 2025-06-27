package Stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String inp) {
        if (inp == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : inp.toCharArray()) {
            stack.push(ch);
        }
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return reversed;
    }
}


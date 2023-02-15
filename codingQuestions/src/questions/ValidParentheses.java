package questions;

import java.util.Stack;

/**
 * @author Ivan Lifaniça
 */

public class ValidParentheses {

    public boolean isValid(String str){

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

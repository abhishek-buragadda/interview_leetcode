import java.util.Stack;

public class ValidParanthesis {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    char topChar = stack.peek();
                    if ((c == ')' && '(' == topChar) || (c == '}' && '{' == topChar) || (c == ']' && '[' == topChar)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}

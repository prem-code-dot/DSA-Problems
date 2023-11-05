import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '(' || c == '(') {
                st.push(')');
            } else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (!st.isEmpty() && st.pop() == c) {
                flag = true;
            } else if ((!st.isEmpty() && st.pop() != c) || st.isEmpty()) {
                return false;
            }
        }
        return st.isEmpty() && flag;
    }

    public static void main(String[] args) {
        // String s = "([]){";
        // String s = "([]";
        // String s = "])";
        // String s = "[][]";
        String s = "(";
        System.out.println(isValid(s));
    }
}
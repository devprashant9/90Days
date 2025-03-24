package Foundation.Stack;

import java.util.Stack;

public class BalanceParentheses { // ((())

    public static int validParetheses(String s) {
        if (s.length() < 0 || (s.length() % 2 != 0)) {
            return -1;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            } else {
                if (st.size() > 0 && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(c);
                }
            }

        }
        return st.size();
    }

    public static void main(String[] args) {
        String s = ")()())";
        int res = validParetheses(s);
        System.out.println("Original String is: " + s);
        System.out.println("To Balance Remove Parenthese Count: " + res);
    }
}

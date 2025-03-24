package Foundation.Stack;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean validParetheses(String s) {
        if (s.length() < 0 || (s.length() % 2 != 0)) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            } else {
                if(st.size() == 0) {
                    return false;
                }
                if(st.peek() == '(') {
                    st.pop();
                }
            }

        }
        System.out.println(st);

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")()(((())))";
        boolean res = validParetheses(s);
        System.out.println("Original String is: " +s);
        System.out.println("The Given String is: " +res);
    }
}

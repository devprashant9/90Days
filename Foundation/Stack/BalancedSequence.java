package Foundation.Stack;

import java.util.Stack;

public class BalancedSequence {
    
    public static boolean validParetheses(String s) {  // Example: "{[()]}"
    if (s.length() == 0 || (s.length() % 2 != 0)) {
        return false;
    }
    
    Stack<Character> st = new Stack<>();
    
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        
        if (c == '(' || c == '[' || c == '{') {
            st.push(c);  // Push opening brackets
        } else {
            if (st.isEmpty()) {
                return false; // Closing bracket without an opening one
            }
            
            char top = st.peek();
            
            // Check for valid matching pairs
            if ((c == ')' && top == '(') || 
                (c == ']' && top == '[') || 
                (c == '}' && top == '{')) {
                st.pop(); // Valid match, remove from stack
            } else {
                return false; // Mismatch found
            }
        }
    }
    
    return st.isEmpty(); // Stack should be empty for valid parentheses
}


    public static void main(String[] args) {
        String s = ")()(((())))";
        boolean res = validParetheses(s);
        System.out.println("Original String is: " +s);
        System.out.println("The Given String is: " +res);
    }
}

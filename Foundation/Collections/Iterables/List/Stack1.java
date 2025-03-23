import java.util.Stack;
import java.util.Vector;

public class Stack1 {
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        Vector<Integer> st1 = new Stack<>(); // stack extends Vector
        st1.add(90);


        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Stack is: " +st);

        System.out.println("Popped Element: " +st.pop());
        System.out.println("Top Element: " +st.peek());
        System.out.println("Stack is Empty: " +st.isEmpty());
        System.out.println("Size of Stack: " +st.size());

        st.search(20); // 1 based index and returns size from top
    }
}

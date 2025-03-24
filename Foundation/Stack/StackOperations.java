package Foundation.Stack;

import java.util.Stack;

public class StackOperations {

    // copy original stack
    public static void copyStack(Stack<Integer> stack) {
        Stack<Integer> st1 = new Stack<>();
        while (stack.size() > 0) {
            st1.push(stack.pop());
        }
        System.out.println("Reversed Stack is: " + st1);

        Stack<Integer> st2 = new Stack<>();
        while (st1.size() > 0) {
            st2.push(st1.pop());
        }

        System.out.println("Reverse the Reversed Stack to Get Copy Stack: " + st2);
    }

    // insert at any index
    public static void insertStackItem(Stack<Integer> stack, int index, int item) {
        Stack<Integer> st = new Stack<>();
        if (index < 0 || index > stack.size()) {
            System.out.println("Invalid Index");
        } else {
            while (stack.size() > index) {
                st.push(stack.pop());
            }
            stack.push(item);

            while (st.size() > 0) {
                stack.push(st.pop());
            }
        }
        System.out.println("Original Stack: " + stack);
        System.out.println("Copied Stack: " + st);
    }

    // push at bottom or any index recursion
    public static void pushIndex(Stack<Integer> stack, int item) {
        if(stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int ele = stack.pop();
        pushIndex(stack, item);
        stack.push(ele);
    }

    // print stack from bottom to top
    public static void printReverseStack1(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int ele = stack.pop();
        printReverseStack1(stack);
        System.out.println(ele);
    }

    // print stack from top to bottom
    public static void printReverseStack2(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int ele = stack.pop();
        System.out.println(ele);
        printReverseStack2(stack);
        stack.push(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Original Stack is: " + stack);
        // insertStackItem(stack, 0, 90);
        // insertStackItem(stack, 2, 90);
        // printReverseStack1(stack);
        // printReverseStack2(stack);
        pushIndex(stack, 90);
        System.out.println("New Stack is: " + stack);
    }
}

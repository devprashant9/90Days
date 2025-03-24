package Foundation.Stack;

import java.util.Stack;

public class Stack1 {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        

        System.out.println("The Stack is: " +stack);
        System.out.println("Popped Element: " +stack.pop());
        System.out.println("Size of Stack: " +stack.size());
        System.out.println("Is Stack Empty: " +stack.isEmpty());
        System.out.println("Top Element is: " +stack.peek());
        System.out.println("Initial Capacity of Stack: " +stack.capacity());
        System.out.println("Get Element at Index 2: " +stack.get(2));
    }
}

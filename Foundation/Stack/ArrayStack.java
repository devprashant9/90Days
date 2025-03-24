package Foundation.Stack;

public class ArrayStack {

    public static int[] array;
    public static int size;
    public static int k;

    ArrayStack(int size) {
        ArrayStack.size = size;
        array = new int[size];
        k = -1;
    }

    void push(int x) {
        if(k == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++k] = x;
    }

    int pop() {
        return array[k];
    }

    void peek() {
        if(k == -1) {
            System.out.println("Stack Underflow");
            return;
        }
    }

    void display() {
        for (int i = 0; i <= k; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack ob = new ArrayStack(10);
        // ob.peek();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.display();

    }
}

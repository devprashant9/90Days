package Foundation.LinkedList;

public class CreateLL {

    public static Node head = null;   // to point to head

    public static class Node {
        int data;
        Node next;  // default value is null

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        Node n1 = new Node(20);
        head = n1;
        Node n2 = new Node(30);
        n1.next = n2;
        System.out.println(head.data);
        System.out.println(n1.next.data);
        System.err.println(n1.next);


    }
}

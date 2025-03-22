package Foundation.LinkedList;

public class InsertLL {

    public static Node head;
    public static int size = 0;

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public static void insertTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
           temp.next = newNode;
        }
        size++;
    }

    public static void insertAtIndex(int data, int index) {
        if(index < 0 || index > size - 1) {
            System.out.println("Invalid Index");
        } else if (index == 0) {
            insertHead(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            // System.out.println(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public static void deleteHead() {
        if (head == null) {
            System.out.println("Empty Linked List. Nothing to Delete");
        } else if(size == 1) {
            displayNodes();
            System.out.println("List Will be Empty After Deleting Single Node");
            head = null;
            System.out.println("");
        } else {
            head = head.next;
        }
        size--;
    }

    public static void deleteTail() {
        if (head == null) {
            System.out.println("Empty Linked List. Nothing to Delete");
        } else if(size == 1) {
            displayNodes();
            System.out.println("List Will be Empty After Deleting Single Node");
            head = null;
            System.out.println("");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    public static void displayNodes() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        insertHead(25);
        insertHead(35);
        insertHead(45);
        insertHead(55);
        // displayNodes();
        insertTail(100);
        insertTail(200);
        insertTail(300);
        // displayNodes();
        insertAtIndex(90, 1);
        insertAtIndex(90, 4);
        insertAtIndex(90, 6);
        // displayNodes();
        System.out.println("\n" +size);
        deleteHead();
        displayNodes();
    }
}

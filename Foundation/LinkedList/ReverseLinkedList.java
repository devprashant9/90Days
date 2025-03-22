package Foundation.LinkedList;

public class ReverseLinkedList {

    public static void printReverse(InsertLL.Node headPointer) {

        if (headPointer == null) {
            return;
        }

        if (headPointer.next == null) {
            System.out.println(headPointer.data);
            return;
        }

        printReverse(headPointer.next);
        System.out.println(headPointer.data);
    }

    public static void main(String[] args) {

        InsertLL.insertTail(10);
        InsertLL.insertTail(20);
        InsertLL.insertTail(30);
        InsertLL.insertTail(40);
        InsertLL.insertTail(50);
        InsertLL.displayNodes();

        InsertLL.Node headPointer = InsertLL.head;
        printReverse(headPointer);
    }
}

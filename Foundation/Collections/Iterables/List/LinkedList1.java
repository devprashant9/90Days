import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
    
    public static void main(String[] args) {

        // declaration
        LinkedList<Integer> list = new LinkedList<>(); // uses doubly linked list
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Apple", "mango", "Cherry"));
        System.out.println("List 2: " +list2);

        // adding a Node
        list.add(10);
        list.add(0, 25);
        list.addFirst(30);
        list.addLast(80);

        System.out.println("Original Linked List: " +list);

        // accessing element
        System.out.println("Get Element at Index 2: " +list.get(2));

        System.out.println("Size of List: " +list.size());

        list.removeIf(a -> a % 2 == 0);  // Functional Interface "Predicate". Works Like Filter

        System.out.println("Original Linked List: " +list);


        
    }
}

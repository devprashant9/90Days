package Foundation.Collections.Iterables;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(70);

        System.out.println("Original List: " +list);

        list.sort(null);
        System.out.println("Passing null Sorts in Ascending Order: " +list);

        list.add(0, 100);
        System.out.println("New Original List: " +list);
        Collections.sort(list);
        System.out.println("Passing List Also Sorts in Ascending Order: " +list);
    }
}

package Foundation.Collections.Iterables;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("guava");
        list.add("cherry");
        list.add("litchi");

        System.out.println("Original List: " + list);
        Collections.sort(list, new CustomComparator());
        System.out.println("Sorted List: " + list);

        // using lambda expression
        Collections.sort(list, (o1, o2) -> o2.length() - o1.length());
        System.out.println("Sorted List: " + list);
    }
}


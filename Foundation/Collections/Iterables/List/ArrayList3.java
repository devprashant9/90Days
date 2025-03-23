import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList3 {

    public static void main(String[] args) {

        // ways to create ArrayList
        List<Integer> list1 = new ArrayList<>();
        list1.add(20);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Prashant");

        List<String> list3 = Arrays.asList("Monday", "Tuesday", "Friday"); // takes comma seperated value and returns a
                                                                           // List so store in List variable and NOT
                                                                           // ArrayList.
        list3.set(0, "saturday"); // allowed

        String[] array1 = { "apple", "banana", "grapes", "guava", "mango" }; // changes in this will affect list4
        List<String> list4 = Arrays.asList(array1); // takes an array and returns a List so store in List variable and
                                                    // NOT in ArrayList. Nothing is allowed
        list4.set(0, "cherry"); // allowed and will affect array as well
        System.out.println("Array of List 4 : " + Arrays.toString(array1));

        List<List<String>> list5 = List.of(list4); // list of list and completely immutable
        System.out.println("List 5 : " + list5);
       
       
        List<Integer> list6 = List.of(10, 20, 30, 40, 50); // completely immutable
        System.out.println("List 6 : " + list6);
        // list6.set(0, 25); // run time error
        // list6.add(40); // run time error
        // no null values also

        List<Integer> list7 = new ArrayList<>(list6); // convert to mutable form
        list7.addAll(list1); // list6 + list1 elements i.e. merges 2 lists
        System.out.println("Converted to Mutable Form : " +list7);

        String[] str = list7.toArray(new String[0]); // must mention type
        System.out.println(Arrays.toString(str));

        Collections.sort(list7); // default sorts in ascending order

    
    }
}

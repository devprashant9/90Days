import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(60);

        // accessing elements
        System.out.println("Element at Index 0 : " + list.get(0));
        System.out.println("Element at Index 2 : " + list.get(2));

        // size of the list
        System.out.println("List Size: " + list.size());

        // traversing list
        System.out.println("Printing List Elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Index " + i + " List Element " + list.get(i) + " \n");
        }

        // traversing list using forEach Loop
        System.out.println("Printing List Elements Using For Each Loop");
        for (int integer : list) {
            System.out.println(integer);
        }

        // check for existence of element
        System.out.println("List Contains 20 : " +list.contains(20));
        System.out.println("List Contains 100 : " +list.contains(100));

        // deleting from list by Index
        System.out.println("Size of List Before Deleting : " +list.size());
        System.out.println("Removing Items By Index : " +list.remove(2));
        System.out.println("Size of List After Deleting: " +list.size());

        // delete from list by Value
        System.out.println("List Before Removing Element 40 : " +list);
        list.remove((Integer) 40);
        System.out.println("List After Removing Element 40 : " +list);

        // insert at Index
        System.out.println("List Before Adding ELement at Index 1: " +list);
        list.add(1, 90);
        System.out.println("Added ELement at Index 1 : " +list);

        // replace element at Index
        System.out.println("List Before Replacing ELement at Index 3: " +list);
        list.set(3, 70);
        System.out.println("List After Replacing ELement at Index 3: " +list);


    }
}
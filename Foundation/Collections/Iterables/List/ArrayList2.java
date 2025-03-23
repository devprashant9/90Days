import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

public class ArrayList2 {

    public static void main(String[] args) throws Exception {

        // checking capacity
        // write this import "import java.lang.reflect.Field;""
        // first write "throws Exception" after main
        // to make it work first compile your file after any changes then run using below command
        // java --add-opens java.base/java.util=ALL-UNNAMED <fileName>
        // or else it will not work

        Field field = ArrayList.class.getDeclaredField("elementData");  // copy as it is
        field.setAccessible(true); // copy as it is

        ArrayList<Integer> list1 = new ArrayList<>();

        Object[] elementData1 = (Object[]) field.get(list1);  // 0
        System.out.println("Capacity of Default Created ArrayList: " +elementData1.length); // prints 0

        list1.add(20); // add 1 element

        elementData1 = (Object[]) field.get(list1); // overwrite it and will now be 10
        System.out.println("Capacity of Default Created ArrayList After Adding 1 Element: " +elementData1.length); // prints 10

        
        
        List<Integer> list2 = new ArrayList<>(12); // capacity 12
        Object[] elementData2 = (Object[]) field.get(list2);
        System.out.println("Default Capacity of ArrayList When Capacity Provided By User: " + elementData2.length);

        // added 12 elements no resize needed
        list2.add(50);
        list2.add(10);
        list2.add(90);
        list2.add(50);
        list2.add(10);
        list2.add(90);
        list2.add(50);
        list2.add(10);
        list2.add(90);
        list2.add(50);
        list2.add(10);
        list2.add(90);

        System.out.println("Capacity of ArrayList After 12 Elements: " + elementData2.length);

        // no more space to add needs resize by (12 * 1.5 = 18) which is new capacity
        // and it happens automatically
        list2.add(50);
        elementData2 = (Object[]) field.get(list2);  // overwrite to get new value
        System.out.println("Capacity of ArrayList After Adding 13th Element: " + elementData2.length); // prints 18

        // removed 3 elements but capacity still remains 18 because it does not happen
        // automatically
        list2.remove(0);
        list2.remove(1);
        list2.remove(3);
        elementData2 = (Object[]) field.get(list2);  // overwrite to get new value
        System.out.println("Capacity of ArrayList After Removing 3 Elements: " + elementData2.length); // prints 18


        ((ArrayList<Integer>) list2).trimToSize(); // needs manual cast because we are using parent interface
        // if we did "ArrayList<Integer> list = new ArrayList<>()", then it don't need any cast
        list1.trimToSize(); // no casting needed in this case 

        elementData2 = (Object[]) field.get(list2);  // overwrite to get new value
        System.out.println("Capacity of ArrayList After Removing 3 Elements: " + elementData2.length); // prints 10
        System.out.println("Size of ArrayList: " +list2.size()); // prints 10

    }
}

// list can grow or shrink in size and internally it is object of arrays
// default capacity of arrayList is 10 after 1st element is added or else 0 and the growth factor is 1.5 times of
// current capacity
// size in arrayList specifies the number of elements present in the list
// capacity cannnot be accessed directly but we can use refelection to achieve
// that
// it automatically does not shrink its size

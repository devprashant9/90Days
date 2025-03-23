package Foundation.Collections.Iterables.Set;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(40);
        set.add(50);
        System.out.println("The Set Is: " +set);
    }
}

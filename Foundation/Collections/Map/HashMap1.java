package Foundation.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();


        mp.put(0, "Prashant");
        mp.put(1, "Ankit");
        mp.put(2, "Nikhil");
        mp.put(3, "Digvijay");
        mp.put(4, "Dnyanesh");

        System.out.println("The Map is: " +mp);

        System.out.println("Value at Index 2: " +mp.get(2));

        System.out.println("Map Contains Key 3: " +mp.containsKey(3));
        System.out.println("Map Contains Value Nikhil: " +mp.containsValue("Nikhil"));

        System.out.println("Set of All Keys: " +mp.keySet());
        System.out.println("Collection of All Values: " +mp.values());

        System.out.println("Entry Set: " +mp.entrySet());
    }
}

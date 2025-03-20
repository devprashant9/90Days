package Foundation.BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
    
    public static int uniqueElement(int[] array) {
        int ans = 0;
        for (int i : array) {
            ans ^= i;
        }
        return ans == 0 ? -1 : ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("You Must Insert 1 Unique ELement and All Other Twice");
        System.out.println("Enter Positive Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int res = uniqueElement(array);
        System.out.println("Your Array is: " +Arrays.toString(array));
        System.out.println("Unique Element is: " +res);
        sc.close();
    }
}

package Foundation.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of The Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Enter an Element to Search: ");
        int target = sc.nextInt();
        int res = linearSearch(array, target);
        if(res != -1) {
            System.out.println("Element Found at Index: " +res);
        } else {
            System.out.println("Element is Not Present");
        }
        sc.close();
    }
}

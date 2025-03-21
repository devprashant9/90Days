package Foundation.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of The Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements in Ascending Order: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Enter an Element to Search: ");
        int target = sc.nextInt();
        int res = binarySearch(array, target);
        if (res != -1) {
            System.out.println("Element Found at Index: " + res);
        } else {
            System.out.println("Element is Not Present");
        }
        sc.close();
    }
}

package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    // works only for unique elements in an array
    // to work for duplicates strike of all duplicates after finding maximum

    public static int largestElement(int[] array) {
        int maximum = Integer.MIN_VALUE;
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void secondLargest(int[] array) {
        int largestIndex = largestElement(array);
        array[largestIndex] = Integer.MIN_VALUE;
        int secondLargestIndex = largestElement(array);
        System.out.println("Second Largest Element is: " + array[secondLargestIndex]);
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
        secondLargest(array);
        sc.close();
    }
}

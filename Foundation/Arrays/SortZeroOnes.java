package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortZeroOnes {

    public static void sortZeroAndOnes(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (array[start] == 1 && array[end] == 0) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            } else if (array[start] == 0) {
                start++;
            } else if (array[end] == 1) {
                end--;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
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
        sortZeroAndOnes(array);
        sc.close();
    }
}

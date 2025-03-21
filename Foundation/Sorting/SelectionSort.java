package Foundation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSortLoop(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            System.out.println("For i = " +i);
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    int temp = array[j];
                    array[j] = array[min];
                    array[min] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
        System.out.println("==================================");
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
        System.out.println("==================================");
        selectionSortLoop(array);
        sc.close();
    }
}

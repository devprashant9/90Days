package Foundation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSortLoop(int[] array) {
        int i;
        for (i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Number of Times Loop Executed: " +i);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void bubbleSortLoopOptimized(int[] array) {
        int i;
        for (i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println("==================");
        System.out.println("Number of Times Loop Executed: " +i);
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
        bubbleSortLoop(array);
        bubbleSortLoopOptimized(array);
        sc.close();
    }
}

package Foundation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int partitionIndex = partition(array, start, end);
        quickSort(array, start, partitionIndex - 1);
        quickSort(array, partitionIndex + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = start + count;
        swap(array, start, pivotIndex);

        int i = start;
        int j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
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
        quickSort(array, 0, array.length - 1);
        System.out.println("The Sorted Array is: " + Arrays.toString(array));
        sc.close();
    }
}

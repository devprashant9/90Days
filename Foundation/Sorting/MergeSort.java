package Foundation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        mergeSortedArray(array, left, middle, right);
    }

    public static void mergeSortedArray(int[] array, int left, int middle, int right) {
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;

        int i, j, k;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for (i = 0; i < leftArraySize; i++) {
            leftArray[i] = array[left + i];
        }

        for (j = 0; j < rightArraySize; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        i = j = 0;
        k = left;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArraySize) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArraySize) {
            array[k++] = rightArray[j++];
        }
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
        mergeSort(array, 0, array.length - 1);
        System.out.println("The Sorted Array is: " + Arrays.toString(array));
        sc.close();
    }
}

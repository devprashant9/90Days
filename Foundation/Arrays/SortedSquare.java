package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquare {

    public static void sortedSquare(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int[] ansArray = new int[array.length];
        int k = 0;
        while (start <= end) {
            if(Math.abs(array[start]) > Math.abs(array[end])) {
                ansArray[k++] = array[start] * array[start];
                start++;
            } else  {
                ansArray[k++] = array[end] * array[end];
                end--;
            }
        }
        System.out.println("Squared Sorted Array: " + Arrays.toString(ansArray));
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
        sortedSquare(array);
        sc.close();
    }
}

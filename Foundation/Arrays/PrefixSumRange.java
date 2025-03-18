package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumRange {

    public static void prefixSum(int[] array, int start, int end) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        System.out.println("Prefix SumRange of Array: " + (prefixSumRange(start, end, array)));
    }

    public static int prefixSumRange(int start, int end, int[] array) {
        return (array[end] - array[start - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of The Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] array = new int[n + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        System.err.println("Enter Start Position to Find Sum: ");
        int start = sc.nextInt();
        System.err.println("Enter End Position to Find Sum: ");
        int end = sc.nextInt();
        prefixSum(array, start, end);
        sc.close();
    }
}

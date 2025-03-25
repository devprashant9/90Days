package Others.Practise.SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumSubArray {

    public static void maxSumArray(int[] array, int k) {
        int i = 0;
        int j = 0;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < array.length) {
            if ((j - i + 1) < k) {
                sum += array[j];
                j++;
            } else {
                sum += array[j++];
                maxSum = Math.max(maxSum, sum);
                sum -= array[i++];
            }
        }
        System.out.println("Maximum Sum of SubArray is: " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int len = sc.nextInt();

        int[] array = new int[len];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array is: " + Arrays.toString(array));
        System.out.println("Enter Window Size: ");
        int k = sc.nextInt();
        maxSumArray(array, k);
        sc.close();
    }
}
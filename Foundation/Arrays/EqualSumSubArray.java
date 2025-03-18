package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSumSubArray {

    public static int totalSum(int[] array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
        return totalSum;
    }

    public static void equalSumSubArray(int[] array) {
        int flag = -1;
        int sum = totalSum(array);
        int prefixSum = 0;
        for (int i = 0; i < array.length; i++) {
            prefixSum += array[i];
            int suffixSum = sum - prefixSum;
            if (prefixSum == suffixSum) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Equal Sum Partition Possible");
        } else {
            System.out.println("Equal Sum Partition Not Possible");
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
        equalSumSubArray(array);
        sc.close();
    }
}

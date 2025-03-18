package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    
    public static void prefixSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        System.out.println("Prefix Sum Array: " +Arrays.toString(array));
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
        System.out.println("Original Array: " +Arrays.toString(array));
        prefixSum(array);
        sc.close();
    }
}

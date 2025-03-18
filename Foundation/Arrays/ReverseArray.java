package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void revereseArray(int[] array) {
        int[] revArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            revArray[index++] = array[i];
        }

        System.out.println("Reversed Array: " + (Arrays.toString(revArray)));
    }

    public static void revArrayOptimized(int[] array) {
        int length = array.length;
        int i = 0;
        while (i <= length / 2) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
            i++;
        }
        System.out.println("Reversed Array Optimized: " + (Arrays.toString(array)));
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
        System.out.println("Original Array: " + (Arrays.toString(array)));
        revereseArray(array);
        revArrayOptimized(array);
        sc.close();
    }
}

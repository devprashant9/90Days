package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void reverseSubArray(int[] array, int pos1, int pos2) {
        while (pos1 < pos2) {
            int temp = array[pos1];
            array[pos1] = array[pos2];
            array[pos2] = temp;
            pos1++;
            pos2--;
        }
    }

    public static void rotateArray(int[] array, int k) {
        int length = array.length;
        int rotations = k % length;
        reverseSubArray(array, 0, rotations - 1);
        reverseSubArray(array, rotations, length - 1);
        reverseSubArray(array, 0, length - 1);
        System.out.println("Array After Rotation is: " + Arrays.toString(array));
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
        System.out.println("Enter Number of Rotations: ");
        int k = sc.nextInt();
        System.out.println("Array Before Rotation is: " + Arrays.toString(array));
        rotateArray(array, k);
        sc.close();
    }
}

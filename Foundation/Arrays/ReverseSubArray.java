package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSubArray {

    public static void reverseSubArray(int[] array, int pos1, int pos2) {
        while (pos1 < pos2) {
            int temp = array[pos1];
            array[pos1] = array[pos2];
            array[pos2] = temp;
            pos1++;
            pos2--;
        }
        System.out.println("Array Elements After Swapping: " + (Arrays.toString(array)));
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
        System.out.println("Enter Start Postion: ");
        int pos1 = sc.nextInt();
        System.out.println("Enter End Position: ");
        int pos2 = sc.nextInt();
        System.out.println("Array Elements Before Swapping: " + (Arrays.toString(array)));
        reverseSubArray(array, pos1, pos2);
        sc.close();
    }
}
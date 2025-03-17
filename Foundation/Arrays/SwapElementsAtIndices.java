package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElementsAtIndices {
    
    public static void swapArrayElements(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
        System.out.println("Array Elements After Swapping: " +(Arrays.toString(array)));
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
        System.out.println("Enter Postion 1 to Swap: ");
        int pos1 = sc.nextInt();
        System.out.println("Enter Position 2 to Swap: ");
        int pos2 = sc.nextInt();
        System.out.println("Array Elements Before Swapping: " +(Arrays.toString(array)));
        swapArrayElements(array, pos1, pos2);
        sc.close();
    }
}

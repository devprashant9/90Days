package Foundation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroesToEnd {

    public static void moverZerosToEnd(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] == 0 && array[j + 1] != 0) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
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
        moverZerosToEnd(array);
        System.out.println("Modified Array: " + Arrays.toString(array));
        sc.close();
    }
}

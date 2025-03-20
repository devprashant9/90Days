package Foundation.Recursion;

import java.util.Scanner;

public class ArrayMaximum {
    
    public static void printArrayMaximum(int[] array, int start, int max) {
        if(start == array.length) {
            System.out.println("The Maximum Element is: " +max);
            return;
        }
        if (array[start] > max) {
            max = array[start];
        }
        printArrayMaximum(array, start + 1, max);
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
        printArrayMaximum(array, 0, array[0]);
        sc.close();
    }
}

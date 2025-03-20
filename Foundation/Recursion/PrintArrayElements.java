package Foundation.Recursion;

import java.util.Scanner;

public class PrintArrayElements {
    
    public static void printArrayElements(int[] array, int start) {
        if(start == array.length) {
            return;
        }
        System.out.print(array[start] + " ");
        printArrayElements(array, start + 1);
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
        printArrayElements(array, 0);
        sc.close();
    }
}

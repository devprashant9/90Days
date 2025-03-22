package Foundation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FruitsSort {

    public static void fruitsSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    String temp = array[j];
                    array[j] = array[min];
                    array[min] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of The Array: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Array Elements: ");
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        fruitsSort(array);
        System.out.println("Modified Array: " + Arrays.toString(array));
        sc.close();
    }
}

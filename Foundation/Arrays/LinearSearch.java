package Foundation.Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if ((i == array.length - 1) && (array[i] != target)) {
                System.out.println("Element Not Present:");
            } else if (array[i] == target) {
                System.out.println("Element Found at Index: " + (i + 1));
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
        System.out.println("Enter Element to Be Found: ");
        int target = sc.nextInt();
        linearSearch(array, target);
        sc.close();
    }
}

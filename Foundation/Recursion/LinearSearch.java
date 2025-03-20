package Foundation.Recursion;

import java.util.Scanner;

public class LinearSearch {

    public static boolean linearSearch(int[] array, int target, int start) {
        if (start == array.length) {
            return false;
        }
        if (array[start] == target) {
            return true;

        }
        return linearSearch(array, target, start + 1);
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
        boolean res = linearSearch(array, target, 0);
        System.out.println("The Target Element Exist in Array ? " + res);
        sc.close();
    }
}

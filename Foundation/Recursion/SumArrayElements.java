package Foundation.Recursion;

import java.util.Scanner;

public class SumArrayElements {

    public static int sumArray(int[] array, int start) {
        if (start == array.length) {
            return 0;
        }
        return array[start] + sumArray(array, start + 1);
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
        int res = sumArray(array, 0);
        System.out.println("Sum of Array Elements is: " +res);
        sc.close();
    }
}

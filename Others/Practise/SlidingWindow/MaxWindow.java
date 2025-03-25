package Others.Practise.SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class MaxWindow {

    public static void maxWindow(int[] array, int k) {
        int i = 0, j = 0;
        int mx = Integer.MIN_VALUE;
        int sum = 0;

        while (j < array.length) {
            sum += array[j];
            if (sum == k) {
                int length = j - i + 1;
                mx = Math.max(mx, length);
                sum -= array[i];
                i++;
                j++;
            } else {
                j++;
            }
        }
        System.out.println(mx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int len = sc.nextInt();

        int[] array = new int[len];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array is: " + Arrays.toString(array));
        System.out.println("Enter a Sum: ");
        int k = sc.nextInt();

        maxWindow(array, k);
        sc.close();
    }
}

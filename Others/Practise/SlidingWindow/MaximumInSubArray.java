package Others.Practise.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumInSubArray {

    public static void maxSubArray(int[] array, int k) {
        int i = 0, j = 0;
        int mx = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        while (j < array.length) {
            if ((j - i + 1) < k) {
                mx = Math.max(mx, array[j]);
                j++;
            } else {
                mx = Math.max(mx, array[j]);
                list.add(mx);
                i++;
                j++;
            }
        }
        System.out.println(list);
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
        System.out.println("Enter Window Size: ");
        int k = sc.nextInt();

        maxSubArray(array, k);
        sc.close();
    }
}

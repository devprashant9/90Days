package Foundation.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class GoodInteger {

    public static int lessCount = 0;

    public static boolean goodInteger(int[] array, int start, int good) { // array with distinct elements
        if (start == array.length) {
            return false;
        }

        if (array[start] == start) {
            return true;
        }
        return goodInteger(array, start + 1, good);
    }

    public static int goodInteger2(int[] array, int start, int count) { // array with repeating elements
        if (start == array.length) {
            return count;
        }

        if (start == 0) {
            return goodInteger2(array, start + 1, count + 1);
        }

        if (array[start] != array[start - 1]) {
            lessCount = start;
        }

        if (array[start] == lessCount) {
            return goodInteger2(array, start + 1, count + 1);
        }
        return goodInteger2(array, start + 1, count);
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
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // System.out.println("Enter a Number to Check for Good Number: ");
        // int good = sc.nextInt();
        // boolean res = goodInteger(array, 1, good);
        // System.out.println("The Given Number is a Good Number ? " + res);

        int count = goodInteger2(array, 0, 0);
        System.out.println("Number of Good Integers: " + count);

        sc.close();
    }
}

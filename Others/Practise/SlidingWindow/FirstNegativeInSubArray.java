package Others.Practise.SlidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeInSubArray {

    public static void firstNegative(int[] array, int k) {
        int i = 0, j = 0;
        Queue<Integer> list = new LinkedList<>(); // Use Queue for efficient removal

        while (j < array.length) {
            if (array[j] < 0) {
                list.add(array[j]); // Store only negative numbers
            }

            if ((j - i + 1) < k) {
                j++;
            } else {
                // Print first negative if present, else print 0
                if (!list.isEmpty()) {
                    System.out.println(list.peek());
                    if (array[i] == list.peek()) { // Remove only if exiting element is negative
                        list.poll();
                    }
                } else {
                    System.out.println(0);
                }

                i++;
                j++;
            }
        }
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

        firstNegative(array, k);
        sc.close();
    }
}

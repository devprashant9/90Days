package Others.Practise.SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class MaxWindow {

    public static void maxWindow(int[] array, int k) {
        int i = 0, j = 0;
        int mx = 0; // Length should start from 0 (not Integer.MIN_VALUE)
        int sum = 0;
    
        while (j < array.length) {
            sum += array[j];
    
            while (sum > k) { // Shrinking condition
                sum -= array[i];
                i++;
            }
    
            if (sum == k) {
                mx = Math.max(mx, j - i + 1);
            }
            
            j++; // Move right pointer
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

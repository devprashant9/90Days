package Foundation.Arrays;

import java.util.Scanner;

public class Maximum {
    public static void maximumOfArrayElements(int[] array) {
        int max = array[0];
        for(int ele : array) {
            if(ele >= max) {
                max = ele;
            }
        }
        System.out.println("Maximum of Array Elements is: " +max);
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
        maximumOfArrayElements(array);
        sc.close();
    }
}

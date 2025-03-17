package Foundation.Arrays;

import java.util.Scanner;

public class Sum {

    public static void sumOfArrayElements(int[] array) {
        int sum = 0;
        for(int ele : array) {
            sum += ele;
        }
        System.out.println("Sum of Array Elements is: " +sum);
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
        sumOfArrayElements(array);
        sc.close();
    }
}
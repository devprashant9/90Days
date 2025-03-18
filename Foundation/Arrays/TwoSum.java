package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static void twoSum(int[] array, int target){
        int[] pairSum = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    pairSum[0] = i + 1;
                    pairSum[0] = j + 1;
                    break;
                }
            }
        }
        System.out.println("The Target Can Be Achieved By Indexex: " +(Arrays.toString(pairSum)));
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
        System.out.println("Enter Target Sum: ");
        int target = sc.nextInt();
        twoSum(array, target);
        sc.close();
    }
}

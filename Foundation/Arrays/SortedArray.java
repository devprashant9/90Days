package Foundation.Arrays;

import java.util.Scanner;

public class SortedArray {

    public static void sortedArray(int[] array) {
        int flag = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i + 1] < array[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Unsorted Array");
        } else {
            System.out.println("Sorted Array");
        }
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
        sortedArray(array);
        sc.close();
    }
}

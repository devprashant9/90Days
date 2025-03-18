package Foundation.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElemnt {

    public static void findUniqueElement(int[] array) { // array[i] > 0
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                    array[j] = -1;
                }
            }
        }
        System.out.println("Array After Striking Elements Duplicate Elements: " + (Arrays.toString(array)));
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                System.out.println("Unique Occurring Element is: " +array[i]);
                break;
            }
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
        System.out.println("Original Array: " +Arrays.toString(array));
        findUniqueElement(array);
        sc.close();
    }
}

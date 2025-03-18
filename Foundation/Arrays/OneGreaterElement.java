package Foundation.Arrays;

import java.util.Scanner;

public class OneGreaterElement {

    public static void oneGreaterElement(int[] array) { // strictly greater
        int maximum = array[0];
        int maxElementCount = 0;
        for (int i : array) {
            if (i > maximum) {
                maximum = array[i];
            }
        }
        for (int i : array) {
            if(i == maximum) {
                maxElementCount++;
            }
        }
        System.out.println("Elements Strictly 1 Greater Than Itself Are: " + (array.length - maxElementCount));
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
        oneGreaterElement(array);
        sc.close();
    }
}

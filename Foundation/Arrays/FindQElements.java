package Foundation.Arrays;

import java.util.Scanner;

public class FindQElements {

    public static void findElement(int[] array) {
        int[] frequencyArray = new int[100];
        for (int i = 0; i < array.length; i++) {
            frequencyArray[array[i]] += 1;
        }
        System.out.println("Frequency of Each Array Element: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " => " + frequencyArray[array[i]]);
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
        findElement(array);
        sc.close();
    }
}

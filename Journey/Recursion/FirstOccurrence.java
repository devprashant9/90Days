package Journey.Recursion;

import java.util.Scanner;

public class FirstOccurrence {

    public static void firstOccurrence(int[] array, int index, int target) {
        if(index == array.length - 1) {
            System.out.println("No Occurrence");
            return;
        }
        if(array[index] == target) {
            System.out.println("First Occurrence at Index: " +(index + 1));
            return;
        }
        firstOccurrence(array, index + 1, target);
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
        System.out.println("Enter a Element to Find First Occurrence: ");
        int target = sc.nextInt();
        firstOccurrence(array, 0, target);
        sc.close();
    }
}

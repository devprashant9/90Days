package Journey.Recursion;

import java.util.Scanner;

public class LastOccurrence {

    public static int lastOccurrence(int[] array, int index, int target) {
        if (index == array.length) {
            return -1;
        }
        int idx = lastOccurrence(array, index + 1, target);
        if(idx == -1 && array[index] == target) {
            return index;
        }
        return idx; 
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
        int res = lastOccurrence(array, 0, target);
        System.out.println("Last Occurrence: " +res);
        sc.close();
    }
}

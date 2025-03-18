package Foundation.Arrays;

import java.util.Arrays;

public class ClonningArray {
    public static void main(String[] args) {
        int[] original= {5, 6, 7, 8, 9, 10};

        int[] clone = original;
        clone[0] = 25;

        int[] copyArray = Arrays.copyOf(original, original.length);
        copyArray[0] = 125;

        int[] rangeCopy = Arrays.copyOfRange(original, 0, 3);
        rangeCopy[0] = 12525;

        System.out.println("Original Array: " +(Arrays.toString(original)));
        System.out.println("Clone Array: " +(Arrays.toString(clone)));
        System.out.println("Copy Array: " +(Arrays.toString(copyArray)));
        System.out.println("Range Copy Array: " +(Arrays.toString(rangeCopy)));

    }
}

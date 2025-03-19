package Foundation.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleCharactersArray {

    public static void toggleCharacterArray(char[] array) {
        System.out.println("Toggled Array: ");
        for (int i = 0; i < array.length; i++) {
            int ch = array[i];
            if (ch >= 65 && ch <= 90) {
                array[i] = (char) (ch + 25 + 7);
            } else {
                array[i] = (char) (ch - 25 - 7);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int l = sc.nextInt();
        sc.nextLine();
        char[] array = new char[l];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine().charAt(0);
        }
        toggleCharacterArray(array);
        sc.close();
    }
}

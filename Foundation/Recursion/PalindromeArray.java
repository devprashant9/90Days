package Foundation.Recursion;

import java.util.Scanner;

public class PalindromeArray {

    public static boolean palindromeArray(char[] array, int start) {
        if (start >= array.length / 2) {
            return true;
        }
        if (array[start] != array[array.length - 1 - start]) {
            return false;
        }
        return palindromeArray(array, start + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int len = sc.nextInt();
        char[] array = new char[len];
        sc.nextLine();
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine().charAt(0);
        }
        boolean res = palindromeArray(array, 0);
        System.out.println("The Given Array is Palindrome ? " + res);
        sc.close();
    }
}

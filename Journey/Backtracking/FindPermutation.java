package Journey.Backtracking;

import java.util.Scanner;

public class FindPermutation {
    public static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String str1 = str.substring(0, i) + str.substring(i + 1);
            printPermutation(str1, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        printPermutation(str, "");
        sc.close();
    }
}

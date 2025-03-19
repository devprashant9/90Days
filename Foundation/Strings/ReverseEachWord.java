package Foundation.Strings;

import java.util.Scanner;

public class ReverseEachWord {

    public static void reverseEachWord(String str) {
        StringBuilder ansString = new StringBuilder();
        str = str.trim();
        str = str + " ";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                String revWord = reverseWord(str.substring(k, i));
                ansString.append(revWord + " ");
                k = i;
            }
        }
        System.out.println("The Reversed String is: " +ansString);
    }

    public static String reverseWord(String s) {
        StringBuilder ansString = new StringBuilder(s);
        return ansString.reverse() + "";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = sc.nextLine();
        reverseEachWord(str);
        sc.close();
    }
}

package Foundation.Strings;

import java.util.Scanner;

public class SubstringsPalindrome {

    public static void palindromeStringsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                StringBuilder subStrCopy = new StringBuilder(subStr);
                subStrCopy.reverse();
                String rev = subStrCopy + "";
                if (subStr.equals(rev)) {
                    count++;
                }
            }
        }

        System.out.println("Count of Plaindrome Strings is: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        palindromeStringsCount(str);
        sc.close();
    }
}

// String subStr = str.substring(i, j);
// System.out.println(subStr);
// StringBuilder subStrCopy = new StringBuilder(subStr);
// subStrCopy.reverse();
// String rev = subStrCopy + "";
// if (subStr.equals(rev)) {
// count++;
// }
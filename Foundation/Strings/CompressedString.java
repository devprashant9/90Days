package Foundation.Strings;

import java.util.Scanner;

public class CompressedString {

    public static void compressedString(String str) {
        StringBuilder ansString = new StringBuilder();
        for (int i = 0; i < str.length();) {
            char ch = str.charAt(i);
            int lastOcurrence = str.lastIndexOf(ch);
            ansString.append(ch);
            if ((lastOcurrence - i + 1) != 1) {
                ansString.append((lastOcurrence - i + 1));
            }

            i = lastOcurrence + 1;
        }
        System.out.println(ansString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        compressedString(str);
        sc.close();
    }
}

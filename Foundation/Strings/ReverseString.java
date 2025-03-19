package Foundation.Strings;

import java.util.Scanner;

public class ReverseString {
    
    public static void reverseString(String str) {
        String reverse = "";
        str = str.toLowerCase().trim();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }
        System.out.println("Reversed String is: " +reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Original String is: " +str);
        reverseString(str);
        sc.close();
    }
}

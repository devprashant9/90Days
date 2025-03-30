package Journey.Recursion;

import java.util.Scanner;

public class DuplicateCharacters {
    
    public static String removeDuplicate(String s, String ans, int index) {
        if(index == s.length()) {
            return ans;
        }
        char ch = s.charAt(index);
        if(ans.indexOf(ch) == -1) {
            ans += ch;
        }
        return removeDuplicate(s, ans, index + 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Original String is: " +s);
        String res = removeDuplicate(s, "", 0);
        System.out.println("Modified String is: " +res);
        sc.close();
    }
}

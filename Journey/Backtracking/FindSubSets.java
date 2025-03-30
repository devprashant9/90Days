package Journey.Backtracking;

import java.util.Scanner;

public class FindSubSets {

    public static void printSets(String str, String ans, int index) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        printSets(str, ans + str.charAt(index), index + 1);
        printSets(str, ans, index + 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        printSets(str, "", 0);
        sc.close();
    }
}

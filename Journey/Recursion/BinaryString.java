package Journey.Recursion;

import java.util.Scanner;

public class BinaryString {
    
    public static void printStrings(int length, String ans, int lastPlace) {
        if (length == 0) {
            System.out.println(ans);
            return;
        }
        printStrings(length - 1, ans + "0", 0);
        if(lastPlace == 0) {
            printStrings(length - 1, ans + "1", 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of The String: ");
        int n = sc.nextInt();
        printStrings(n, "", 0);
        sc.close();
    }
}

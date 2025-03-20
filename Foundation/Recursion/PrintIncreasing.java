package Foundation.Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    
    public static void printNumber(int n) {
        if(n == 0) {
            return;
        }
        printNumber(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        printNumber(n);
        sc.close();
    }
}

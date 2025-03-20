package Foundation.Recursion;

import java.util.Scanner;

public class GCD {

    public static int gcdNumber(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static int gcdOptimized(int x, int y) {
        if(y != 0) {
            return x;
        }
        return gcdNumber(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int res = gcdOptimized(num1, num2);
        System.out.println("Greatest Common Divisior is: " + res);
        sc.close();
    }
}

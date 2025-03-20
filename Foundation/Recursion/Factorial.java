package Foundation.Recursion;

import java.util.Scanner;

public class Factorial {
    
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Calculate Factorial: ");
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println("The Factorial is: " +res);
        sc.close();
    }
}

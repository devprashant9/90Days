package Foundation.Recursion;

import java.util.Scanner;

public class NthFibonacci {

    public static int fibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Nth Term of Fibonacci to Find Value: ");
        int n = sc.nextInt();
        int res = fibonacciNumber(n);
        System.out.println("The Nth Fibonacci is: " + res);
        sc.close();
    }
}

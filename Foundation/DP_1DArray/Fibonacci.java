package Foundation.DP_1DArray;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    // using recursion O(2^N)
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // using dp array O(N)
    public static int fibOptimized(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fibOptimized(n - 1, dp) + fibOptimized(n - 2, dp);
        return dp[n]; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to Find Fibonacci Series: ");
        int n = sc.nextInt();

        // using recursion
        int res = fib(n);
        System.out.println("Nth Fibonacci Using Recursion: " + res);

        // using dp
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        fibOptimized(n, dp);

        sc.close();
    }
}
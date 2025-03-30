package Journey.Recursion;

import java.util.Scanner;

public class TilingProblem {
    
    public static int countWays(int tile) {
        if(tile == 0 || tile == 1) {
            return 1;
        }
        return countWays(tile - 1) + countWays(tile - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N: ");
        int n = sc.nextInt();
        int res = countWays(n);
        System.out.println("Number of Ways are: " +res);
        sc.close();
    }
}

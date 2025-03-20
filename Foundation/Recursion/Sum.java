package Foundation.Recursion;

import java.util.Scanner;

public class Sum {
    
    public static int sum(int n) {
        if(n == 0) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Natural Number to Calculate Sum: ");
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println("The Sum is: " +res);
        sc.close();
    }
}

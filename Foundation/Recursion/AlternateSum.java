package Foundation.Recursion;

import java.util.Scanner;

public class AlternateSum {

    public static int alternateSum(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 2 == 0) {
            return alternateSum(num - 1) - num;
        }
        return num + alternateSum(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Terms: ");
        int num = sc.nextInt();
        int res = alternateSum(num);
        System.out.println("Alternate Sign Sum is: " + res);
        sc.close();
    }
}

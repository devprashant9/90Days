package Foundation.Recursion;

import java.util.Scanner;

public class CalculatePower {

    public static int calculatePower(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * calculatePower(base, power - 1);
    }

    public static int calculatePowerOptimized(int base, int power) {
        if (power == 1) {
            return base;
        }
        int pow = calculatePowerOptimized(base, power / 2);
        if (power % 2 == 0)
            return pow * pow;
        return base * pow * pow;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Number: ");
        int base = sc.nextInt();
        System.out.println("Enter Power to Calculate: ");
        int power = sc.nextInt();
        int res = calculatePowerOptimized(base, power);
        System.out.println("The Value is: " + res);
        sc.close();
    }
}

package Journey.Recursion;

import java.util.Scanner;

public class PrintPower {

    public static int calculatePower(int base, int power) {
        if(power == 0) {
            return 1;
        }
        int res = calculatePower(base, power / 2);
        res = res * res;
        if(power % 2 != 0) {
            return base * res;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Number: ");
        int base = sc.nextInt();
        System.out.println("Enter Power Of The Number: ");
        int power = sc.nextInt();
        int res = calculatePower(base, power);
        System.out.println("The Power of The Number is: " +res);
        sc.close();
    }
}

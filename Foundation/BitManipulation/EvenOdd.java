package Foundation.BitManipulation;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        if((num1 & 1) == 0) {
            System.out.println(num1 + " is Even Number");
        } else {
            System.out.println(num1 + " is Odd Number");
        }
        sc.close();
    }
}

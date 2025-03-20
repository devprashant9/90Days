package Foundation.BitManipulation;

import java.util.Scanner;

public class BitImplementation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 & num2));
        System.out.println("Bitwise XOR: " + (num1 & num2));
        System.out.println("Bitwise NOT or 1's Complement of Num1: " + (~num1));
        System.out.println("Bitwise Left Shift of Num1 By 1: " + (num1 << 1));
        System.out.println("Bitwise Right Shift of Num1 By 1: " + (num1 >> 1));
        System.out.println("2's Complement of Num1: " + (~num1 + 1));
        sc.close();
    }
}

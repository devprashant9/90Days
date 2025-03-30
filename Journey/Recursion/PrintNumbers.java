package Journey.Recursion;

import java.util.Scanner;

public class PrintNumbers {

    public static void printNumber(int num) {
        if(num == 0) {
            return;
        }
        System.out.println(num);
        printNumber(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        printNumber(num);
        sc.close();
    }
}
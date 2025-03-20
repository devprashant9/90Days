package Foundation.Recursion;

import java.util.Scanner;

public class KMultiples {
    
     public static void kMultiples(int num, int k) {
        if(k == 0) {
            return;
        }
        System.out.println(num * k);
        kMultiples(num, k - 1);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mutiple Number: ");
        int num = sc.nextInt();
        System.out.println("Enter Number of Terms: ");
        int k = sc.nextInt();
        kMultiples(num, k);
        sc.close();
    }
}

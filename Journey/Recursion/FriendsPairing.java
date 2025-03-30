package Journey.Recursion;

import java.util.Scanner;

public class FriendsPairing {
    
    public static int countWays(int num) {
        if(num == 1 || num == 2) {
            return num;
        }

        // single choice
        int single = countWays(num - 1);

        // pair choice
        int pair = countWays(num - 2);
        int pairWays = (num - 1) * pair;

        return single + pairWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Friends: ");
        int num = sc.nextInt();
        int res = countWays(num);
        System.out.println("Number of Ways: " +res);
        sc.close();
    }
}

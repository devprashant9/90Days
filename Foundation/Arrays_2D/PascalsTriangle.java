package Foundation.Arrays_2D;

import java.util.Scanner;

public class PascalsTriangle {

    public static void pascalTriangle(int level) {
        int[][] pascalArray = new int[level][];
        for (int i = 0; i < level; i++) {
            pascalArray[i] = new int[i + 1];
            pascalArray[i][0] = pascalArray[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascalArray[i][j] = pascalArray[i - 1][j] + pascalArray[i - 1][j - 1];
            }
        }
        System.out.println("The Pascal Triangle is: ");
        printArray(pascalArray, level);
    }

    public static void printArray(int[][] array, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Levels: ");
        int n = sc.nextInt();
        pascalTriangle(n);
        sc.close();
    }
}

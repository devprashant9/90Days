package Foundation.Arrays_2D;

import java.util.Scanner;

public class PrefixSum {

    // brute forec technique
    public static void bruteForce(int[][] array, int x1, int y1, int x2, int y2) { // works for single query
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Prefix Sum is: " + sum);
    }

    // finding prefix sum of each row of matrix
    public static void prefixSumOfEachRow(int[][] array, int x1, int y1, int x2, int y2) {
        for (int i = 0; i < array.length; i++) {
            prefixSum(array[i]);
        }
        // printArray(array, 10, 10);

        int actualSum = 0;
        for (int i = x1; i <= x2; i++) {
            int remainingSum = array[i][y2] - array[i][y1 - 1];
            actualSum += remainingSum;
        }
        System.out.println("Prefix Sum Optimized Approach: " + actualSum);
    }

    // logic for prefix sum
    public static void prefixSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
    }

    // printing prefix sum matrix
    public static void printArray(int[][] array, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter Matrix Elements Row Wise: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter x1 Value: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 Value: ");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 Value: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 Value: ");
        int y2 = sc.nextInt();
        bruteForce(array, x1, y1, x2, y2);
        prefixSumOfEachRow(array, x1, y1, x2, y2);
        sc.close();
    }
}

// brute force
// prefix sum of each row
// prefix sum of each row and then prefix sum of each column. Each cell represents sum starting from 0th cell.
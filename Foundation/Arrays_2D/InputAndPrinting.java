package Foundation.Arrays_2D;

import java.util.Scanner;

public class InputAndPrinting {

    public static void inputArray(Scanner sc) {
        System.out.println("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter Array Elements Row-Wise: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        printArray(array, rows, cols);
    }

    public static void printArray(int[][] array, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputArray(sc);
    }
}

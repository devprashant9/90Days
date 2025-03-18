package Foundation.Arrays_2D;

import java.util.Scanner;

public class SquaresMatrix {

    public static void generateSquareMatrix(int n){
        int[][] array = new int[n][n];

        int count = 1;

        int topRow = 0, bottomRow = array.length - 1;
        int leftColumn = 0, rightColumn = array[0].length - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            for (int i = leftColumn; i <= rightColumn; i++) {
                array[topRow][i] = count * count;
                count++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                array[i][rightColumn] = count * count;
                count++;
            }
            rightColumn--;

            if (topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    array[bottomRow][i] = count * count;
                    count++;
                }
                bottomRow--;
            }

            if (leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    array[i][leftColumn] = count * count;
                    count++;
                }
                leftColumn++;
            }
        }
        System.out.println("Squares in Matrix Format is: ");
        printArray(array, n, n);
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
        System.out.println("Enter a Number to Generate Squares in Matrix Format: ");
        int n = sc.nextInt();
        generateSquareMatrix(n);
        sc.close();
    }
}

package Foundation.Arrays_2D;

public class Product {

    // multiplication of Matrix is possible iff
    // no of columns in Matrix 1 = no of rows in Matrix 2
    // resultant matrix will have order as (row of Matrix 1 X column of Matrix 2)

    public static void productArray(int[][] array1, int[][] array2) {
        int[][] productArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) { // number of times addition to be performed and is equal to (c1, r2)
                    productArray[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println("The Result Matrix is: ");
        printArray(productArray, 3, 3);
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
        int[][] array1 = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        int[][] array2 = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        productArray(array1, array2);
    }
}

package Foundation.Arrays_2D;

public class Transpose {

    // Order of Matrix(r, c) => Order of Transpose(c, r)

    public static void transposeMatrix(int[][] array) {
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = array[j][i];
            }
        }
        System.out.println("Transpose Matrix is: ");
        printArray(transpose, 3, 3);
    }

    // works only for Square Matrix
    public static void transposeOptimized(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("Optimized Transposed: ");
        printArray(array, 3, 3);
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
        int[][] array = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        System.out.println("Original Matrix is: ");
        printArray(array, 3, 3);
        transposeMatrix(array);
        transposeOptimized(array);
    }
}

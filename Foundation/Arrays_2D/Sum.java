package Foundation.Arrays_2D;

public class Sum {

    // two Matrix can be added iff their dimensions are equal

    public static void sum(int[][] array1, int[][] array2) {
        int[][] sumArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("The Sum Array is: ");
        printArray(sumArray, 3, 3);
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
        sum(array1, array2);
    }
}

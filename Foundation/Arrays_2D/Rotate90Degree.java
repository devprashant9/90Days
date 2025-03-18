package Foundation.Arrays_2D;

public class Rotate90Degree {

    public static void rotateBy90(int[][] array) {
        int[][] transposeArray = transposeOptimized(array);
        for (int i = 0; i < 3; i++) {
            reverseArray(transposeArray[i]);
        }
        System.out.println("Rotated By 90 Degree: ");
        printArray(array, 3, 3);
    }

    public static int[][] transposeOptimized(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("Transposed Matrix: ");
        printArray(array, 3, 3);
        return array;
    }

    public static void reverseArray(int[] array) {
        int length = array.length;
        int i = 0;
        while (i <= length / 2) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
            i++;
        }
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
        System.out.println("Original Array: ");
        printArray(array, 3, 3);
        rotateBy90(array);
    }
}

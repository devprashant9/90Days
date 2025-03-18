package Foundation.Arrays_2D;

public class PrintWaveForm {

    public static void printArray(int[][] array, int rows, int cols) {
        System.out.println("Original Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printWave(int[][] array, int rows, int cols) {
        System.out.println("Array in WaveForm: ");
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130, 140, 150 },
                { 160, 170, 180, 190, 200 }
        };
        printArray(array, 4, 5);
        printWave(array, 4, 5);
    }
}

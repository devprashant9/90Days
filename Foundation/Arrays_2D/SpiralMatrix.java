package Foundation.Arrays_2D;

public class SpiralMatrix {

    public static void spiralPrint(int[][] array) {
        int topRow = 0, bottomRow = array.length - 1;
        int leftColumn = 0, rightColumn = array[0].length - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            for (int i = leftColumn; i <= rightColumn; i++)
                System.out.print(array[topRow][i] + " ");
            topRow++;

            for (int i = topRow; i <= bottomRow; i++)
                System.out.print(array[i][rightColumn] + " ");
            rightColumn--;

            if (topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--)
                    System.out.print(array[bottomRow][i] + " ");
                bottomRow--;
            }

            if (leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--)
                    System.out.print(array[i][leftColumn] + " ");
                leftColumn++;
            }
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
                { 100, 200, 300, 100 },
                { 400, 500, 600, 200 },
                { 700, 800, 900, 300 },
                { 400, 500, 600, 700 }
        };
        System.out.println("Original Matrix is: ");
        printArray(array, 4, 4);
        spiralPrint(array);
    }
}

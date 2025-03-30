package Journey.Backtracking;

import java.util.Arrays;

public class SudokuSolver {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit || sudoku[row][i] == digit) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudoku(int[][] sudoku, int row, int col) {
        if (row == 9) {
            return true;  // Board filled successfully
        }

        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudoku(sudoku, nextRow, nextCol);  // Move to the next cell
        }

        for (int i = 1; i <= 9; i++) {  // Loop should be from 1 to 9
            if (isSafe(sudoku, row, col, i)) {
                sudoku[row][col] = i;
                if (sudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;  // Backtrack
            }
        }
        return false;  // No valid number found
    }

    public static void printSudoku(int[][] sudoku) {
        for (int[] row : sudoku) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] sudoku1 = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudoku(sudoku1, 0, 0)) {
            System.out.println("Solution Exists:");
            printSudoku(sudoku1);
        } else {
            System.out.println("No Solution Exists");
        }
    }
}

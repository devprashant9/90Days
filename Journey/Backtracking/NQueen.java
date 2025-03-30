package Journey.Backtracking;

public class NQueen {

    public static boolean isSafe(String[][] board, int row, int j) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][j].equals(" Q ")) {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, k = j - 1; i >= 0 && k >= 0; i--, k--) {
            if (board[i][k].equals(" Q ")) {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, k = j + 1; i >= 0 && k < board.length; i--, k++) {
            if (board[i][k].equals(" Q ")) {
                return false;
            }
        }
        return true;
    }

    public static void placeQueens(String[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = " Q ";
                placeQueens(board, row + 1);
                board[row][i] = " O ";
            }
        }
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("=============");
    }

    public static void main(String[] args) {
        String[][] board = new String[4][4];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = " O ";
            }
        }
        placeQueens(board, 0);

    }
}

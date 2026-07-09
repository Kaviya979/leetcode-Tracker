// Last updated: 09/07/2026, 15:11:01
class Solution {

    int count = 0;

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, board);

        return count;
    }

    private void solve(int row, char[][] board) {

        int n = board.length;

        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(row + 1, board);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board,
                           int row,
                           int col) {

        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}
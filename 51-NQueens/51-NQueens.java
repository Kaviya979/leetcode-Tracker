// Last updated: 09/07/2026, 15:11:03
class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, board, result);

        return result;
    }

    private void solve(int row,
                       char[][] board,
                       List<List<String>> result) {

        int n = board.length;

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(row + 1, board, result);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board,
                           int row,
                           int col) {

        int n = board.length;

        // Column
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

    private List<String> construct(char[][] board) {

        List<String> temp = new ArrayList<>();

        for (char[] row : board) {
            temp.add(new String(row));
        }

        return temp;
    }
}
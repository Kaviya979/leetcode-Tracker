// Last updated: 06/08/2026, 21:02:18
1class Solution {
2    public void solve(char[][] board) {
3
4        if (board == null || board.length == 0)
5            return;
6
7        int m = board.length;
8        int n = board[0].length;
9
10        // First and last column
11        for (int i = 0; i < m; i++) {
12            dfs(board, i, 0);
13            dfs(board, i, n - 1);
14        }
15
16        // First and last row
17        for (int j = 0; j < n; j++) {
18            dfs(board, 0, j);
19            dfs(board, m - 1, j);
20        }
21
22        // Convert cells
23        for (int i = 0; i < m; i++) {
24            for (int j = 0; j < n; j++) {
25                if (board[i][j] == 'O')
26                    board[i][j] = 'X';
27                else if (board[i][j] == '#')
28                    board[i][j] = 'O';
29            }
30        }
31    }
32
33    private void dfs(char[][] board, int i, int j) {
34
35        int m = board.length;
36        int n = board[0].length;
37
38        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O')
39            return;
40
41        board[i][j] = '#';
42
43        dfs(board, i + 1, j);
44        dfs(board, i - 1, j);
45        dfs(board, i, j + 1);
46        dfs(board, i, j - 1);
47    }
48}
// Last updated: 09/07/2026, 21:53:47
1class Solution {
2    public boolean exist(char[][] board, String word) {
3
4        int m = board.length;
5        int n = board[0].length;
6
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9
10                if (dfs(board, word, i, j, 0)) {
11                    return true;
12                }
13            }
14        }
15
16        return false;
17    }
18
19    private boolean dfs(char[][] board, String word, 
20                        int row, int col, int index) {
21
22        // Word is completely matched
23        if (index == word.length()) {
24            return true;
25        }
26
27        // Boundary check or character mismatch
28        if (row < 0 || col < 0 ||
29            row >= board.length || col >= board[0].length ||
30            board[row][col] != word.charAt(index)) {
31
32            return false;
33        }
34
35        // Mark cell as visited
36        char temp = board[row][col];
37        board[row][col] = '#';
38
39        // Explore 4 directions
40        boolean found = dfs(board, word, row + 1, col, index + 1) ||
41                         dfs(board, word, row - 1, col, index + 1) ||
42                         dfs(board, word, row, col + 1, index + 1) ||
43                         dfs(board, word, row, col - 1, index + 1);
44
45        // Backtrack
46        board[row][col] = temp;
47
48        return found;
49    }
50}
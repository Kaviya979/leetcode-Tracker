// Last updated: 09/07/2026, 21:47:18
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int[][] dp = new int[m + 1][n + 1];
7        int maxSide = 0;
8
9        for (int i = 1; i <= m; i++) {
10            for (int j = 1; j <= n; j++) {
11
12                if (matrix[i - 1][j - 1] == '1') {
13                    dp[i][j] = 1 + Math.min(
14                            Math.min(dp[i - 1][j], dp[i][j - 1]),
15                            dp[i - 1][j - 1]
16                    );
17
18                    maxSide = Math.max(maxSide, dp[i][j]);
19                }
20            }
21        }
22
23        return maxSide * maxSide;
24    }
25}
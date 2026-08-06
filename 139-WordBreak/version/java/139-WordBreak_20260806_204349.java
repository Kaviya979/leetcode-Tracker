// Last updated: 06/08/2026, 20:43:49
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        // Start is blocked
9        if (obstacleGrid[0][0] == 1)
10            return 0;
11
12        dp[0][0] = 1;
13
14        for (int i = 0; i < m; i++) {
15            for (int j = 0; j < n; j++) {
16
17                if (obstacleGrid[i][j] == 1) {
18                    dp[i][j] = 0;
19                } else {
20                    if (i > 0)
21                        dp[i][j] += dp[i - 1][j];
22
23                    if (j > 0)
24                        dp[i][j] += dp[i][j - 1];
25                }
26            }
27        }
28
29        return dp[m - 1][n - 1];
30    }
31}
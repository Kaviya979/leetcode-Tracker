// Last updated: 06/08/2026, 21:07:33
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3
4        int m = dungeon.length;
5        int n = dungeon[0].length;
6
7        int[][] dp = new int[m][n];
8
9        // Princess cell
10        dp[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
11
12        // Last column
13        for (int i = m - 2; i >= 0; i--) {
14            dp[i][n - 1] = Math.max(1,
15                    dp[i + 1][n - 1] - dungeon[i][n - 1]);
16        }
17
18        // Last row
19        for (int j = n - 2; j >= 0; j--) {
20            dp[m - 1][j] = Math.max(1,
21                    dp[m - 1][j + 1] - dungeon[m - 1][j]);
22        }
23
24        // Remaining cells
25        for (int i = m - 2; i >= 0; i--) {
26            for (int j = n - 2; j >= 0; j--) {
27
28                int need = Math.min(dp[i + 1][j], dp[i][j + 1]);
29
30                dp[i][j] = Math.max(1, need - dungeon[i][j]);
31            }
32        }
33
34        return dp[0][0];
35    }
36}
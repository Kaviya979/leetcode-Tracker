// Last updated: 28/07/2026, 22:10:04
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3
4        int m = s1.length();
5        int n = s2.length();
6
7        int[][] dp = new int[m + 1][n + 1];
8
9
10        // If s2 is empty, delete all s1 characters
11        for(int i = 1; i <= m; i++) {
12            dp[i][0] = dp[i-1][0] + s1.charAt(i-1);
13        }
14
15
16        // If s1 is empty, delete all s2 characters
17        for(int j = 1; j <= n; j++) {
18            dp[0][j] = dp[0][j-1] + s2.charAt(j-1);
19        }
20
21
22        for(int i = 1; i <= m; i++) {
23
24            for(int j = 1; j <= n; j++) {
25
26                if(s1.charAt(i-1) == s2.charAt(j-1)) {
27
28                    dp[i][j] = dp[i-1][j-1];
29
30                } else {
31
32                    dp[i][j] = Math.min(
33                        dp[i-1][j] + s1.charAt(i-1),
34                        dp[i][j-1] + s2.charAt(j-1)
35                    );
36                }
37            }
38        }
39
40        return dp[m][n];
41    }
42}
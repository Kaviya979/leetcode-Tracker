// Last updated: 09/07/2026, 22:00:32
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        
4        int n = triangle.size();
5
6        // Create DP array with last row values
7        int[] dp = new int[n];
8
9        for (int i = 0; i < n; i++) {
10            dp[i] = triangle.get(n - 1).get(i);
11        }
12
13        // Bottom-up calculation
14        for (int i = n - 2; i >= 0; i--) {
15            for (int j = 0; j <= i; j++) {
16                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
17            }
18        }
19
20        return dp[0];
21    }
22}
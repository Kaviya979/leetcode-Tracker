// Last updated: 17/07/2026, 10:14:39
1class Solution {
2    public int numDecodings(String s) {
3
4        if (s.length() == 0 || s.charAt(0) == '0')
5            return 0;
6
7        int n = s.length();
8        int[] dp = new int[n + 1];
9
10        dp[0] = 1;
11        dp[1] = 1;
12
13        for (int i = 2; i <= n; i++) {
14
15            int oneDigit = s.charAt(i - 1) - '0';
16            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
17
18            if (oneDigit >= 1)
19                dp[i] += dp[i - 1];
20
21            if (twoDigit >= 10 && twoDigit <= 26)
22                dp[i] += dp[i - 2];
23        }
24
25        return dp[n];
26    }
27}
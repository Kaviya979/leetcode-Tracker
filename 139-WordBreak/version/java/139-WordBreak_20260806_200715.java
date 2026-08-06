// Last updated: 06/08/2026, 20:07:15
1import java.util.*;
2
3class Solution {
4    public boolean wordBreak(String s, List<String> wordDict) {
5
6        Set<String> set = new HashSet<>(wordDict);
7
8        boolean[] dp = new boolean[s.length() + 1];
9        dp[0] = true;
10
11        for (int i = 1; i <= s.length(); i++) {
12            for (int j = 0; j < i; j++) {
13                if (dp[j] && set.contains(s.substring(j, i))) {
14                    dp[i] = true;
15                    break;
16                }
17            }
18        }
19
20        return dp[s.length()];
21    }
22}
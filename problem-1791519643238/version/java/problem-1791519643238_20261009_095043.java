// Last updated: 09/10/2026, 09:50:43
1
2class Solution {
3    public boolean isSubsequence(String s, String t) {
4        int i = 0;
5        int j = 0;
6
7        while (i < s.length() && j < t.length()) {
8            if (s.charAt(i) == t.charAt(j)) {
9                i++;
10            }
11            j++;
12        }
13
14        return i == s.length();
15    }
16}
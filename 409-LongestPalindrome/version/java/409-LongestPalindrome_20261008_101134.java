// Last updated: 08/10/2026, 10:11:34
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] count = new int[128];
4
5        for (char c : s.toCharArray()) {
6            count[c]++;
7        }
8
9        int length = 0;
10        boolean odd = false;
11
12        for (int n : count) {
13            length += (n / 2) * 2;
14
15            if (n % 2 == 1) {
16                odd = true;
17            }
18        }
19
20        if (odd) {
21            length++;
22        }
23
24        return length;
25    }
26}
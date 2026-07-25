// Last updated: 25/07/2026, 16:26:08
1class Solution {
2    public int[] divisibilityArray(String word, int m) {
3
4        int n = word.length();
5        int[] div = new int[n];
6
7        long remainder = 0;
8
9        for (int i = 0; i < n; i++) {
10
11            int digit = word.charAt(i) - '0';
12
13            remainder = (remainder * 10 + digit) % m;
14
15            if (remainder == 0) {
16                div[i] = 1;
17            } else {
18                div[i] = 0;
19            }
20        }
21
22        return div;
23    }
24}
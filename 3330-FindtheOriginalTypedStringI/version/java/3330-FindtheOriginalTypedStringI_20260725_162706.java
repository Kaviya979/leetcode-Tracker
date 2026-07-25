// Last updated: 25/07/2026, 16:27:06
1class Solution {
2    public int possibleStringCount(String word) {
3
4        int count = 1;
5        int n = word.length();
6
7        int i = 0;
8
9        while (i < n) {
10
11            int j = i;
12
13            while (j < n && word.charAt(j) == word.charAt(i)) {
14                j++;
15            }
16
17            int length = j - i;
18
19            count += (length - 1);
20
21            i = j;
22        }
23
24        return count;
25    }
26}
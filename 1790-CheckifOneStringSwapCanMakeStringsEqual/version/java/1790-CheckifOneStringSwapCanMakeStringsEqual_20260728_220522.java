// Last updated: 28/07/2026, 22:05:22
1class Solution {
2    public boolean areAlmostEqual(String s1, String s2) {
3
4        if(s1.length() != s2.length())
5            return false;
6
7        int first = -1;
8        int second = -1;
9        int diff = 0;
10
11        for(int i = 0; i < s1.length(); i++) {
12
13            if(s1.charAt(i) != s2.charAt(i)) {
14
15                diff++;
16
17                if(first == -1)
18                    first = i;
19                else
20                    second = i;
21            }
22        }
23
24        // Already equal
25        if(diff == 0)
26            return true;
27
28
29        // Need exactly two mismatches
30        if(diff == 2) {
31
32            return s1.charAt(first) == s2.charAt(second)
33                && s1.charAt(second) == s2.charAt(first);
34        }
35
36        return false;
37    }
38}
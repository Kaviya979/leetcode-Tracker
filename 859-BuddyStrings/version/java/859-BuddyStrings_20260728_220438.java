// Last updated: 28/07/2026, 22:04:38
1class Solution {
2    public boolean buddyStrings(String s, String goal) {
3
4        if(s.length() != goal.length())
5            return false;
6
7        int first = -1;
8        int second = -1;
9        int diff = 0;
10
11        for(int i = 0; i < s.length(); i++) {
12
13            if(s.charAt(i) != goal.charAt(i)) {
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
24        // Same string case
25        if(diff == 0) {
26
27            int[] count = new int[26];
28
29            for(char c : s.toCharArray()) {
30                count[c - 'a']++;
31
32                if(count[c - 'a'] >= 2)
33                    return true;
34            }
35
36            return false;
37        }
38
39
40        // Need exactly two mismatches
41        if(diff == 2) {
42
43            return s.charAt(first) == goal.charAt(second)
44                && s.charAt(second) == goal.charAt(first);
45        }
46
47        return false;
48    }
49}
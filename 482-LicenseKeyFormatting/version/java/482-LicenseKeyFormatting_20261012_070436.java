// Last updated: 12/10/2026, 07:04:36
1
2class Solution {
3    public String licenseKeyFormatting(String s, int k) {
4        StringBuilder result = new StringBuilder();
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7            char ch = s.charAt(i);
8
9            if (ch == '-') {
10                continue;
11            }
12
13            result.append(Character.toUpperCase(ch));
14
15            if (result.length() % (k + 1) == k) {
16                result.append('-');
17            }
18        }
19
20        if (result.length() > 0 && result.charAt(result.length() - 1) == '-') {
21            result.deleteCharAt(result.length() - 1);
22        }
23
24        return result.reverse().toString();
25    }
26}
27
// Last updated: 30/07/2026, 15:04:58
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        Set<String> seen = new HashSet<>();
4        Set<String> repeated = new HashSet<>();
5
6        for (int i = 0; i <= s.length() - 10; i++) {
7            String sub = s.substring(i, i + 10);
8
9            if (!seen.add(sub)) {
10                repeated.add(sub);
11            }
12        }
13
14        return new ArrayList<>(repeated);
15    }
16}
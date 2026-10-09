// Last updated: 09/10/2026, 20:40:47
1
2class Solution {
3    public boolean canConstruct(String ransomNote, String magazine) {
4        int[] count = new int[26];
5
6        for (char c : magazine.toCharArray()) {
7            count[c - 'a']++;
8        }
9
10        for (char c : ransomNote.toCharArray()) {
11            count[c - 'a']--;
12
13            if (count[c - 'a'] < 0) {
14                return false;
15            }
16        }
17
18        return true;
19    }
20}
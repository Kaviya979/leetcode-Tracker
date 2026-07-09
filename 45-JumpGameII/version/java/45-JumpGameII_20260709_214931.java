// Last updated: 09/07/2026, 21:49:31
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        
6        HashMap<String, List<String>> map = new HashMap<>();
7
8        for (String s : strs) {
9            // Convert string to character array
10            char[] chars = s.toCharArray();
11
12            // Sort characters
13            Arrays.sort(chars);
14
15            // Create key
16            String key = new String(chars);
17
18            // Add string to corresponding group
19            if (!map.containsKey(key)) {
20                map.put(key, new ArrayList<>());
21            }
22
23            map.get(key).add(s);
24        }
25
26        return new ArrayList<>(map.values());
27    }
28}
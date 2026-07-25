// Last updated: 25/07/2026, 16:28:56
1import java.util.*;
2
3class Solution {
4    public List<String> stringSequence(String target) {
5
6        List<String> result = new ArrayList<>();
7        StringBuilder current = new StringBuilder();
8
9        for (char ch : target.toCharArray()) {
10
11            // Press Key 1: append 'a'
12            current.append('a');
13            result.add(current.toString());
14
15            // Press Key 2 until the last character becomes ch
16            while (current.charAt(current.length() - 1) != ch) {
17                char last = current.charAt(current.length() - 1);
18                current.setCharAt(current.length() - 1, (char)(last + 1));
19                result.add(current.toString());
20            }
21        }
22
23        return result;
24    }
25}
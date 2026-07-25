// Last updated: 25/07/2026, 16:28:06
1import java.util.*;
2
3class Solution {
4    public String[] findWords(String[] words) {
5
6        String row1 = "qwertyuiop";
7        String row2 = "asdfghjkl";
8        String row3 = "zxcvbnm";
9
10        List<String> result = new ArrayList<>();
11
12        for (String word : words) {
13
14            String lower = word.toLowerCase();
15
16            String row;
17
18            if (row1.indexOf(lower.charAt(0)) != -1) {
19                row = row1;
20            } else if (row2.indexOf(lower.charAt(0)) != -1) {
21                row = row2;
22            } else {
23                row = row3;
24            }
25
26            boolean valid = true;
27
28            for (char ch : lower.toCharArray()) {
29                if (row.indexOf(ch) == -1) {
30                    valid = false;
31                    break;
32                }
33            }
34
35            if (valid) {
36                result.add(word);
37            }
38        }
39
40        return result.toArray(new String[0]);
41    }
42}
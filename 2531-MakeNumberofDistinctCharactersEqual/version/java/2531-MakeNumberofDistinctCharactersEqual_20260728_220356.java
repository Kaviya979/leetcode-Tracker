// Last updated: 28/07/2026, 22:03:56
1class Solution {
2    public boolean isItPossible(String word1, String word2) {
3
4        int[] count1 = new int[26];
5        int[] count2 = new int[26];
6
7        for(char c : word1.toCharArray()) {
8            count1[c - 'a']++;
9        }
10
11        for(char c : word2.toCharArray()) {
12            count2[c - 'a']++;
13        }
14
15        // Try all possible swaps
16        for(int i = 0; i < 26; i++) {
17
18            if(count1[i] == 0) continue;
19
20            for(int j = 0; j < 26; j++) {
21
22                if(count2[j] == 0) continue;
23
24                // perform swap
25                count1[i]--;
26                count2[j]--;
27
28                count1[j]++;
29                count2[i]++;
30
31                int distinct1 = 0;
32                int distinct2 = 0;
33
34                for(int k = 0; k < 26; k++) {
35                    if(count1[k] > 0)
36                        distinct1++;
37
38                    if(count2[k] > 0)
39                        distinct2++;
40                }
41
42                if(distinct1 == distinct2)
43                    return true;
44
45                // undo swap
46                count1[j]--;
47                count2[i]--;
48
49                count1[i]++;
50                count2[j]++;
51            }
52        }
53
54        return false;
55    }
56}
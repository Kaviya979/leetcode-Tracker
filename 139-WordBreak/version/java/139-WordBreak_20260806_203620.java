// Last updated: 06/08/2026, 20:36:20
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3        List<Integer> result = new ArrayList<>();
4
5        if (s == null || s.length() == 0 || words.length == 0)
6            return result;
7
8        int wordLen = words[0].length();
9        int wordCount = words.length;
10        int totalLen = wordLen * wordCount;
11
12        if (s.length() < totalLen)
13            return result;
14
15        Map<String, Integer> wordMap = new HashMap<>();
16        for (String word : words) {
17            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
18        }
19
20        for (int i = 0; i < wordLen; i++) {
21            int left = i;
22            int count = 0;
23            Map<String, Integer> window = new HashMap<>();
24
25            for (int j = i; j + wordLen <= s.length(); j += wordLen) {
26                String word = s.substring(j, j + wordLen);
27
28                if (wordMap.containsKey(word)) {
29                    window.put(word, window.getOrDefault(word, 0) + 1);
30                    count++;
31
32                    while (window.get(word) > wordMap.get(word)) {
33                        String leftWord = s.substring(left, left + wordLen);
34                        window.put(leftWord, window.get(leftWord) - 1);
35                        left += wordLen;
36                        count--;
37                    }
38
39                    if (count == wordCount) {
40                        result.add(left);
41
42                        String leftWord = s.substring(left, left + wordLen);
43                        window.put(leftWord, window.get(leftWord) - 1);
44                        left += wordLen;
45                        count--;
46                    }
47                } else {
48                    window.clear();
49                    count = 0;
50                    left = j + wordLen;
51                }
52            }
53        }
54
55        return result;
56    }
57}
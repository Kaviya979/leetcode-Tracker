// Last updated: 06/08/2026, 20:34:20
1class Solution {
2    public int divide(int dividend, int divisor) {
3
4        // Handle overflow
5        if (dividend == Integer.MIN_VALUE && divisor == -1) {
6            return Integer.MAX_VALUE;
7        }
8
9        // Determine sign
10        boolean negative = (dividend < 0) ^ (divisor < 0);
11
12        // Convert to long to avoid overflow
13        long dvd = Math.abs((long) dividend);
14        long dvs = Math.abs((long) divisor);
15
16        int result = 0;
17
18        while (dvd >= dvs) {
19            long temp = dvs;
20            int multiple = 1;
21
22            while (dvd >= (temp << 1)) {
23                temp <<= 1;
24                multiple <<= 1;
25            }
26
27            dvd -= temp;
28            result += multiple;
29        }
30
31        return negative ? -result : result;
32    }
33}
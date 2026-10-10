// Last updated: 10/10/2026, 15:02:10
1
2class Solution {
3    public String convertToBase7(int num) {
4        if (num == 0) {
5            return "0";
6        }
7
8        boolean negative = num < 0;
9        num = Math.abs(num);
10
11        StringBuilder result = new StringBuilder();
12
13        while (num > 0) {
14            int remainder = num % 7;
15            result.append(remainder);
16            num = num / 7;
17        }
18
19        if (negative) {
20            result.append("-");
21        }
22
23        return result.reverse().toString();
24    }
25}
26
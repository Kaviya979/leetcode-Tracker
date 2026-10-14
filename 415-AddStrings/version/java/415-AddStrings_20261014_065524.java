// Last updated: 14/10/2026, 06:55:24
1
2class Solution {
3    public String addStrings(String num1, String num2) {
4        StringBuilder result = new StringBuilder();
5
6        int i = num1.length() - 1;
7        int j = num2.length() - 1;
8        int carry = 0;
9
10        while (i >= 0 || j >= 0 || carry > 0) {
11            int sum = carry;
12
13            if (i >= 0) {
14                sum += num1.charAt(i) - '0';
15                i--;
16            }
17
18            if (j >= 0) {
19                sum += num2.charAt(j) - '0';
20                j--;
21            }
22
23            result.append(sum % 10);
24            carry = sum / 10;
25        }
26
27        return result.reverse().toString();
28    }
29}
30
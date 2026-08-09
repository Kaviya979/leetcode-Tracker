// Last updated: 09/08/2026, 09:09:26
1import java.util.*;
2class Solution {
3    public double minPrice(int[] prices, int[] discounts) {
4        Arrays.sort(prices);
5        Arrays.sort(discounts);
6        int n = prices.length;
7        int m = discounts.length;
8        double total = 0;
9        int i = n - 1;
10        int j = m - 1;
11        while(i >= 0 && j >= 0){
12            total += prices[i] * (100.0 - discounts[j]) / 100.0;
13            i--;
14            j--;
15        }
16        while(i >= 0){
17            total += prices[i];
18            i--;
19        }
20        return total;
21        }
22    }
23
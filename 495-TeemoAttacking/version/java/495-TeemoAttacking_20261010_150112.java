// Last updated: 10/10/2026, 15:01:12
1
2class Solution {
3    public int findPoisonedDuration(int[] timeSeries, int duration) {
4        int total = 0;
5
6        for (int i = 0; i < timeSeries.length - 1; i++) {
7            total += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
8        }
9
10        total += duration;
11
12        return total;
13    }
14}
15
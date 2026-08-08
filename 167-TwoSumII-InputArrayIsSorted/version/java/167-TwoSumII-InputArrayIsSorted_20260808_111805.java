// Last updated: 08/08/2026, 11:18:05
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        int left = 0;
5        int right = numbers.length - 1;
6
7        while (left < right) {
8            int sum = numbers[left] + numbers[right];
9
10            if (sum == target) {
11                return new int[]{left + 1, right + 1};
12            }
13            else if (sum < target) {
14                left++;
15            }
16            else {
17                right--;
18            }
19        }
20
21        return new int[]{};
22    }
23}
24
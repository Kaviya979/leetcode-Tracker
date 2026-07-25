// Last updated: 25/07/2026, 16:21:59
1class Solution {
2
3    public int getMinSwaps(String num, int k) {
4
5        char[] original = num.toCharArray();
6        char[] target = num.toCharArray();
7
8        // Step 1: Generate kth next permutation
9        while (k-- > 0) {
10            nextPermutation(target);
11        }
12
13        // Step 2: Count adjacent swaps
14        int swaps = 0;
15
16        for (int i = 0; i < original.length; i++) {
17
18            if (original[i] == target[i])
19                continue;
20
21            int j = i + 1;
22
23            while (target[j] != original[i]) {
24                j++;
25            }
26
27            while (j > i) {
28                char temp = target[j];
29                target[j] = target[j - 1];
30                target[j - 1] = temp;
31
32                swaps++;
33                j--;
34            }
35        }
36
37        return swaps;
38    }
39
40    private void nextPermutation(char[] nums) {
41
42        int i = nums.length - 2;
43
44        while (i >= 0 && nums[i] >= nums[i + 1]) {
45            i--;
46        }
47
48        if (i >= 0) {
49
50            int j = nums.length - 1;
51
52            while (nums[j] <= nums[i]) {
53                j--;
54            }
55
56            swap(nums, i, j);
57        }
58
59        reverse(nums, i + 1, nums.length - 1);
60    }
61
62    private void swap(char[] nums, int i, int j) {
63        char temp = nums[i];
64        nums[i] = nums[j];
65        nums[j] = temp;
66    }
67
68    private void reverse(char[] nums, int left, int right) {
69
70        while (left < right) {
71            swap(nums, left, right);
72            left++;
73            right--;
74        }
75    }
76}
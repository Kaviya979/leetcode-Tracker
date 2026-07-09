// Last updated: 09/07/2026, 21:50:23
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5
6        List<Integer> result = new ArrayList<>();
7
8        int top = 0;
9        int bottom = matrix.length - 1;
10        int left = 0;
11        int right = matrix[0].length - 1;
12
13        while (top <= bottom && left <= right) {
14
15            // Traverse top row
16            for (int i = left; i <= right; i++) {
17                result.add(matrix[top][i]);
18            }
19            top++;
20
21            // Traverse right column
22            for (int i = top; i <= bottom; i++) {
23                result.add(matrix[i][right]);
24            }
25            right--;
26
27            // Traverse bottom row
28            if (top <= bottom) {
29                for (int i = right; i >= left; i--) {
30                    result.add(matrix[bottom][i]);
31                }
32                bottom--;
33            }
34
35            // Traverse left column
36            if (left <= right) {
37                for (int i = bottom; i >= top; i--) {
38                    result.add(matrix[i][left]);
39                }
40                left++;
41            }
42        }
43
44        return result;
45    }
46}
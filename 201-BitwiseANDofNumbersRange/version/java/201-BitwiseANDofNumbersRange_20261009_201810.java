// Last updated: 09/10/2026, 20:18:10
1
2class Solution {
3    public int rangeBitwiseAnd(int left, int right) {
4        while (left < right) {
5            right = right & (right - 1);
6        }
7        return right;
8    }
9}
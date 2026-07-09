// Last updated: 09/07/2026, 15:08:18
class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 &&
               (n & (n - 1)) == 0 &&
               (n & 0x55555555) != 0;
    }
}
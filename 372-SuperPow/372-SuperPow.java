// Last updated: 09/07/2026, 15:08:12
class Solution {

    static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int result = 1;

        a %= MOD;

        for (int digit : b) {
            result = pow(result, 10);
            result = (result * pow(a, digit)) % MOD;
        }

        return result;
    }

    private int pow(int x, int n) {
        int ans = 1;
        x %= MOD;

        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (ans * x) % MOD;
            }
            x = (x * x) % MOD;
            n >>= 1;
        }

        return ans;
    }
}
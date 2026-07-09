// Last updated: 09/07/2026, 15:05:32
class Solution {
    public int mirrorDistance(int n) {
      int original = n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
       return Math.abs(original-reverse);
    }
}
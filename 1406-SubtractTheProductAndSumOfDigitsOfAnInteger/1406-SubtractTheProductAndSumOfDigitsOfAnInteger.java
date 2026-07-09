// Last updated: 09/07/2026, 15:06:45
class Solution {
    public int subtractProductAndSum(int n) {
      int sum =0,mul=1;
      while(n!=0){
        sum+=n%10;
        mul*=n%10;
        n/=10;
      }
      return mul-sum;
    }
}
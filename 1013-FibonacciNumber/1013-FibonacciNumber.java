// Last updated: 09/07/2026, 15:07:15
class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
    int prev1=0,prev2=1,next=0;
    for(int i=1;i<n;i++){
     next = prev1+prev2;
    prev1 = prev2;
    prev2 = next;
    }
    return next;
  }
}
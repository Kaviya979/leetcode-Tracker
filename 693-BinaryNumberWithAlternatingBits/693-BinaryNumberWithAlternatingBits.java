// Last updated: 09/07/2026, 15:07:28
class Solution {
    public boolean hasAlternatingBits(int n) {
   int x=n>>1;
   while(n!=0){
   if((n&1) == (x&1)){
    break;
   }
     n>>=1;
     x>>=1;
    }
   return n==0?true:false;
    }
}
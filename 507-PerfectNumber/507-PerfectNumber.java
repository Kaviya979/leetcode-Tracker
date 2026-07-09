// Last updated: 09/07/2026, 15:07:49
class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
        
    }
    return sum==n;
  }
}
            
// Last updated: 09/07/2026, 15:06:25
class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n % i ==0 ){
                count++;
            }
        }
        if(count==3){
        return true;
        }
        return false;
    }
    
}
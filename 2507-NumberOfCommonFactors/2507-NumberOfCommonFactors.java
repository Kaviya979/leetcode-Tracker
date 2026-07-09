// Last updated: 09/07/2026, 15:06:15
class Solution {
    public int commonFactors(int a, int b) {
        int min=a<b?a:b;
        int count=0;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
            count++;
        }
        return count;
    }
}
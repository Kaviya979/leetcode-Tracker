// Last updated: 09/07/2026, 15:07:55
class Solution {
    public int hammingDistance(int x, int y) {
        int xOr=x^y;
        int count=0;
        while(xOr!=0){
        xOr=(xOr&(xOr-1));
        count++;
     }
         return count;
   }
}

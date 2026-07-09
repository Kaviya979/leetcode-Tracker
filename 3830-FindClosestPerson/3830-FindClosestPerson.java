// Last updated: 09/07/2026, 15:05:33
class Solution {
    public int findClosest(int x, int y, int z) {
         int a1 = Math.abs(z-x);
         int a2 = Math.abs(y-z);
         if(a1>a2) {
            return 2;
         } 
         else if(a1<a2){
            return 1;

         }
         
         return 0;
    }
}
// Last updated: 09/07/2026, 15:07:58
class Solution {
    public int arrangeCoins(int n) {
      int row = 0;
      while(n>=row+1){
      row++;
      n-=row;
      }
      return row;
    }
}

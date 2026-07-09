// Last updated: 09/07/2026, 15:06:52
class Solution {
    public int minCostToMoveChips(int[] position) {
  int even = 0;
  int odd=0;
  for(int x:position){
    if(x%2==0)even++;
        else odd++;
    }
    return even<odd?even:odd;
  }

 }

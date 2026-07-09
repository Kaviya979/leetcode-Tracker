// Last updated: 09/07/2026, 15:06:33
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        Arrays.sort(boxTypes,(a,b) -> b [1] - a[1]);
          for(int i = 0;i < boxTypes.length; i++){
            int num = boxTypes[i][0];
            int q = boxTypes[i][1];
            int boxtake = Math.min(num,truckSize);
            truckSize -= boxtake;
            ans += boxtake * q;
          }
              return ans;
    }
}
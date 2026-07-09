// Last updated: 09/07/2026, 15:10:56
class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b) -> a[0] -b [0]) ;
      List <int[]> merged = new ArrayList<>();
      int[] prev = intervals[0];

      for(int i = 1; i < intervals.length; i++){
        if(intervals[i][0] <= prev[1]){
            prev[1] = Math.max(prev[1] , intervals[i][1]);
        }
        else{
            merged.add(prev);
            prev = intervals[i];
        }
      }
      merged.add(prev);
      return merged.toArray(new int[merged.size()][]);
    }
}
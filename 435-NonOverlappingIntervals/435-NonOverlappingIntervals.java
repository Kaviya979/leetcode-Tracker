// Last updated: 09/07/2026, 15:08:00
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int c = 0;
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0]<end){
            c = c + 1;

        }
        else{
            end = intervals[i][1];
        }
    }
    return c;
    }
}
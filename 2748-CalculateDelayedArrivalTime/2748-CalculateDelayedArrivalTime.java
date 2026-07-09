// Last updated: 09/07/2026, 15:05:57
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int n = arrivalTime + delayedTime;
        if(n<24){
            return n;
       }
       else{
        return n%24;
       }
        
    }
}
// Last updated: 09/07/2026, 15:05:50
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int icount = 0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                icount++;

            }
        }
            return icount;
          }

    }
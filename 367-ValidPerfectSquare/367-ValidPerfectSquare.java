// Last updated: 09/07/2026, 15:08:14
class Solution {
    public boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;
        while(left <= right){
            long mid = (left +right)/2;
            long s = (long) mid*mid;
            if(s == num){
                return true;
            }
            else if (s < num){
                left = mid + 1;
            }
            else{
                right = mid - 1;

            }
        }
            return false;
            }
           
        }



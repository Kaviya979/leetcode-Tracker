// Last updated: 09/07/2026, 15:05:45
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
       int sum=0;
       int t =x;
       while(x!=0){
        sum+=x%10;
        x/=10;

       }
       return t%sum==0?sum:-1;

    }
}